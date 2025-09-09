package com.aw;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredSampleTest {

    @Test
    public void shouldGetUsersPage2() {
        given()
            .queryParam("page", 2)
        .when()
            .get("https://reqres.in/api/users")
        .then()
            .statusCode(200)
            .body("page", equalTo(2));
    }
}


