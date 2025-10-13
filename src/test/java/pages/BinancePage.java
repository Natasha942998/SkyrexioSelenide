package pages;

import io.qameta.allure.Step;
import tests.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BinancePage extends BaseTest {

    @Step("Открытие страницы Binance")
    public BinancePage openBinancePage() {
        open("https://accounts.binance.com/en/login");
        return this;
    }

    @Step("Проверка загрузки страницы Binance")
    public void waitBinancePageLoaded() {
        webdriver().shouldHave(urlContaining("https://accounts.binance.com/en/login"));
    }

    @Step("Проверка загрузки страницы авторизации Binance")
    public void waitBinancePageAuthorizationLoaded() {
        webdriver().shouldHave(urlContaining("https://accounts.binance.com/oauth/authorize?client_id=9PUQLoXYrS&redirect_uri=https%3A%2F%2Ftest.skyrexio.com%2Flogin&response_type=code&scope=user%3AopenId%2Ccreate%3Aapikey%2Caccount%3Astatus&state=binance"));
    }
}