package com.virgingames.browserselector;

/*
Created by SP
*/

import com.virgingames.basepage.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserSelector extends BasePage {

    /* projectPath as String is assigned for all project to choose local user directory
     * thru the ("user*dir")
     * Browser selector extends to BasePage in search of the Webdriver
     * Logger for logging the reports to logs/console
     *
     */

    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver.exe");
            log.info("Launching Chrome Browser");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "/drivers/geckodriver.exe");
            log.info("Launching Firefox Browser");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "/drivers/IEDriverServer.exe");
            log.info("Launching IE Browser");
            driver = new InternetExplorerDriver();
        } else {
            log.info("Wrong browser name");
            System.out.println("Wrong browser name");
        }
    }


}
