package com.nopcommece.pages;

import com.nopcommece.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    @FindBy(xpath = "//a[@class = 'ico-login']")
    WebElement loginTab;
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(name = "Password")
    WebElement passwordField;
    @FindBy(xpath = "//div/button[@class='button-1 login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    //***********************************************************************

    public String getWelcomeText() {
        String message = getTextFromElement(welcomeText);
        log.info("get Welcome Text: " + welcomeText.toString());
        return message;
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
        log.info("enter Email Id: " + emailField.toString());
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
        log.info("enterPassword: " + passwordField.toString());
    }

    public void clickOnLoginTab() {
        clickOnElement(loginTab);
        log.info("click On Login Tab: " + loginTab.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("click On Login Button: " + loginButton.toString());
    }

    public String getErrorMessage() {
        String message = getTextFromElement(errorMessage);
        log.info("get Error Message: " + errorMessage.toString());
        return message;
    }
}
