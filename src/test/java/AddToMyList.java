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


public class AddToMyList {

    SearchPage searchPage = new SearchPage();
    BaseLibrary baseLibrary = new BaseLibrary();

    @Test(description = "Listeme Film Ekle")
    public void addToMyList() throws InterruptedException {
        MovieSearch movieSearch = new MovieSearch();
        movieSearch.searchMovie();
        sleep(2000);
        searchPage.hoverOnMovie();
        sleep(5000);

        try {
            WebElement addToMyListIcon;
            addToMyListIcon = driver.findElement(By.xpath("//button[@data-uia='add-to-my-list']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", addToMyListIcon);
            sleep(5000);
            baseLibrary.screenshot();
            driver.findElement(By.xpath("(//li[@class='navigation-tab'])[5]")).click();
            sleep(5000);

            searchPage.waitForRecepIvedik4ToBeVisible();
            searchPage.hoverOnMovie();
            baseLibrary.screenshot();
            sleep(5000);

            driver.quit();

        } catch (Exception e) {

            System.out.println("İçerik zaten Listem'e eklenmiş.");
            driver.quit();
        }


    }


}