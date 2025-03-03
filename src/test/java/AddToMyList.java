import BaseData.BaseLibrary;
import Pages.MyListPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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

        MyListPage myListPage = new MyListPage();
        myListPage.addList();

        myListPage.listPage();
        sleep(5000);
        baseLibrary.screenshot();
        driver.quit();

    }


}