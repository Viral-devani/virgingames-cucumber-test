package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Accept']")
    WebElement cookie;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Login']")
    WebElement login;

    @CacheLookup
    @FindBy(xpath = " //span[contains(text(),'Free Games')]")
    WebElement freeGames;

    public void acceptCookies() {
        clickOnElement(cookie);
        log.info("Accept cookies : " + cookie.toString());

    }

    public void clickOnFreeGamesTab() {
        clickOnElement(freeGames);
        log.info("Clicking on Free Games tab : " + freeGames.toString());
    }

}
