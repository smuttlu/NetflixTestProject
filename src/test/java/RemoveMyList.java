import BaseData.BaseLibrary;
import BaseData.Browser;
import Pages.MyListPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static BaseData.Browser.driver;
import static java.lang.Thread.sleep;

public class RemoveMyList {

    SearchPage searchPage = new SearchPage();
    BaseLibrary baseLibrary = new BaseLibrary();
    MyListPage myListPage = new MyListPage();


    @Test(description = "Listem'e eklenen içeriği Listeden çıkartma")
    public void removeToMyList() throws InterruptedException {

        Browser browser = new Browser();
        browser.openBrowser();
        SelectAccount selectAccount = new SelectAccount();
        selectAccount.accountSelect();
        sleep(5000);
        MyListPage myListPage = new MyListPage();
        myListPage.listPage();

        searchPage.waitForRecepIvedik4ToBeVisible();
        searchPage.hoverOnMovie();
        baseLibrary.screenshot();
        sleep(5000);

        myListPage.removeList();
    }
}
