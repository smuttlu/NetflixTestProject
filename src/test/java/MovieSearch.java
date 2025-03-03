import BaseData.BaseLibrary;
import BaseData.Browser;
import BaseData.UserData;
import Pages.LoginPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static BaseData.Browser.driver;
import static java.lang.Thread.sleep;


public class MovieSearch {
    SearchPage searchPage = new SearchPage();
    BaseLibrary baseLibrary = new BaseLibrary();

    @Test(description = "Listeme Film Ekle", invocationCount = 1) // Tek sefer çalıştır
    public void searchMovie() throws InterruptedException {

        Browser browser = new Browser();
        browser.openBrowser();
        SelectAccount selectAccount = new SelectAccount();
        selectAccount.accountSelect();
        searchPage.searchIcon();
        driver.findElement(By.xpath("//*[@id='searchInput']")).sendKeys("Recep İvedik");
        sleep(5000);
        baseLibrary.screenshot();

    }
}