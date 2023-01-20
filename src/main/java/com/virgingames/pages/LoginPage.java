package com.virgingames.pages;

import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {
    //logger defined to print logs
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //Constructor used to initialise the WebElements with @FindBy annotation to this page
    public LoginPage() {
        PageFactory.initElements(driver, this);

    }

    @CacheLookup
    @FindBy(xpath = "//span[@class='geetest_radar_tip_content']")
    WebElement clickToVerify;

    public void clickOnVerifyButton() {
        clickOnElement(clickToVerify);
    }
}
