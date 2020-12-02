package com.xcart.demostore.testsuite;

import com.xcart.demostore.pages.HotDealPage;
import com.xcart.demostore.pages.RegisterPage;
import com.xcart.demostore.pages.SignInPage;
import com.xcart.demostore.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AllTests extends TestBase {
    SignInPage signInPage = new SignInPage();
    RegisterPage registerPage = new RegisterPage();
    HotDealPage hotDealPage = new HotDealPage();

    @Test
    public void verifyUserCanRegisterSuccessfully() {
        registerPage.clickOnLoginBtn();
        registerPage.clickOnCreateNewAccountLink();
        registerPage.sendTextToEmailIdField();
        registerPage.sendTextToPasswordField();
        registerPage.sendTextToConfirmPasswordField();
        registerPage.clickOnCreateButton();
    }

    @Test
    public void verifySignInSuccessfullyWithValidCredentials() {
        signInPage.clickOnLoginBtn();
        signInPage.sendTextToEmailField();
        signInPage.sendTextToPasswordField();
        signInPage.clickOnSubmitBtn();
    }

    @Test
    public void verifyUserCanSucceffulyNavigateHotDealLink() throws InterruptedException {
        hotDealPage.clickOnHotDeal();
        hotDealPage.selectSaleLink();
        hotDealPage.clickonLaceBootLink();
        String actualMessage = hotDealPage.actualLaceBootMessage();
        Assert.assertEquals(actualMessage, "Lace-Up Boots in Light Brown");
    }
}
