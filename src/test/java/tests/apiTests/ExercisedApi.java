package tests.apiTests;

import base.ApiBase;
import io.restassured.response.Response;
import models.UserJson;
import org.testng.annotations.Test;

public class ExercisedApi {

    public String baseApi = "https://automationexercise.com";
    public String endPoint = "/api/productsList";

    @Test(priority = 0)
    public void testApi() {


    }
}
