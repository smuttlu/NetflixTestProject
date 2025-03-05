package Pages;

import BaseData.BaseLibrary;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static BaseData.Browser.driver;
import static java.lang.Thread.sleep;

public class MyListPage {

    SearchPage searchPage = new SearchPage();
    BaseLibrary baseLibrary = new BaseLibrary();

    public void listPage() throws InterruptedException {
        driver.findElement(By.xpath("(//li[@class='navigation-tab'])[5]")).click();
        sleep(5000);
    }

    public void addList() throws InterruptedException {

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


        } catch (Exception e) {

            System.out.println("İçerik zaten Listem'e eklenmiş.");
            driver.quit();
        }

    }

    public void removeList() {

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
