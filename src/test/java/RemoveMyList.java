import BaseData.BaseLibrary;
import BaseData.Browser;
import BaseData.UserData;
import Pages.LoginPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static BaseData.Browser.driver;
import static java.lang.Thread.sleep;

public class RemoveMyList {

    SearchPage searchPage = new SearchPage();
    BaseLibrary baseLibrary = new BaseLibrary();

    @Test(description = "Listem'e eklenen içeriği Listeden çıkartma")
    public void removeToMyList() throws InterruptedException {

        Browser browser = new Browser();
        browser.openBrowser();
        SelectAccount selectAccount = new SelectAccount();
        selectAccount.accountSelect();
        sleep(5000);
        driver.findElement(By.xpath("(//li[@class='navigation-tab'])[5]")).click();
        sleep(5000);

        searchPage.waitForRecepIvedik4ToBeVisible();
        searchPage.hoverOnMovie();
        baseLibrary.screenshot();
        sleep(5000);

        try {
            WebElement removeToMyListIcon = driver.findElement(By.cssSelector("[data-uia='remove-my-list-button']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", removeToMyListIcon);
            baseLibrary.screenshot();
            sleep(5000);

        } catch (Exception e) {
            System.out.println("İçerik zaten Listem'de bulunmuyor.");
        }
        driver.quit();
    }
}
