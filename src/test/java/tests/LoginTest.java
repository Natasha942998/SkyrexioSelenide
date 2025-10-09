package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.google.common.util.concurrent.ClosingFuture.submit;

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
                .errorMessageLogin();
    }

    @Test
    public void loginEmptyPassword() {
        loginPage.openLoginPage()
                .emailInput(email)
                .passwordEmpty(String.valueOf(empty))
                .submit()
                .errorMessageLogin();
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
}
