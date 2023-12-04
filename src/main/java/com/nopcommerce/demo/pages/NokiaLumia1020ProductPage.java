package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class NokiaLumia1020ProductPage extends Utility {

    /******************************** All Elements' Path on NokiaLumia1020 page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Nokia Lumia 1020']");
    By priceTag = By.xpath("//span[@id='price-value-20']");
    By quantityTab = By.xpath("//input[@id='product_enteredQuantity_20']");
    By addToCartButton = By.xpath("//button[@id='add-to-cart-button-20']");
    By cartAddMessage = By.xpath("//p[@class='content']");
    By cartAddMessageCloseButton = By.xpath("//span[@title='Close']");
    By shoppingCartTab = By.xpath("//span[@class='cart-label']");
    By goToCartOption = By.xpath("//button[normalize-space()='Go to cart']");

    /******************************** All Elements' Action Methods on NokiaLumia1020 page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String getProductPrice() {
        return getTextFromElement(priceTag);
    }

    public void sendDataTOQuantityTab(String text) {
        sendTextToElement(quantityTab, text);
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
