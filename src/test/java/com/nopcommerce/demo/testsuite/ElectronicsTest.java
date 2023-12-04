package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class ElectronicsTest extends BaseTest {

    /********************** All Related Pages Object *****************************************************/

    HomePage homePage = new HomePage();
    CellPhonePage cellPhonePage = new CellPhonePage();
    NokiaLumia1020ProductPage nokiaLumia1020ProductPage = new NokiaLumia1020ProductPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();

    /*********************** All Test Methods As Per Requirements *****************************************/

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        homePage.mouseHoverOnElectronicsMenu();
        homePage.mouseHoverAndClickOnCellPhoneSubMenu();

        String actualText = cellPhonePage.getWelcomeText();
        String expectedText = "Cell phones";
        Assert.assertEquals(actualText, expectedText);
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        homePage.mouseHoverOnElectronicsMenu();
        homePage.mouseHoverAndClickOnCellPhoneSubMenu();

        String actualText = cellPhonePage.getWelcomeText();
        String expectedText = "Cell phones";
        Assert.assertEquals(actualText, expectedText);

        cellPhonePage.clickOnListViewTab();
        Thread.sleep(2000);
        cellPhonePage.clickOnNokiaLumia1020Product();

        String actualTitle = nokiaLumia1020ProductPage.getWelcomeText();
        String expectedTitle = "Nokia Lumia 1020";
        Assert.assertEquals(actualTitle, expectedTitle);

        String actualPrice = nokiaLumia1020ProductPage.getProductPrice();
        String expectedPrice = "$349.00";
        Assert.assertEquals(actualPrice, expectedPrice);

        nokiaLumia1020ProductPage.sendDataTOQuantityTab(Keys.CONTROL + "a");
        nokiaLumia1020ProductPage.sendDataTOQuantityTab("2");

        nokiaLumia1020ProductPage.clickOnAddToCart();

        String actualMessage = nokiaLumia1020ProductPage.getAddToCartSuccessfulMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage);

        nokiaLumia1020ProductPage.clickOnClose();
        nokiaLumia1020ProductPage.mouseHoverOnShoppingCart();
        Thread.sleep(2000);
        nokiaLumia1020ProductPage.clickOnGoToCart();

        String actual = shoppingCartPage.getWelcomeText();
        String expected = "Shopping cart";
        Assert.assertEquals(actual, expected);

        String actualQuantity = shoppingCartPage.getDataFromQuantityField();
        String expectedQuantity = "2";
        Assert.assertEquals(actualQuantity, expectedQuantity);

        String actualTotalPrice = shoppingCartPage.getTextFromTotalPriceField();
        String expectedTotalPrice = "$698.00";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice);

        shoppingCartPage.clickOnAgreementOfTerm();
        shoppingCartPage.clickOnCheckOut();

        String actualCheckOutPageMessage = checkOutPage.getWelcomeText();
        String expectedCheckOutPageMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualCheckOutPageMessage, expectedCheckOutPageMessage);

        checkOutPage.clickOnRegister();

        String actualRegisterPageText = registerPage.getWelcomeText();
        String expectedRegisterPageText = "Register";
        Assert.assertEquals(actualRegisterPageText, expectedRegisterPageText);

        registerPage.sendDataToFirstNameField("Abcd");
        registerPage.sendDataToLastNameField("Xyz");

        Random random = new Random();
        String tempEmail = "abcd"+random.nextInt()+"@gmail.com";
        registerPage.sendDataToEmailField(tempEmail);

        registerPage.sendDataToPasswordField("abcd123");
        registerPage.sendDataToConfirmPasswordField("abcd123");

        registerPage.clickOnRegisterButton();

        String actualConfirmationMessage = registerPage.getDataFromConfirmationMessage();
        String expectedConfirmationMessage = "Your registration completed";
        Assert.assertEquals(actualConfirmationMessage, expectedConfirmationMessage);

        registerPage.clickOnContinueButton();

        String actualShoppingCartText = shoppingCartPage.getWelcomeText();
        String expectedShoppingCartText = "Shopping cart";
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText);

        shoppingCartPage.clickOnLogin();

        loginPage.sendDataToEmailField(tempEmail);
        loginPage.sendDataToPasswordField("abcd123");
        loginPage.clickOnLoginButton();

        shoppingCartPage.clickOnAgreementOfTerm();
        shoppingCartPage.clickOnCheckOut();

        checkOutPage.selectCountryFromDropDown("United Kingdom");
        checkOutPage.sendDataToCityField("Harrow");
        checkOutPage.sendDataToAddressField("17, Abc Road");
        checkOutPage.sendDataToPostCodeField("HA3 7CD");
        checkOutPage.sendDataToContactField("012458222274");
        checkOutPage.clickOnContinue();

        checkOutPage.clickOnSecondDayAirOption();
        checkOutPage.clickOnShippingMethodContinueButton();

        checkOutPage.clickOnPayByCreditCardOption();
        checkOutPage.clickOnPaymentMethodContinueOption();

        checkOutPage.selectCreditCard("Visa");
        checkOutPage.sendDataToCardholderNameField("Abcdxyz");
        checkOutPage.sendDataToCardNumberField("4111111111111111");
        checkOutPage.sendDataToExpiryDateField("05");
        checkOutPage.sendDataToExpiryYearField("2025");
        checkOutPage.sendDataToCardCodeField("123");
        checkOutPage.clickOnPaymentInformationContinueButton();

        String actualPaymentMethod = checkOutPage.getDataOfPaymentMethod();
        String expectedPaymentMethod = "Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod);

        String actualShippingMethod = checkOutPage.getDataOfShippingMethod();
        String expectedShippingMethod = "2nd Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod);

        String actualConfirmOrderPrice = checkOutPage.getConfirmOrderPrice();
        String expectedConfirmationPrice = "$698.00";
        Assert.assertEquals(actualConfirmOrderPrice, expectedConfirmationPrice);

        checkOutPage.clickOnConfirmOrderContinueButton();
        checkOutPage.orderConfirmationMessage();

        String actualOrderConfirmationMessage = checkOutPage.orderConfirmationMessage();
        String expectedOrderConfirmationMessage = "Your order has been successfully processed!";
        Assert.assertEquals(actualOrderConfirmationMessage, expectedOrderConfirmationMessage);

        checkOutPage.clickOnOrderConfirmationContinue();

        homePage.getWelcomeText();

        homePage.clickOnLogout();

        String currentUrl = driver.getCurrentUrl();
        String actualUrl = "https://demo.nopcommerce.com/";
        Assert.assertEquals(actualUrl, currentUrl);
    }
}
