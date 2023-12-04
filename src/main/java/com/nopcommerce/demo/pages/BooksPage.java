package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {

    /******************************** All Elements' Path on Books page ***********************************************/

    By welcomeText = By.xpath("//h1[normalize-space()='Books']");

    /******************************** All Elements' Action Methods on Books page *************************************/

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
