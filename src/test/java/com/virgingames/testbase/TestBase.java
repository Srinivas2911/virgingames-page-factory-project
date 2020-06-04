package com.virgingames.testbase;


import com.virgingames.basepage.BasePage;
import com.virgingames.browserselector.BrowserSelector;
import com.virgingames.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    /*
     * Class extended with BasePage for the driver
     * Setting up the baseUrl and the browser fom the LoadProperty Class and the BroswerSelector Class
     */

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();


    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @BeforeMethod()
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    /*
     *The tear down method will do cleanup after running each method
     */

    @AfterMethod()
    public void tearDown() {
        driver.quit();
    }

}
