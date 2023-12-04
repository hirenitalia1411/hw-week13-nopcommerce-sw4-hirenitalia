package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

    /******************************** All Elements' Path on BuildYourOwnComputer page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Build your own computer']");
    By processorFieldDropDown = By.xpath("//select[@id='product_attribute_1']");
    By RAMFieldDropDown = By.xpath("//select[@id='product_attribute_2']");
    By HDDRadioButton = By.xpath("//input[@id='product_attribute_3_7']");
    By OSRadioButton = By.xpath("//input[@id='product_attribute_4_9']");
    By softwareCheckBox = By.xpath("//input[@id='product_attribute_5_12']");
    By totalPriceText = By.xpath("//span[@id='price-value-1']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-1']");
    By cartAddMessage = By.xpath("//p[@class='content']");
    By cartAddMessageCloseButton = By.xpath("//span[@title='Close']");
    By shoppingCartTab = By.xpath("//span[@class='cart-label']");
    By goToCartOption = By.xpath("//button[normalize-space()='Go to cart']");

    /******************************** All Elements' Action Methods on BuildYourOwnComputer page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void selectProcessorFieldDropDownOption (String option){
        selectByVisibleTextFromDropDown(processorFieldDropDown, option);
    }

    public void selectRAMFieldDropDownOption (String option){
        selectByVisibleTextFromDropDown(RAMFieldDropDown, option);
    }

    public void clickOnHDDRadioButton () {
        clickOnElement(HDDRadioButton);
    }

    public void clickOnOSRadioButton() {
        clickOnElement(OSRadioButton);
    }

    public void clickOnSoftwareCheckBox() {
        clickOnElement(softwareCheckBox);
    }

    public String getTotalPrice () {
        return getTextFromElement(totalPriceText);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getAddToCartSuccessfulMessage () {
        return getTextFromElement(cartAddMessage);
    }

    public void clickOnClose () {
        clickOnElement(cartAddMessageCloseButton);
    }

    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(shoppingCartTab);
    }

    public void clickOnGoToCart () {
        clickOnElement(goToCartOption);
    }

}
