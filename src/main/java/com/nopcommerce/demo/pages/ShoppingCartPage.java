package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

    /******************************** All Elements' Path on ShoppingCart page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Shopping cart']");
    By quantityField = By.xpath("//input[@class = 'qty-input']");
    By updateCartButton = By.xpath("//button[@id='updatecart']");
    By totalPriceField = By.xpath("//span[@class='product-subtotal']");
    By termsOfServiceAgreementCheckBox = By.xpath("//input[@id='termsofservice']");
    By checkOutButton = By.xpath("//button[@id='checkout']");
    By loginButton = By.xpath("//a[normalize-space()='Log in']");

    /******************************** All Elements' Action Methods on ShoppingCart page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sendDataToQuantityField(String data){
        sendTextToElement(quantityField, data);
    }

    public String getDataFromQuantityField() {
        return getAttributeFromElement(quantityField, "value");
    }

    public void clickOnUpdateCartButton() {
        clickOnElement(updateCartButton);
    }

    public String  getTextFromTotalPriceField (){
        return getTextFromElement(totalPriceField);
    }

    public void clickOnAgreementOfTerm () {
        clickOnElement(termsOfServiceAgreementCheckBox);
    }

    public void clickOnCheckOut (){
        clickOnElement(checkOutButton);
    }

    public void clickOnLogin (){
        clickOnElement(loginButton);
    }

}
