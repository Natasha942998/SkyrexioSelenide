package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BinancePage;
import pages.HomePage;
import pages.LoginPage;
import utils.PropertyReader;

public class BaseTest {
    LoginPage loginPage;
    HomePage homePage;
    BinancePage binancePage;
    String email;
    String password;
    String empty;
    String errorMsg;
    String incorrect;
    String titleEnglish;
    protected String binanceUrlAuthorize;
    protected String homeUrl;

    @BeforeMethod
    public void setUp() {
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.baseUrl = PropertyReader.getProperty("skyrexio.url");
        Configuration.browserSize = "1920x1080";
        loginPage = new LoginPage();
        homePage = new HomePage();
        binancePage = new BinancePage();
        email = PropertyReader.getProperty("skyrexio.email");
        password = PropertyReader.getProperty("skyrexio.password");
        empty = PropertyReader.getProperty("skyrexio.empty");
        errorMsg = PropertyReader.getProperty("skyrexio.errorMsg");
        incorrect = PropertyReader.getProperty("skyrexio.incorrect");
        titleEnglish = PropertyReader.getProperty("skyrexio.title");
        binanceUrlAuthorize = PropertyReader.getProperty("binance.url.authorize");
        homeUrl = PropertyReader.getProperty("skyrexio.home.url");

    }

    @AfterMethod
    public void closeWind() {
        WebDriverRunner.clearBrowserCache();
        Selenide.closeWebDriver();
    }
}