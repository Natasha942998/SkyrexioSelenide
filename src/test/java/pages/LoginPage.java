package pages;

import com.codeborne.selenide.SelenideElement;
import tests.BaseTest;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BaseTest {
    public final SelenideElement emailInput = $x("//*[@placeholder='Email']");
    public final SelenideElement passwordInput = $x("//*[@placeholder='Пароль']");
    public final SelenideElement submit = $x("//*[@type='submit']");

    public LoginPage openLoginPage() {
        open("login");
        return this;
    }

    public LoginPage emailInput(String email) {
        emailInput.setValue(email);
        return this;
    }

    public LoginPage passwordInput(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public LoginPage emailEmpty(String empty) {
        emailInput.setValue(empty);
        return this;
    }

    public LoginPage passwordEmpty(String empty) {
        passwordInput.setValue(empty);
        return this;
    }

    public LoginPage incorrectPassword(String incorrect) {
        passwordInput.setValue(incorrect);
        return this;
    }

    public LoginPage incorrectEmail(String incorrect) {
        emailInput.setValue(incorrect);
        return this;
    }

    public LoginPage submit() {
        submit.submit();
        return this;
    }

    public String errorMessageLogin() {
        return PropertyReader.getProperty("errorMsg");
    }
}