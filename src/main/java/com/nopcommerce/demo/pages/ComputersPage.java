package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {

    /******************************** All Elements' Path on Computers page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Computers']");
    By desktopsMenuLink = By.xpath("//li[@class='active last']//a[normalize-space()='Desktops']");

    /******************************** All Elements' Action Methods on Computers page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnDesktopsMenu () {
        clickOnElement(desktopsMenuLink);
    }

}
