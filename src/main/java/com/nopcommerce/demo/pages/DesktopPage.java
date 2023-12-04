package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopPage extends Utility {

    /******************************** All Elements' Path on Desktops page ***********************************************/


    By welcomeText = By.xpath("//h1[normalize-space()='Desktops']");
    By sortByFilterPath = By.xpath("//select[@id='products-orderby']");
    By allProductTitle = By.xpath("//h2[@class = 'product-title']");
    By buildYourOwnComputerLink = By.xpath("//h2[@class='product-title']//a[normalize-space()='Build your own computer']");

    /******************************** All Elements' Action Methods on Desktops page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sortByFilter(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByFilterPath, sortByOption);
    }

    public List<WebElement> getAllProductTitleOnPage () {
        List<WebElement> products = driver.findElements(allProductTitle);
        return products;
    }

    public void clickOnBuildYourOwnComputerLink () {
        clickOnElement(buildYourOwnComputerLink);
    }
}
