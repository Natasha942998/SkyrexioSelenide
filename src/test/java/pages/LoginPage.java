package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

import static com.codeborne.selenide.Condition.*;
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
    public final SelenideElement errorMessage = $x("//*[text()='Неверный email или пароль']");
    public final SelenideElement titleRussian = $x("//h1[text()='Вход']");
    public final SelenideElement titleEnglish = $x("//h1[text()='Sign in']");
    public final SelenideElement inputFieldEmail = $x("//div[@class = 'tw-flex tw-items-center tw-h-10 tw-w-full tw-rounded-md tw-bg-background tw-text-base tw-border tw-transition-all tw-duration-300 focus-within:tw-ring-0 tw-overflow-hidden tw-border-red-500 tw-h-12']");
    public final SelenideElement inputFieldPassword = $x("//div[@class = 'tw-flex tw-items-center tw-h-10 tw-w-full tw-rounded-md tw-bg-background tw-text-base tw-border tw-transition-all tw-duration-300 focus-within:tw-ring-0 tw-overflow-hidden tw-border-input tw-h-12']");

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

    public WebElement getEmailInputBackgroundColor() {
        return inputFieldEmail.shouldHave(cssValue
                ("background-color", "rgba(255, 255, 255, 1)"));
    }

    public WebElement getPasswordInputBackgroundColor() {
        return inputFieldPassword.shouldHave(cssValue
                ("background-color", "rgba(255, 255, 255, 1)"));
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
        errorMessage.shouldBe(visible);
        return ERROR_MSG.getValue();
    }

    public LoginPage languageChangeButton() {
        languageChangeButton.click();
        return this;
    }

    public String isTitlePresentEnglish() {
        titleEnglish.shouldBe(visible);
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
        titleRussian.shouldBe(visible);
        return TITLE_RUSSIAN.getValue();
    }
}