package com.virgingames.basepage;

/*
Created by SP
*/

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {

    /*
     * This is initialising the WebDriver as driver
     */

    public static WebDriver driver;

    /*
     * Constructor created for initialising the WebElements and configuration of log4j properties
     */

    public BasePage() {
        PageFactory.initElements(driver, this);
        PropertyConfigurator.configure(System.getProperty("user.dir") + "/src/test/java/com/virgingames/resources/propertiesfile/log4j.properties");
    }
}
