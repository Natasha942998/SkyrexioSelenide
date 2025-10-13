package pages;

import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class HomePage extends BaseTest {

    @Step("Открытие HomePage")
    public HomePage openHomePage() {
        open("home");
        return this;
    }

    @Step("Проверка загрузки HomePage")
    public void waitHomePageLoaded() {
        webdriver().shouldHave(urlContaining("home"));
    }
}