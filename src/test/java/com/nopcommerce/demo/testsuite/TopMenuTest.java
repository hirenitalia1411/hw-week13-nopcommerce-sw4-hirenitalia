package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;


public class TopMenuTest extends BaseTest {

    /********************** All Related Pages Object *****************************************************/

    HomePage homePage = new HomePage();
    ComputersPage computersPage = new ComputersPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    ApparelPage apparelPage = new ApparelPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    BooksPage booksPage = new BooksPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    /*********************** All Test Methods As Per Requirements *****************************************/

    @Test
    public void selectMenu() {
        String menu = "Computers";
        List<WebElement> list = homePage.getListOfTopMenu();
        for (WebElement element: list) {
            if(element.getText().trim().equalsIgnoreCase(menu)){
                homePage.clickOnComputersMenu();
                break;
            }
        }
    }

}
