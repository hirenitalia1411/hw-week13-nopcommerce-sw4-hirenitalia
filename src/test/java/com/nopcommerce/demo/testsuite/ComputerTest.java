package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class ComputerTest extends BaseTest {

    /********************** All Related Pages Object *****************************************************/

    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkOutPage = new CheckOutPage();

    /*********************** All Test Methods As Per Requirements *****************************************/

    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        homePage.clickOnComputersMenu();
        String actualText = computersPage.getWelcomeText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);

        computersPage.clickOnDesktopsMenu();
        String actualText1 = desktopPage.getWelcomeText();
        String expectedText1 = "Desktops";
        Assert.assertEquals(actualText1, expectedText1);

        List<WebElement> list = desktopPage.getAllProductTitleOnPage();
        ArrayList originalList = new ArrayList();
        for (WebElement l: list) {
            originalList.add(l.getText());
        }
        Collections.reverse(originalList);
        //System.out.println(originalList);

        desktopPage.sortByFilter("Name: Z to A");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = desktopPage.getAllProductTitleOnPage();
        for (WebElement l: list) {
            sortedList.add(l.getText());
        }
        //System.out.println(sortedList);
        Assert.assertEquals(originalList, sortedList);
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        homePage.clickOnComputersMenu();
        String actualText = computersPage.getWelcomeText();
        String expectedText = "Computers";
        Assert.assertEquals(actualText, expectedText);

        computersPage.clickOnDesktopsMenu();
        String actualText1 = desktopPage.getWelcomeText();
        String expectedText1 = "Desktops";
        Assert.assertEquals(actualText1, expectedText1);

        List<WebElement> list = desktopPage.getAllProductTitleOnPage();
        ArrayList originalList = new ArrayList();
        for (WebElement l: list) {
            originalList.add(l.getText());
        }
        Collections.sort(originalList);
        System.out.println(originalList);

        desktopPage.sortByFilter("Name: A to Z");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = desktopPage.getAllProductTitleOnPage();
        for (WebElement l: list) {
            sortedList.add(l.getText());
        }
        System.out.println(sortedList);
        Assert.assertEquals(originalList, sortedList);

        desktopPage.clickOnBuildYourOwnComputerLink();
        String actualText2 = buildYourOwnComputerPage.getWelcomeText();
        String expectedText2 = "Build your own computer";
        Assert.assertEquals(actualText2, expectedText2);

        buildYourOwnComputerPage.selectProcessorFieldDropDownOption("2.2 GHz Intel Pentium Dual-Core E2200");
        buildYourOwnComputerPage.selectRAMFieldDropDownOption("8GB [+$60.00]");
        buildYourOwnComputerPage.clickOnHDDRadioButton();
        buildYourOwnComputerPage.clickOnOSRadioButton();
        buildYourOwnComputerPage.clickOnSoftwareCheckBox();

        Thread.sleep(2000);
        String actualPrice = buildYourOwnComputerPage.getTotalPrice();
        String expectedPrice = "$1,475.00";
        Assert.assertEquals(actualPrice, expectedPrice);

        buildYourOwnComputerPage.clickOnAddToCart();

        String actualMessage = buildYourOwnComputerPage.getAddToCartSuccessfulMessage();
        String expectedMessage = "The product has been added to your shopping cart";
        Assert.assertEquals(actualMessage, expectedMessage);

        buildYourOwnComputerPage.clickOnClose();
        buildYourOwnComputerPage.mouseHoverOnShoppingCart();
        buildYourOwnComputerPage.clickOnGoToCart();

        String actual = shoppingCartPage.getWelcomeText();
        String expected = "Shopping cart";
        Assert.assertEquals(actual, expected);

        shoppingCartPage.sendDataToQuantityField(Keys.CONTROL+"a");
        shoppingCartPage.sendDataToQuantityField("2");
        shoppingCartPage.clickOnUpdateCartButton();

        String actualTotalPrice = shoppingCartPage.getTextFromTotalPriceField();
        String expectedTotalPrice = "$2,950.00";
        Assert.assertEquals(actualTotalPrice, expectedTotalPrice);

        shoppingCartPage.clickOnAgreementOfTerm();
        shoppingCartPage.clickOnCheckOut();

        String actualCheckOutPageMessage = checkOutPage.getWelcomeText();
        String expectedCheckOutPageMessage = "Welcome, Please Sign In!";
        Assert.assertEquals(actualCheckOutPageMessage, expectedCheckOutPageMessage);

        checkOutPage.clickOnCheckOutAsGuest();

        checkOutPage.sendDataToFirstNameField("Abcd");
        checkOutPage.sendDataToLastNameField("Xyz");

        Random random = new Random();
        checkOutPage.sendDataToEmailField("abcd"+random.nextInt()+"@gmail.com");

        checkOutPage.selectCountryFromDropDown("United Kingdom");
        checkOutPage.sendDataToCityField("Harrow");
        checkOutPage.sendDataToAddressField("17, Abc Road");
        checkOutPage.sendDataToPostCodeField("HA3 7CD");
        checkOutPage.sendDataToContactField("012458222274");
        checkOutPage.clickOnContinue();

        checkOutPage.clickOnNextDayAirOption();
        checkOutPage.clickOnShippingMethodContinueButton();

        checkOutPage.clickOnPayByCreditCardOption();
        checkOutPage.clickOnPaymentMethodContinueOption();

        checkOutPage.selectCreditCard("Master card");
        checkOutPage.sendDataToCardholderNameField("Abcdxyz");
        checkOutPage.sendDataToCardNumberField("5555555555554444");
        checkOutPage.sendDataToExpiryDateField("05");
        checkOutPage.sendDataToExpiryYearField("2025");
        checkOutPage.sendDataToCardCodeField("123");
        checkOutPage.clickOnPaymentInformationContinueButton();

        String actualPaymentMethod = checkOutPage.getDataOfPaymentMethod();
        String expectedPaymentMethod = "Credit Card";
        Assert.assertEquals(actualPaymentMethod, expectedPaymentMethod);

        String actualShippingMethod = checkOutPage.getDataOfShippingMethod();
        String expectedShippingMethod = "Next Day Air";
        Assert.assertEquals(actualShippingMethod, expectedShippingMethod);

        checkOutPage.clickOnConfirmOrderContinueButton();
        checkOutPage.orderConfirmationMessage();

        String actualOrderConfirmationMessage = checkOutPage.orderConfirmationMessage();
        String expectedOrderConfirmationMessage = "Your order has been successfully processed!";
        Assert.assertEquals(actualOrderConfirmationMessage, expectedOrderConfirmationMessage);

        checkOutPage.clickOnOrderConfirmationContinue();

        homePage.getWelcomeText();
    }
}
