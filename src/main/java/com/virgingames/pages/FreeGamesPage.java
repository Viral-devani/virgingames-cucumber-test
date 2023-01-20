package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FreeGamesPage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(FreeGamesPage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page
    public FreeGamesPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'Virgin Games Daily Free Games')]")
    WebElement freeGameText;

    public String getTextMessage() {
        log.info("Verifying text message : " + freeGameText.toString());
        return getTextFromElement(freeGameText);

    }


}
