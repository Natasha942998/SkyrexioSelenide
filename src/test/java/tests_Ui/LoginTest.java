package tests_Ui;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.switchTo;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrectData() {
        loginPage.openLoginPage()
                .waitLoginPageLoaded();
        loginPage.emailInput(email)
                .passwordInput(password)
                .submit();
        homePage.waitHomePageLoaded();
    }

    @Test
    public void loginEmptyEmail() {
        loginPage.openLoginPage()
                .emailEmpty(String.valueOf(empty))
                .passwordInput(password)
                .submit()
                .getEmailInputBackgroundColor();
    }

    @Test
    public void loginEmptyPassword() {
        loginPage.openLoginPage()
                .emailInput(email)
                .passwordEmpty(String.valueOf(empty))
                .submit()
                .getPasswordInputBackgroundColor();
    }

    @Test
    public void loginIncorrectEmail() {
        loginPage.openLoginPage()
                .incorrectEmail(String.valueOf(incorrect))
                .passwordInput(password)
                .submit()
                .errorMessageLogin();
    }

    @Test
    public void loginIncorrectPassword() {
        loginPage.openLoginPage()
                .emailInput(email)
                .incorrectPassword(String.valueOf(incorrect))
                .submit()
                .errorMessageLogin();
    }

    @Test
    public void checkEnglishLanguage() {
        loginPage.openLoginPage()
                .languageChangeButton()
                .choiceLanguageEnglish()
                .isTitlePresentEnglish();
    }

    @Test
    public void checkRussianLanguage() {
        loginPage.openLoginPage()
                .languageChangeButton()
                .choiceLanguageEnglish()
                .choiceLanguageRussian()
                .isTitlePresentRussian();
    }

   @Test
    public void checkButtonBinance() {
        loginPage.openLoginPage()
                .getButtonBinance();
        switchTo().window(1);
        binancePage.waitBinancePageLoaded();
    }
}