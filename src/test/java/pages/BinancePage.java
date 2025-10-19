package pages;

import io.qameta.allure.Step;
import tests_Ui.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BinancePage extends BaseTest {

    @Step("Открытие страницы Binance")
    public BinancePage openBinancePage() {
        open("binance");
        return this;
    }

    @Step("Проверка загрузки страницы Binance")
    public void waitBinancePageLoaded() {
        webdriver().shouldHave(urlContaining("binance"));
    }
}