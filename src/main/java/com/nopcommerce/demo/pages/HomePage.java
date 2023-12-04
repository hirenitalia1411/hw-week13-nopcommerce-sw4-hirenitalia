package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

    /******************************** All Elements' Path on Homepage ***********************************************/

    By welcomeText = By.xpath("//h2[normalize-space()='Welcome to our store']");
    By listOfTopMenu = By.xpath("//ul[@class='top-menu notmobile']/li/a");
    By computersPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']");
    By electronicsPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Electronics']");
    By apparelPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Apparel']");
    By digitalDownloadsPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Digital downloads']");
    By booksPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Books']");
    By jewelryPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Jewelry']");
    By giftCardsPageLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Gift Cards']");
    By cellPhoneSubMenuLink = By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Cell phones']");
    By logOutButton = By.xpath("//a[normalize-space()='Log out']");

    /******************************** All Elements' Action Methods on Homepage *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public List<WebElement> getListOfTopMenu() {
       return getListOfElement(listOfTopMenu);
    }

    public void clickOnComputersMenu () {
        clickOnElement(computersPageLink);
    }

    public void mouseHoverOnElectronicsMenu () {
        mouseHoverToElement(electronicsPageLink);
    }

    public void mouseHoverAndClickOnCellPhoneSubMenu() {
        mouseHoverToElementAndClick(cellPhoneSubMenuLink);
    }

    public void clickOnElectronicsMenu () {
        clickOnElement(electronicsPageLink);
    }

    public void clickOnApparelMenu () {
        clickOnElement(apparelPageLink);
    }

    public void clickOnDigitalDownloadsMenu () {
        clickOnElement(digitalDownloadsPageLink);
    }

    public void clickOnBooksMenu () {
        clickOnElement(booksPageLink);
    }

    public void clickOnJewelryMenu () {
        clickOnElement(jewelryPageLink);
    }

    public void clickOnGiftCardsMenu () {
        clickOnElement(giftCardsPageLink);
    }

    public void clickOnLogout() {
        clickOnElement(logOutButton);
    }

}
