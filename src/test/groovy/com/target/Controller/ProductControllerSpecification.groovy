package com.target.Controller

import groovyx.net.http.ContentType
import groovyx.net.http.RESTClient
import spock.lang.Shared
import spock.lang.Specification;

class ProductControllerSpecification extends Specification {

    @Shared
    def client = new RESTClient("http://localhost:8080/")

    void setupSpec() {
        /* this simplifies exception handling so that Spock doesn't swallow the exception */
        client.handler.failure = client.handler.success
    }

    void cleanup() {
    }

    def 'get_product() with valid id 75519802'() {
        when:
        def response = client.get(path: 'product/75519802',
                requestContentType: ContentType.JSON,
                headers: ['Content-Type': "application/json"]
        )

        then:
        notThrown(Exception)
        response.status == 200
        response.contentType == 'application/json'
        response.data.id == 75519802
        response.data.name == "Berkley Digger Swimming 2 Hook Hard Fishing Bait Cream Pie 2.5"
        response.data.price.value == 6.95
        response.data.price.currency_code == 'USD'
    }

    def 'get_product() with valid id 52696549'() {
        when:
        def response = client.get(path: 'product/52696549',
                requestContentType: ContentType.JSON,
                headers: ['Content-Type': "application/json"]
        )

        then:
        notThrown(Exception)
        response.status == 200
        response.contentType == 'application/json'
        response.data.id == 52696549
        response.data.name == 'Skyrim VR - PlayStation VR'
        response.data.price.value == 39.99
        response.data.price.currency_code == 'USD'
    }

    def 'get_product() with valid id 13860428'() {
        when:
        def response = client.get(path: 'product/13860428',
                requestContentType: ContentType.JSON,
                headers: ['Content-Type': "application/json"]
        )

        then:
        notThrown(Exception)
        response.status == 200
        response.contentType == 'application/json'
        response.data.id == 13860428
        response.data.name == 'The Big Lebowski (Blu-ray)'
        response.data.price.value == 19.98
        response.data.price.currency_code == 'USD'
    }

    def 'get_product() with INVALID id'() {
        when:
        def response = client.get(path: 'product/111111111',
                requestContentType: ContentType.JSON,
                headers: ['Content-Type': "application/json"]
        )

        then:
        notThrown(Exception)
        response.status == 404
        response.contentType == 'application/json'
    }


    def 'set_product() value to $20.00'() {
        when:
        def response = client.put(path: 'product/13860428',
                requestContentType: ContentType.JSON,
                headers: ['Content-Type': "application/json"],
                body: "{id:13860428,name:The Big Lebowski (Blu-ray),price:{value:20.00,currency_code:USD}}"
        )

        then:
        notThrown(Exception)
        response.contentType == 'application/json'
        response.status == 200
        response.data.price.value == 20.00
    }

    def 'set_product back to $19.98'() {
        when:
        def response = client.put(path: 'product/13860428',
                requestContentType: ContentType.JSON,
                headers: ['Content-Type': "application/json"],
                body: "{id:13860428,name:The Big Lebowski (Blu-ray),price:{value:19.98,currency_code:USD}}"
        )

        then:
        notThrown(Exception)
        response.contentType == 'application/json'
        response.status == 200
        response.data.price.value == 19.98
    }
}
