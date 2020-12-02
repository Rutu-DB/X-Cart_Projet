package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    By signInBtn = By.xpath("//div[@class='header_bar-sign_in']//span[contains(text(),'Sign in / sign up')]");
    By createNewAccountLink = By.xpath("//a[contains(@class,'popup-button default-popup-button create-account-link')]");
    By emailIdField = By.xpath("//input[@id='login']");
    By passwordField = By.xpath("//input[@id='password']");
    By confirmPasswordField = By.xpath("//input[@id='password-conf']");
    By createBtn = By.xpath("//div[@class='button submit']//button");

    //This method clicks on Sign In button on HomePage
    public void clickOnLoginBtn() {
        Reporter.log("Clicking on Sign In Button " + signInBtn.toString() + "<br>");
        clickOnElement(signInBtn);
    }

    //This method clicks on Create New Account Link
    public void clickOnCreateNewAccountLink() {
        Reporter.log("Click on Create New Account Link " + createNewAccountLink.toString() + "<br>");
        clickOnElement(createNewAccountLink);
    }

    //This method sends Key to EmailField
    public void sendTextToEmailIdField() {
        Reporter.log("Send Email Id to Field " + emailIdField.toString() + "<br>");
        clickOnElement(emailIdField);
        sendTextToElement(emailIdField, randomEmail());
    }

    //This method sends Key to Password
    public void sendTextToPasswordField() {
        Reporter.log("send Password to Password Field " + passwordField.toString() + "<br>");
        clickOnElement(passwordField);
        sendTextToElement(passwordField, "123456");
    }

    //This method sends key to Confirm Password
    public void sendTextToConfirmPasswordField() {
        Reporter.log("send confirm my password to field " + confirmPasswordField.toString() + "<br>");
        clickOnElement(confirmPasswordField);
        sendTextToElement(confirmPasswordField, "123456");
    }

    //This method clicks on Create Button
    public void clickOnCreateButton() {
        Reporter.log(" clicks on Create Button " + createBtn.toString() + "<br>");
        clickOnElement(createBtn);
    }

}
