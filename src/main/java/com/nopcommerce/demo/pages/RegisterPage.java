package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    /******************************** All Elements' Path on Register page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Register']");
    By firstNameField = By.xpath("//input[@id='FirstName']");
    By lastNameField = By.xpath("//input[@id='LastName']");
    By emailField = By.xpath("//input[@id='Email']");
    By passwordField = By.xpath("//input[@id='Password']");
    By confirmPasswordField = By.xpath("//input[@id='ConfirmPassword']");
    By registerButton = By.xpath("//button[@id='register-button']");
    By registrationConfirmationMessage = By.xpath("//div[@class='result']");
    By continueButton = By.xpath("//a[normalize-space()='Continue']");

    /******************************** All Elements' Action Methods on Register page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sendDataToFirstNameField (String fName){
        sendTextToElement(firstNameField, fName);
    }

    public void sendDataToLastNameField (String lName){
        sendTextToElement(lastNameField, lName);
    }

    public void sendDataToEmailField (String email){
        sendTextToElement(emailField, email);
    }

    public void sendDataToPasswordField (String password){
        sendTextToElement(passwordField, password);
    }

    public void sendDataToConfirmPasswordField (String cPassword){
        sendTextToElement(confirmPasswordField, cPassword);
    }

    public void clickOnRegisterButton () {
        clickOnElement(registerButton);
    }

    public String getDataFromConfirmationMessage () {
        return getTextFromElement(registrationConfirmationMessage);
    }

    public void clickOnContinueButton () {
        clickOnElement(continueButton);
    }
}
