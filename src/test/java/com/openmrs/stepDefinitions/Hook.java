package com.openmrs.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import utils.BrowserUtils;
import utils.DriverHelper;

public class Hook {

    WebDriver driver = DriverHelper.getDriver();
    @Before
    public void setDriver(){
        BrowserUtils.getURL(driver, "mrsURL");
    }

    @After
    public void tearDown(Scenario scenario){

        BrowserUtils.takeScreenshotCucumber(scenario, driver);
        driver.quit();

    }

}
