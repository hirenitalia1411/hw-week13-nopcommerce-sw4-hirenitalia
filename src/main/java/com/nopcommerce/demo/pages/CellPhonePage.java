package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class CellPhonePage extends Utility {

    /******************************** All Elements' Path on CellPhone page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Cell phones']");
    By listViewTab = By.xpath("//a[normalize-space()='List']");
    By nokiaLumia1020ProductName = By.xpath("//h2[@class='product-title']//a[contains(text(),'Nokia Lumia 1020')]");

    /******************************** All Elements' Action Methods on CellPhone page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnListViewTab() {
        clickOnElement(listViewTab);
    }

    public void clickOnNokiaLumia1020Product () {
        clickOnElement(nokiaLumia1020ProductName);
    }
}
