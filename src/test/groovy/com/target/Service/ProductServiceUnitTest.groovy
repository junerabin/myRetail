package com.target.Service

import com.target.Model.Price
import com.target.Model.Product
import org.junit.Test
import org.mockito.InjectMocks
import org.mockito.Mock

class ProductServiceUnitTest extends GroovyTestCase {
    public static final int ID = 51696549
    public static final String EXPECTED_PRODUCT_NAME = "Blue Novelty Sabine Reinhart Christmas Kitchen Sherpa Throw Blanket (50\"X60\") - Deny Designs&#174;"
    public static final String RETURN_PRODUCT_STRING = "{\"product\":{\"deep_red_labels\":{\"total_count\":9,\"labels\":[{\"id\":\"c3g8vn\",\"name\":\"throw blankets\",\"type\":\"Item Type\",\"priority\":0,\"count\":1},{\"id\":\"7bpd5v\",\"name\":\"Synthetic Fibers\",\"type\":\"Bedding Material\",\"priority\":30,\"count\":1},{\"id\":\"cifms6\",\"name\":\"throw\",\"type\":\"size\",\"priority\":0,\"count\":1},{\"id\":\"w8a3en\",\"name\":\"multicolored\",\"type\":\"color\",\"priority\":0,\"count\":1},{\"id\":\"37fr1v\",\"name\":\"food\",\"type\":\"Pattern\",\"priority\":0,\"count\":1},{\"id\":\"h5bxxw\",\"name\":\"blankets and throws\",\"type\":\"merchandise type\",\"priority\":0,\"count\":1},{\"id\":\"jzndlk\",\"name\":\"green\",\"type\":\"color\",\"priority\":0,\"count\":1},{\"id\":\"ruuf9x\",\"name\":\"throw\",\"type\":\"ABN Size\",\"priority\":0,\"count\":1},{\"id\":\"rv3fdu\",\"name\":\"SA\",\"type\":\"relationship type\",\"priority\":0,\"count\":1}]},\"available_to_promise_network\":{\"product_id\":\"51696549\",\"id_type\":\"TCIN\",\"available_to_promise_quantity\":9999.0,\"availability\":\"AVAILABLE\",\"online_available_to_promise_quantity\":9999.0,\"stores_available_to_promise_quantity\":0.0,\"availability_status\":\"IN_STOCK\",\"multichannel_options\":[],\"is_infinite_inventory\":false,\"loyalty_availability_status\":\"IN_STOCK\",\"loyalty_purchase_start_date_time\":\"1970-01-01T00:00:00.000Z\",\"is_loyalty_purchase_enabled\":false,\"is_out_of_stock_in_all_store_locations\":true,\"is_out_of_stock_in_all_online_locations\":false},\"item\":{\"tcin\":\"51696549\",\"bundle_components\":{},\"dpci\":\"067-10-1197\",\"upc\":\"887522790042\",\"product_description\":{\"title\":\"Blue Novelty Sabine Reinhart Christmas Kitchen Sherpa Throw Blanket (50\\\"X60\\\") - Deny Designs&#174;\",\"downstream_description\":\"The Sabine Reinhart Christmas Kitchen Sherpa Throw Blanket by Deny Designs may be the softest blanket ever! Featuring a printed plush silky smooth top side with a fuzzy warm underside, it's the perfect blanket to snuggle up with on the couch, bed, and anywhere in between! This Sabine Reinhart Christmas Kitchen Sherpa Throw Blanket by Deny Designs is sure to be the talk of company with artwork provided by one of Deny Designs select artists. With each purchase of a Deny Designs product a portion of all sales go directly back to the artists. Supporting artist worldwide.\",\"bullet_description\":[\"<B>Dimensions (Overall):</B> 60 inches (L) x 50 inches (W)\",\"<B>Textile Material:</B> 100% Polyester\",\"<B>Pattern:</B> Printed pattern\",\"<B>Care and Cleaning:</B> Machine wash & Tumble dry\"],\"soft_bullets\":{\"title\":\"highlights\",\"bullets\":[\"The Sabine Reinhart Christmas Kitchen Sherpa Throw Blanket by Deny Designss may be the softest blanket ever!\",\"Featuring a printed plush silky smooth top side with a fuzzy warm underside, it's the perfect blanket to snuggle up with on the couch, bed, and anywhere in between!\",\"This Sabine Reinhart Christmas Kitchen Sherpa Throw Blanket by Deny Designss is sure to be the talk of company with artwork provided by one of Deny Designss select artists.\",\"With each purchase of a Deny Designss product a portion of all sales go directly back to the artists.\",\"Supporting artist worldwide.\"]}},\"buy_url\":\"https://www.target.com/p/blue-novelty-sabine-reinhart-christmas-kitchen-sherpa-throw-blanket-50-x60-deny-designs-174/-/A-51696549\",\"variation\":{\"size\":\"50X60 INCHES\",\"color\":\"Green\"},\"enrichment\":{\"images\":[{\"base_url\":\"https://target.scene7.com/is/image/Target/\",\"primary\":\"GUEST_bb5c5add-4b12-4016-851d-162118d6ea5c\",\"content_labels\":[{\"image_url\":\"GUEST_bb5c5add-4b12-4016-851d-162118d6ea5c\",\"image_labels\":[\"closeup\"]}]}],\"sales_classification_nodes\":[{\"node_id\":\"4y61q\"},{\"node_id\":\"54xqu\"},{\"node_id\":\"5xt2x\"}]},\"return_method\":\"This item can be returned to any Target store or Target.com.\",\"handling\":{\"import_designation_description\":\"Made in the USA and Imported\"},\"recall_compliance\":{\"is_product_recalled\":false},\"tax_category\":{\"tax_class\":\"G\",\"tax_code_id\":32010,\"tax_code\":\"32010\"},\"display_option\":{\"is_size_chart\":false},\"fulfillment\":{\"is_po_box_prohibited\":true,\"po_box_prohibited_message\":\"We regret that this item cannot be shipped to PO Boxes.\"},\"package_dimensions\":{\"weight\":\"3.0\",\"weight_unit_of_measure\":\"POUND\",\"width\":\"12.0\",\"depth\":\"10.0\",\"height\":\"13.0\",\"dimension_unit_of_measure\":\"INCH\"},\"environmental_segmentation\":{\"is_lead_disclosure\":false},\"manufacturer\":{},\"product_vendors\":[{\"id\":\"1315231\",\"manufacturer_style\":\"49789-SFLMED\",\"vendor_name\":\"DENY DESIGNS LLC\"}],\"product_classification\":{\"product_type\":\"535\",\"product_type_name\":\"HOME\",\"item_type_name\":\"blankets and throws\",\"item_type\":{\"category_type\":\"Item Type: Bed\",\"type\":247555,\"name\":\"throw blankets\"}},\"product_brand\":{\"brand\":\"Deny Designs\",\"manufacturer_brand\":\"Deny Designs\",\"facet_id\":\"za1n3\"},\"item_state\":\"READY_FOR_LAUNCH\",\"specifications\":[],\"attributes\":{\"gift_wrapable\":\"N\",\"has_prop65\":\"N\",\"is_hazmat\":\"N\",\"manufacturing_brand\":\"Deny Designs\",\"max_order_qty\":99,\"merch_class\":\"SOFT DECOR\",\"merch_classid\":67,\"merch_subclass\":10,\"return_method\":\"This item can be returned to any Target store or Target.com.\",\"ship_to_restriction\":\"Alaska,Hawaii,Puerto Rico (see also separate entry under PR),Guam (see also separate entry under GU),American Samoa (see also separate entry under AS),Northern Mariana Islands,United States Minor Outlying Islands,Virgin Islands, U.S.,APO/FPO\"},\"country_of_origin\":\"CN\",\"relationship_type_code\":\"Stand Alone\",\"subscription_eligible\":false,\"ribbons\":[],\"tags\":[],\"ship_to_restriction\":\"This item cannot be shipped to the following locations: Alaska, Hawaii, Puerto Rico, Guam, American Samoa, Northern Mariana Islands, United States Minor Outlying Islands, Virgin Islands, U.S., APO/FPO\",\"estore_item_status_code\":\"A\",\"is_proposition_65\":false,\"return_policies\":{\"user\":\"Regular Guest\",\"policyDays\":\"90\",\"guestMessage\":\"This item must be returned within 90 days of the ship date. See return policy for details.\"},\"gifting_enabled\":false}}}"

    @Mock
    Product product
    @Mock
    Price price
    @InjectMocks
    ProductService productService = new ProductService()

    void setUp() {
        super.setUp()
        product = new Product()
        price = new Price()
    }

    void tearDown() {
    }

    @Test
    void testGetMyRetailJSON() {
        String productString = productService.getProductString(ID)
        assertEquals(RETURN_PRODUCT_STRING, productString)
    }

    @Test
    void testProductName() {
        String productName = productService.getProductName(productService.getProductString(ID))

        assertEquals(EXPECTED_PRODUCT_NAME, productName)
    }
}