package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {

    /******************************** All Elements' Path on Jewelry page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Jewelry']");

    /******************************** All Elements' Action Methods on Jewelry page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
