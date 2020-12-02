package com.xcart.demostore.pages;

import com.xcart.demostore.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class HotDealPage extends Utility {
    By hotDealsTab = By.xpath("//ul/li[2]/span[contains(text(),'Hot deals')]");
    By saleLink = By.xpath("//*[@id='header-area']/div[1]/div/div[4]/div/ul/li[2]/ul/li[1]/a/span");
    By laceBootLink = By.xpath("//a[contains(text(),'Lace-Up Boots in Light Brown')]");
    By laceBootMessage = By.xpath("//h1[contains(text(),'Lace-Up Boots in Light Brown')]");



    //This method will click on sale from hot deals
    public void clickOnHotDeal() {
        Reporter.log("clicking on sale from hot deals " + hotDealsTab + "<br>");
        mouseHoverToElement(hotDealsTab);

    }


    //This method clicks on Sale Link
    public void selectSaleLink() throws InterruptedException {
        Reporter.log("Clicking on Sale Link " + saleLink.toString() + "<br>");
       // mouseHoverToElementAndClick();
        clickOnElement(saleLink);
    }

    //This method clicks on Lace Boot
    public void clickonLaceBootLink() {
        Reporter.log("Clicking on Lace Booot Link Text " + laceBootLink.toString() + "<br>");
        clickOnElement(laceBootLink);
    }

    // This method returns valued to verify text
    public String actualLaceBootMessage() {
        Reporter.log("Verifying Text Lace Boot Message " + laceBootLink.toString() + "<br>");
        return getTextFromElement(laceBootMessage);
    }

}
