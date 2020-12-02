package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class SignInPage extends Utility {

    By signInBtn = By.xpath("//div[@class='header_bar-sign_in']//span[contains(text(),'Sign in / sign up')]");
    By emailField = By.xpath("//input[@id='login-email']");
    By passwordField = By.xpath("//input[@id='login-password']");
    By submitBtn = By.xpath("//tbody//button[@class='btn  regular-button  submit']");

    //This method clicks on Sign In button on HomePage
    public void clickOnLoginBtn() {
        Reporter.log("Clicks on Sign in Button " + signInBtn.toString() + "<br>");
        clickOnElement(signInBtn);
    }

    //This method sends text to Email Field
    public void sendTextToEmailField() {
        Reporter.log("send text to email Field " + emailField.toString() + "<br>");
        clickOnElement(emailField);
        sendTextToElement(emailField, randomEmail());
    }

    // This method sends text to Password Field
    public void sendTextToPasswordField() {
        Reporter.log("send text to Passoword Field " + passwordField.toString() + "<br>");
        clickOnElement(passwordField);
        sendTextToElement(passwordField, "123456");
    }

    public void clickOnSubmitBtn() {
        Reporter.log("click on Submit button " + submitBtn.toString() + "<br>");
        clickOnElement(submitBtn);
    }


}
