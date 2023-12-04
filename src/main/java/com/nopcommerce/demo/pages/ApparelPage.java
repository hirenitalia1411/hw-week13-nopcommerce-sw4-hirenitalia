package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {

    /******************************** All Elements' Path on Apparel page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Apparel']");

    /******************************** All Elements' Action Methods on Apparel page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
