package com.nopcommece.pages;

import com.nopcommece.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

public class ElectronicsPage extends Utility {
    private static final Logger log = LogManager.getLogger(ElectronicsPage.class.getName());


    @CacheLookup
    By electronicsMenu = By.xpath("//ul[@class ='top-menu notmobile']/li/a[@href = '/electronics']");

    @CacheLookup
    By cellPhone = By.xpath("//ul[@class ='top-menu notmobile']//a[@href = '/cell-phones']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Cell phones')]")
    WebElement getTextCellPhone;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement clickOnListTab;

    @CacheLookup
    @FindBy(xpath = "//h2/a[contains(text(),'Nokia Lumia 1020')]")
    WebElement clickOnNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Nokia Lumia 1020')]")
    WebElement getTextNokiaLumia1020;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement getPriceForNokiaLumia;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_enteredQuantity_20']")
    WebElement updateQuantity;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/p[1]")
    WebElement addedToCartMessage;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement hoverToShoppingCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickOnGoToCart;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement shoppingCartMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    WebElement quantityMessage;

    @CacheLookup
    @FindBy(xpath = "(//strong[text()='$698.00'])[2]")
    WebElement total698;

    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickOnCheck;

    @CacheLookup
    @FindBy
    By clickOnCheckout = By.xpath("//button[@id='checkout']");

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeMessage;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickRegister;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyRegister;


//**********************************************************************************************

    public void clickOnElectronicsMenuAndCellPhone() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(electronicsMenu)).moveToElement(driver.findElement(cellPhone)).click().build().perform();
        log.info("clickOnElectronicsMenuAndCellPhone: " + electronicsMenu.toString());
        log.info("clickOnElectronicsMenuAndCellPhone: " + cellPhone.toString());
    }

    public String getCellPhoneText() throws InterruptedException {
        Thread.sleep(2000);
        log.info("get Cell Phone Text: " + getTextCellPhone.toString());
        return getTextFromElement(getTextCellPhone);

    }

    public void clickOnListTab() {
        clickOnElement(clickOnListTab);
        log.info("click On List Tab: " + clickOnListTab.toString());
    }

    public void clickOnNokiaLumia1020() throws InterruptedException {
        Thread.sleep(3000);
        clickOnElement(clickOnNokiaLumia1020);
        log.info("click On Nokia Lumia1020: " + clickOnNokiaLumia1020.toString());
    }

    public String getNokiaLumiaText() {
        log.info("get Nokia Lumia Text: " + clickOnNokiaLumia1020.toString());
        return getTextFromElement(clickOnNokiaLumia1020);

    }

    public String getPriceForNokiaLumia() {
        log.info("get Price For NokiaLumia: " + clickOnNokiaLumia1020.toString());
        return getTextFromElement(clickOnNokiaLumia1020);
    }

    public void updateQuantityTo2() {
        driver.findElement(By.xpath("//input[@id='product_enteredQuantity_20']")).clear();
        sendTextToElement(updateQuantity, "2");
        log.info("update Quantity To 2: " + updateQuantity.toString());
    }

    public void setAddToCart() {
        clickOnElement(addToCart);
        log.info("set Add To Cart: " + addToCart.toString());
    }

    public String getAddedToCartMessage() {
        log.info("get Added To Cart Message: " + addedToCartMessage.toString());
        return getTextFromElement(addedToCartMessage);

    }

    public void closePopUpMessage() {
        clickOnElement(closeMessage);
        log.info("close Pop Up Message: " + closeMessage.toString());
    }

    public void clickOnGoToCart() {
        mouseHoverToElement(hoverToShoppingCart);
        log.info("click On Go To Cart: " + hoverToShoppingCart.toString());
        clickOnElement(clickOnGoToCart);
        log.info("click On Go To Cart: " + clickOnGoToCart.toString());
    }

    public String shoppingCartMessage() {
        log.info("shopping Cart Message: " + shoppingCartMessage.toString());
        return getTextFromElement(shoppingCartMessage);

    }

    public String updateQuantityMessage() {
        log.info("update Quantity Message: " + quantityMessage.toString());
        return getTextFromElement(quantityMessage).substring(1, 2);
    }

    public String verifyTotal() {
        log.info("verifyT otal: " + total698.toString());
        return getTextFromElement(total698);
    }

    public void clickOnCheckBox() {
        clickOnElement(clickOnCheck);
        log.info("click On Check Box: " + clickOnCheck.toString());
    }

    public void setClickOnCheckoutBox() {
        clickOnElement(clickOnCheckout);
        log.info("set Click On Checkout Box: " + clickOnCheckout.toString());
    }

    public String verifyWelcomeText() {
        log.info("verify Welcome Text: " + welcomeMessage.toString());
        return getTextFromElement(welcomeMessage);
    }

    public void clickOnRegisterLink() {
        clickOnElement(clickRegister);
        log.info("click On Register Link: " + clickRegister.toString());
    }

    public String verifyRegisterText() {
        log.info("verify Register Text: " + verifyRegister.toString());
        return getTextFromElement(verifyRegister);
    }

    public void fillingMandatoryFields(String message, String sendText, By by) {
        sendTextToElement(by, sendText);
        log.info("filling Mandatory Fields: " + by.toString());
    }

    public void selectRadioButton(String message, By by) {
        clickOnElement(by);
        log.info("select Radio Button: " + by.toString());
    }

    public void selectByDropDown(String message, By by, String name) {
        selectByVisibleTextFromDropDown(by, name);
        log.info("select By Drop Down: " + by.toString());
    }

    public void randomEmailGeneratorAndSendText(By by, String firstName, String lastName) {
        Random randomGenerator = new Random();
        int emailNum = randomGenerator.nextInt(9999);
        String email = firstName + "." + lastName + emailNum + "@email.com";
        sendTextToElement(by, email);
        log.info("random Email Generator And Send Text: " + by.toString());
    }

    public void randomPasswordGeneratorAndSendText(By by, String lastName) {
        int passNum = 156;
        String password = lastName + "#" + passNum;
        sendTextToElement(by, password);
        log.info("random Email Generator And Send Text: " + by.toString());
    }

    public void selectPressButton(String message, By by) {
        clickOnElement(by);
        log.info("select Press Button: " + by.toString());
    }

    public String exptectedTextMessage(String expected) {
        System.out.println("Expected Text or Message is : " + expected);
        log.info("exptected Text Message: " + expected.toString());
        return expected;
    }

    public String actualTextToVerify(By by) {
        String actual = driver.findElement(by).getText();
        System.out.println("Actual Text or Message is : " + actual);
        log.info("actual Text To Verify: " + actual.toString());
        return actual;
    }

    public void selectCheckBox(String message, By by) {
        clickOnElement(by);
        log.info("select Check Box: " + by.toString());
    }

    public void verifyCurrentURL(String urlText) {
        String expectedUrl = urlText;
        String actualUrl = driver.getCurrentUrl();
        assertAssert("url not matching", expectedUrl, actualUrl);
        log.info("verify Current URL: ");
    }
    public void passAndConfirmPass(By by, String pass) {
        sendTextToElement(by, pass);
    }
}
