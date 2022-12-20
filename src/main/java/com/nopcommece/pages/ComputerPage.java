package com.nopcommece.pages;


import com.nopcommece.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//ul[@class ='top-menu notmobile']/li/a[@href = '/computers']")
    WebElement clickComputer;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/child::ul[1]/li/a")
    List<WebElement> topMenuList;

    @CacheLookup
    @FindBy(xpath = "//ul[@class ='top-menu notmobile']//a[@href = '/desktops']")
    WebElement clickDesktop;

    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement sort;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> listProducts;

//*******************************************************************************

    public void clickOnMenuTab(String tab) {
        for (WebElement menu : topMenuList) {
            if (menu.getText().contains(tab)) {
                log.info("Click on '" + tab + "' tab <br>");
                clickOnElement(menu);
                log.info("click On Menu Tab: " + topMenuList.toString());
                break;
            }
        }
    }

    public void clickOnComputerAndDesktop() {
        Actions actions = new Actions(driver);
        actions.moveToElement(clickComputer).moveToElement(clickDesktop).click().build().perform();
        log.info("click On Computer: " + clickComputer.toString());
        log.info("click On Desktop: " + clickDesktop.toString());

    }

    public void sortComputerDesktops(String value) {
        selectByValueFromDropDown(sort, value);
        log.info("sortComputerDesktops: " + sort.toString());
    }

    public ArrayList gettingListBeforeSorting() {
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Position");
        ArrayList<String> beforeSortingZToA = new ArrayList<>();
        for (WebElement list : listProducts) {
            beforeSortingZToA.add(list.getText());
            log.info("getting List Before Sorting: " + listProducts.toString());
        }
        return beforeSortingZToA;

    }

    public ArrayList gettingListOfProduct() {
        ArrayList<String> sortedList = new ArrayList<>();
        for (WebElement list : listProducts) {
            sortedList.add(list.getText());
            log.info("getting List Before Sorting: " + listProducts.toString());
        }
        return sortedList;
    }
}

