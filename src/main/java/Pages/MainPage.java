package Pages;

import BaseData.BaseLibrary;
import BaseData.Browser;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class MainPage extends BaseLibrary {
    @Step("Arama yap butonunu doldurur")
    public MainPage fillSearch(String text) {
        Browser.driver.findElement(By.cssSelector("[class='search-icon']")).sendKeys(text, Keys.ENTER);
        return this;
    }
}

