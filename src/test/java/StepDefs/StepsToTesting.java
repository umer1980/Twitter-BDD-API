package StepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;

import io.restassured.response.Response;

import org.junit.Ignore;
import org.junit.Test;
import org.hamcrest.Matchers;
import static  io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.requestSpecification;
import static org.hamcrest.Matchers.*;

public class StepsToTesting {
    String ConsumerKey = "7zmYQC0djHEpVIESgVe7gVnq0";
    String ConsumerSecret= "bV7XSwJHmYz9DufryfF2TyhOjL5PZIsnjBha9RzE0kuI37FUku";
    String AccessKey = "1204375644404174851-1qWBwet2XNyxtaD22eGNGWhTbYSSgr";
    String TokenSecret = "aa7jGhYoAXxL4haFUQHfVL0WYOpzrnvZe3sLU2QbU8UFr";
    @Given("^I am twitter page$")
    public void i_am_twitter_page()  {
        Response response = given()//.auth().oauth(ConsumerKey,ConsumerSecret,AccessKey,TokenSecret)
                .when().get("https://developer.twitter.com/en/docs/tweets/search/api-reference");


    }

    @When("^I click get method$")
    public void i_click_get_method()  {
        Response response = given()//.auth().oauth(ConsumerKey,ConsumerSecret,AccessKey,TokenSecret)
                .when().get("https://developer.twitter.com/en/docs/tweets/timelines/api-reference/get-statuses-home_timeline");

    }

    @Then("^I should be able to see the get method$")
    public void i_should_be_able_to_see_the_get_method()  {
        Response response = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessKey,TokenSecret)
                .when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");
        response.then().statusCode(200)
                .body("text",hasItems("Tweet again  message1"));
        response.prettyPrint();

    }
}
