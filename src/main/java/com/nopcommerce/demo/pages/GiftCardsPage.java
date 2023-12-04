package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {

    /******************************** All Elements' Path on GiftCards page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Gift Cards']");

    /******************************** All Elements' Action Methods on GiftCards page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
