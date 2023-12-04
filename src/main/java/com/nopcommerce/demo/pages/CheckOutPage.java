package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CheckOutPage extends Utility {

    /******************************** All Elements' Path on Check Out page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Welcome, Please Sign In!']");
    By checkOutAsGuestButton = By.xpath("//button[normalize-space()='Checkout as Guest']");
    By registerButton = By.xpath("//button[normalize-space()='Register']");
    By firstNameField = By.xpath("//input[@id='BillingNewAddress_FirstName']");
    By lastNameField = By.xpath("//input[@id='BillingNewAddress_LastName']");
    By gmailField = By.xpath("//input[@id='BillingNewAddress_Email']");
    By countryDropDown = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By cityField = By.xpath("//input[@id='BillingNewAddress_City']");
    By addressField = By.xpath("//input[@id='BillingNewAddress_Address1']");
    By postCodeField = By.xpath("//input[@id='BillingNewAddress_ZipPostalCode']");
    By contactNumberFied = By.xpath("//input[@id='BillingNewAddress_PhoneNumber']");
    By continueButton = By.xpath("//button[@onclick='Billing.save()']");
    By nextDayAirRadioButton = By.xpath("//input[@id='shippingoption_1']");
    By secondDayAirRadioButton = By.xpath("//input[@id='shippingoption_2']");
    By shippingMethodContinueButton = By.xpath("//button[@class='button-1 shipping-method-next-step-button']");
    By payByCreditCardOption = By.xpath("//input[@id='paymentmethod_1']");
    By paymentMethodContinueButton = By.xpath("//button[@class='button-1 payment-method-next-step-button']");
    By selectCreditCardDropDown = By.xpath("//select[@id='CreditCardType']");
    By cardHolderNameField = By.xpath("//input[@id='CardholderName']");
    By cardNumberField = By.xpath("//input[@id='CardNumber']");
    By expiryDateField = By.xpath("//select[@id='ExpireMonth']");
    By expiryYearField = By.xpath("//select[@id='ExpireYear']");
    By cardCodeField = By.xpath("//input[@id='CardCode']");
    By paymentInformationContinueButton = By.xpath("//button[@class='button-1 payment-info-next-step-button']");
    By confirmOrderPaymentMethod = By.xpath("//li[@class = 'payment-method']//span[@class = 'value']");
    By confirmOrderShippingMethod = By.xpath("//li[@class = 'shipping-method']//span[@class = 'value']");
    By confirmOrderPrice = By.xpath("//td[@class='subtotal']");
    By confirmOrderContinueButton = By.xpath("//button[normalize-space()='Confirm']");
    By orderConfirmationMessage = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
    By orderConfirmationContinueButton = By.xpath("//button[normalize-space()='Continue']");

    /******************************** All Elements' Action Methods on Check Out page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnCheckOutAsGuest() {
        clickOnElement(checkOutAsGuestButton);
    }

    public void clickOnRegister() {
        clickOnElement(registerButton);
    }

    public void sendDataToFirstNameField(String fName) {
        sendTextToElement(firstNameField, fName);
    }

    public void sendDataToLastNameField(String lName) {
        sendTextToElement(lastNameField,lName);
    }

    public void sendDataToEmailField(String email) {
        sendTextToElement(gmailField, email);
    }

    public void selectCountryFromDropDown(String country) {
        selectByVisibleTextFromDropDown(countryDropDown, country);
    }

    public void sendDataToCityField(String city) {
        sendTextToElement(cityField, city);
    }

    public void sendDataToAddressField(String address){
        sendTextToElement(addressField, address);
    }

    public void sendDataToPostCodeField(String postCode){
        sendTextToElement(postCodeField, postCode);
    }

    public void sendDataToContactField (String contact) {
        sendTextToElement(contactNumberFied, contact);
    }

    public void clickOnContinue () {
        clickOnElement(continueButton);
    }

    public void clickOnNextDayAirOption() {
        clickOnElement(nextDayAirRadioButton);
    }

    public void clickOnSecondDayAirOption() {
        clickOnElement(secondDayAirRadioButton);
    }

    public void clickOnShippingMethodContinueButton(){
        clickOnElement(shippingMethodContinueButton);
    }

    public void clickOnPayByCreditCardOption(){
        clickOnElement(payByCreditCardOption);
    }

    public void clickOnPaymentMethodContinueOption() {
        clickOnElement(paymentMethodContinueButton);
    }

    public void selectCreditCard(String option){
        selectByVisibleTextFromDropDown(selectCreditCardDropDown, option);
    }

    public void sendDataToCardholderNameField (String name){
        sendTextToElement(cardHolderNameField, name);
    }

    public void sendDataToCardNumberField (String cardNumber) {
        sendTextToElement(cardNumberField, cardNumber);
    }

    public void sendDataToExpiryDateField(String eDate) {
        sendTextToElement(expiryDateField, eDate);
    }

    public void sendDataToExpiryYearField (String eYear){
        sendTextToElement(expiryYearField, eYear);
    }

    public void sendDataToCardCodeField (String cardCode){
        sendTextToElement(cardCodeField, cardCode);
    }

    public void clickOnPaymentInformationContinueButton(){
        clickOnElement(paymentInformationContinueButton);
    }

    public String getDataOfPaymentMethod() {
        return getTextFromElement(confirmOrderPaymentMethod);
    }

    public String getDataOfShippingMethod(){
        return getTextFromElement(confirmOrderShippingMethod);
    }

    public String getConfirmOrderPrice() {
        return getTextFromElement(confirmOrderPrice);
    }

    public void clickOnConfirmOrderContinueButton() {
        clickOnElement(confirmOrderContinueButton);
    }

    public String orderConfirmationMessage(){
        return getTextFromElement(orderConfirmationMessage);
    }

    public void clickOnOrderConfirmationContinue(){
        clickOnElement(orderConfirmationContinueButton);
    }
}
