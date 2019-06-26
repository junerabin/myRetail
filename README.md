# myRetail Application

![Version](https://img.shields.io/badge/version-1.0.0-blue.svg)

A Target Retail application.

## Collaboration

* myRetail is a rapidly growing company with HQ in Richmond, VA and over 200 stores across the east coast. myRetail wants to make its internal data available to any number of client devices, from myRetail.com to native mobile apps. The goal for this exercise is to create an end-to-end Proof-of-Concept for a products API, which will aggregate product data from multiple sources and return it as JSON to the caller. Your goal is to create a RESTful service that can retrieve product and price details by ID. The URL structure is up to you to define, but try to follow some sort of logical convention.

### Stakeholders

Developer/s who may be able to help you:

* [June Andrew Rabin](mailto:junerabin@gmail.edu)

## Developer setup

### Quickstart

This project uses [Gradle](http://gradle.org/) as a build system, and provides [standardized project scripts](http://githubengineering.com/scripts-to-rule-them-all/) for developers.

* `./gradlew bootRun` - Set up and run a local development environment.
    * to access the application in your local machine, go to `http://localhost:8080/`

#### myRetail database

myRetail database migrations are managed by [Cassandra](http://cassandra.apache.org/) and its Gradle plugin.

## Running tests

### Unit and integration tests

* run all validation checks: From the an IDE right click the src/test/groovy directory and choose "Run Tests"