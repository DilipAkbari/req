package in.reqres.testbase

import io.restassured.RestAssured
import org.junit.BeforeClass

class TestBase {
    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://reqres.in/api";

    }


}
