package com.openmrs.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import javax.sql.rowset.BaseRowSet;

public class LoginPage {

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input[name='username']")
    WebElement username;

    @FindBy(css = "input[id='password']")
    WebElement password;

    @FindBy(css = "li[id='Inpatient Ward']")
    WebElement inpatientWard;

    @FindBy(css = "input[id='loginButton']")
    WebElement loginBtn;

    @FindBy(css = "#error-message")
    WebElement errorMessage;

    public String getErrorMessage(){
        return BrowserUtils.getText(this.errorMessage);
    }

    public void setLoginBtn(String username, String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.inpatientWard.click();
        this.loginBtn.click();
    }






}
