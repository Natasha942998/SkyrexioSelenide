package pages;

import tests.BaseTest;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class BinancePage extends BaseTest {

    public BinancePage openBinancePage() {
        open("https://accounts.binance.com/en/login");
        return this;
    }

    public void waitBinancePageLoaded() {
        webdriver().shouldHave(urlContaining("https://accounts.binance.com/en/login"));
    }

    public void waitBinancePageAuthorizationLoaded() {
        webdriver().shouldHave(urlContaining("https://accounts.binance.com/en/login?client_id=9PUQLoXYrS&return_to=L29hdXRoL2F1dGhvcml6ZT9jbGllbnRfaWQ9OVBVUUxvWFlyUyZyZWRpcmVjdF91cmk9aHR0cHMlM0ElMkYlMkZ0ZXN0LnNreXJleGlvLmNvbSUyRmxvZ2luJnJlc3BvbnNlX3R5cGU9Y29kZSZzY29wZT11c2VyJTNBb3BlbklkJTJDY3JlYXRlJTNBYXBpa2V5JTJDYWNjb3VudCUzQXN0YXR1cyZzdGF0ZT1iaW5hbmNl"));
    }
}