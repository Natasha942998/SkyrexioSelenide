package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginCorrectData() {
        loginPage.openLoginPage()
                .emailInput(email)
                .passwordInput(password)
                .submit();
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
}