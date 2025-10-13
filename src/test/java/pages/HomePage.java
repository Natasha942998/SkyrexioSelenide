package pages;

import tests.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class HomePage extends BaseTest {

    public HomePage openHomePage() {
        open("home");
        return this;
    }

    public void waitHomePageLoaded() {
        webdriver().shouldHave(urlContaining("home"));
    }
}