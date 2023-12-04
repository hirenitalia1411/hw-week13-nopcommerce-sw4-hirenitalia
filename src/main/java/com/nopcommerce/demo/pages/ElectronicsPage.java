package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    /******************************** All Elements' Path on Electronics page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Electronics']");

    /******************************** All Elements' Action Methods on Electronics page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
