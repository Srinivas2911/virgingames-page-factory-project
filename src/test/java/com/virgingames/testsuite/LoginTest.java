package com.virgingames.testsuite;

/*
Created by SP
*/

import com.virgingames.pages.HomePage;
import com.virgingames.pages.LoginPage;
import com.virgingames.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTest extends TestBase {

    // Before methods - create a setUpMethod for the object for the HomePage/Login Page

    HomePage homePage;
    LoginPage loginPage;

    // invalid details for use in the class
    String username = "Roger123@gmail.com";
    String password = "Roger1980";

    //null username
    String username1 = " ";

    // null password
    String password1 = " ";

    @BeforeMethod
    public void setUpMethod(){
        homePage = new HomePage();
        loginPage = new LoginPage();
    }

    @Test
    public void userShouldNavigateToLoginPage(){
        homePage.clickOnLoginLink();
        Assert.assertEquals(loginPage.getJoinNowText(),"Join Now");
    }

    @Test
    public void userShouldNotLoginWithInValidCredentials(){
        homePage.clickOnLoginLink();
        loginPage.enterUserName(username);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getErrorMessageText(),"Please try again, your username/email or password has not been recognised");
    }

    @Test
    public void userShouldNotLoginWithNullUsername(){
        homePage.clickOnLoginLink();
        loginPage.enterUserName(username1);
        loginPage.enterPassword(password);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getErrorMessageText(),"Your username/email must be 4 to 60 characters long");
    }

    @Test
    public void userShouldNotLoginWithNullUsernameAndPassword(){
        homePage.clickOnLoginLink();
        loginPage.enterUserName(username1);
        loginPage.enterPassword(password1);
        loginPage.clickOnLoginButton();
        Assert.assertEquals(loginPage.getErrorMessageText(),"Please try again, your username/email or password has not been recognised");
    }
}
