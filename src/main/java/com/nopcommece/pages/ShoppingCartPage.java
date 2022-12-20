package com.nopcommece.pages;

import com.nopcommece.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());


    @FindBy(xpath = "//a[@href='/computers']")
    WebElement clickComputer;

    @FindBy(xpath = "//a[@title='Show products in category Desktops']")
    WebElement clickDesktop;

    @FindBy(id = "products-orderby")
    WebElement sort;

    @FindBy(xpath = "(//button[contains(text(),'to cart')])[1]")
    WebElement clickCart;

    @FindBy(name = "product_attribute_1")
    WebElement selctComputer;


//*********************************************************************************


    public void clickOnComputerAndDesktop() {
        clickOnElement(clickComputer);
        log.info("Click On Computer: " + clickComputer.toString());
        clickOnElement(clickDesktop);
        log.info("Click On Desktop: " + clickDesktop.toString());
    }

    public void sortComputerDesktopsToAtoZ(String value) {
        selectByValueFromDropDown(sort, value);
        log.info("Sort Computer Desktops To AtoZ: " + sort.toString());
    }

    public void clickOnShoppingCart() throws InterruptedException {
        Thread.sleep(5000);
        clickOnElement(clickCart);
        log.info("Click On Shopping Cart: " + clickCart.toString());
    }

    public void selectPentiumComputer(String name) {
        selectByVisibleTextFromDropDown(selctComputer, name);
        log.info("select Pentium Computer: " + selctComputer.toString());
    }

    public void selectByDropDown(String message, By by, String name) {
        selectByVisibleTextFromDropDown(by, name);
        log.info("selectByDropDown: " + by.toString());
    }

    public String exptectedTextMessage(String expected) {
        System.out.println("Expected Text or Message is : " + expected);
        log.info("exptected Text Message: " + expected.toString());
        return expected;
    }

    public String actualTextToVerify(By by) {
        String actual = driver.findElement(by).getText();
        System.out.println("Actual Text or Message is : " + actual);
        log.info("Actual Text To Verify: " + actual.toString());
        return actual;
    }

    public void selectRadioButton(String message, By by) {
        clickOnElement(by);
        log.info("select Radio Button: " + by.toString());
    }

    public void selectCheckBox(String message, By by) {
        clickOnElement(by);
        log.info("select Check Box: " + by.toString());
    }

    public void selectPressButton(String message, By by) {
        clickOnElement(by);
        log.info("select Press Button: " + by.toString());
    }

    public void mouseHoveronShoppingCartAndClickOnGoToCart() {
        mouseHoverToElement(By.xpath("//span[contains(text(),'Shopping cart')]"));
        WebElement goToCart = driver.findElement(By.xpath("//button[contains(text(),'Go to cart')]"));
        goToCart.click();
        log.info("mouse Hover on Shopping Cart And Click On Go To Cart: ");
    }

    public void changeTheQuantityTo2AndClickOnUpdateShoppingCart() {
        clearContent(By.xpath("//input[@class='qty-input']"));
        sendTextToElement(By.xpath("//input[@class='qty-input']"), "2");
        clickOnElement(By.id("updatecart"));
        log.info("change The Quantity To 2 And Click On Update Shopping Cart: ");
    }

    public void fillingMandatoryFields(String message, String sendText, By by) {
        sendTextToElement(by, sendText);
        log.info("filling Mandatory Fields: " + by.toString());

    }

    public void randomEmailGeneratorAndSendText(By by, String firstName, String lastName) {
        Random randomGenerator = new Random();
        int emailNum = randomGenerator.nextInt(9999);
        String email = firstName + "." + lastName + emailNum + "@email.com";
        sendTextToElement(by, email);
        log.info("random Email Generator And Send Text: " + by.toString());
    }
}

