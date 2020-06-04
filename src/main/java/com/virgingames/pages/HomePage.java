package com.virgingames.pages;

/*
Created by SP
*/


import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

/* Homepage extends to Utility for the methods that needs to be performed.
 * Listing all the elements through their locators
 */

public class HomePage extends Utility {

    /*
     * Private static Logger for logging the elements and methods into the log4j
     * log.info will record the info into log4j and logs
     * Reporter.addStep will record info into extent-report
     * Using selenium @Findby and initElement methods for locators/elements
     * Using "_" before locater name will help separate them from variable
     * Creating methods applicable to various locators
     */

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(linkText = "Login")
    WebElement _loginLink;

    public void verifyLoginLinkIsDisplayed() {
        Reporter.log("Verifying Login Link is Displayed on Home Page" + _loginLink.toString() + "<br>.");
        verifyThatElementIsDisplayed(_loginLink);
        log.info("Verifying Login Link is Displayed on Home Page" + _loginLink.toString());
    }

    public void clickOnLoginLink() {
        Reporter.log("Clicking on Login Link : " + _loginLink.toString()+"<br>");
        clickOnElement(_loginLink);
        log.info("Clicking on Register Link : " + _loginLink.toString());
    }



}
