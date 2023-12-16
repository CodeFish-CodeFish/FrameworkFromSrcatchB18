package com.openmrs.stepDefinitions;

import com.openmrs.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

public class StepDefinitions {

    WebDriver driver = DriverHelper.getDriver();

    LoginPage loginPage = new LoginPage(driver);

    @Given("user is open mrs user provides their credentials")
    public void user_is_open_mrs_user_provides_their_credentials() {
        loginPage.setLoginBtn(ConfigReader.readProperty("username"), ConfigReader.readProperty("password"));
    }
    @Then("user validates title as {string} and {string}")
    public void user_validates_title_as_and(String title, String url) {
        Assert.assertEquals(title, driver.getTitle());
        Assert.assertEquals(url, driver.getCurrentUrl());
    }

    @Given("user is open mrs login page and user provides invalid credentials username as {string} and {string}")
    public void user_is_open_mrs_login_page_and_user_provides_invalid_credentials_username_as_and(String username, String password) {
        loginPage.setLoginBtn(username, password);
    }
    @Then("user validates an error message as {string}")
    public void user_validates_an_error_message_as(String errorMessage) {
        Assert.assertEquals(errorMessage, loginPage.getErrorMessage());
    }


}
