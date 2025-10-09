package pages;

import com.codeborne.selenide.SelenideElement;
import enams.PropertyEnums;
import tests.BaseTest;
import utils.PropertyReader;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;
import static enams.PropertyEnums.*;

public class LoginPage extends BaseTest {
    public final SelenideElement emailInput = $x("//*[@placeholder='Email']");
    public final SelenideElement passwordInput = $x("//*[@placeholder='Пароль']");
    public final SelenideElement submit = $x("//*[@type='submit']");
    public final SelenideElement languageChangeButton = $x("//*[@aria-haspopup='menu']");
    public final SelenideElement languageEnglish = $x("//div/span[text()='English']");
    public final SelenideElement languageRussian = $x("//div/span[text()='Russian']");


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
        return ERROR_MSG.getValue();
    }

    public LoginPage languageChangeButton() {
        languageChangeButton.click();
        return this;
    }

    public String isTitlePresentEnglish() {
        return TITLE_ENGLISH.getValue();
    }

    public LoginPage choiceLanguageEnglish() {
        languageEnglish.click();
        return this;
    }

    public LoginPage choiceLanguageRussian() {
        languageRussian.click();
        return this;
    }

    public String isTitlePresentRussian() {
        return TITLE_RUSSIAN.getValue();
    }
}