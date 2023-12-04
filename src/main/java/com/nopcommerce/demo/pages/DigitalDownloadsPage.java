package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DigitalDownloadsPage extends Utility {

    /******************************** All Elements' Path on DigitalDownloads page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Digital downloads']");

    /******************************** All Elements' Action Methods on DigitalDownloads page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
