package pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import tests_Ui.BaseTest;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;
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
    public final SelenideElement inputFieldEmail = $x("//div[contains(@class, 'tw-flex') and contains(@class, 'tw-border-red-500 tw-h-12')]");
    public final SelenideElement inputFieldPassword = $x("//div[contains(@class, 'tw-flex') and contains(@class, 'tw-border-input tw-h-12')]");
    public final SelenideElement buttonBinance = $x("//div[contains(@class, 'tw-flex') and contains(@class, 'tw-items-center')]/button[2]");

    @Step("Открытие страницы авторизации")
    public LoginPage openLoginPage() {
        open("login");
        return this;
    }

    @Step("Проверка загрузки страницы авторизации")
    public void waitLoginPageLoaded() {
        webdriver().shouldHave(urlContaining("login"));
    }

    @Step("Ввод валидногоо логина")
    public LoginPage emailInput(String email) {
        emailInput.setValue(email);
        return this;
    }

    @Step("Ввод валидного пароля")
    public LoginPage passwordInput(String password) {
        passwordInput.setValue(password);
        return this;
    }

    @Step("Проверка загрузки страницы авторизации")
    public LoginPage emailEmpty(String empty) {
        emailInput.setValue(empty);
        return this;
    }

    @Step("Проверка изменения цвета поля ввода логина")
    public WebElement getEmailInputBackgroundColor() {
        return inputFieldEmail.shouldHave(cssValue
                ("background-color", "rgba(255, 255, 255, 1)"));
    }

    @Step("Проверка изменения цвета поля ввода пароля")
    public WebElement getPasswordInputBackgroundColor() {
        return inputFieldPassword.shouldHave(cssValue
                ("background-color", "rgba(255, 255, 255, 1)"));
    }

    @Step("Пустое поле ввода логина")
    public LoginPage passwordEmpty(String empty) {
        passwordInput.setValue(empty);
        return this;
    }

    @Step("Пустое поле ввода пароля")
    public LoginPage incorrectPassword(String incorrect) {
        passwordInput.setValue(incorrect);
        return this;
    }

    @Step("Ввод невалидного значения логина")
    public LoginPage incorrectEmail(String incorrect) {
        emailInput.setValue(incorrect);
        return this;
    }

    @Step("Нажатие кнопки")
    public LoginPage submit() {
        submit.submit();
        return this;
    }

    @Step("Сообщение об ошибке")
    public String errorMessageLogin() {
        errorMessage.shouldBe(visible);
        return ERROR_MSG.getValue();
    }

    @Step("Нажатие на значок смены/выбора языка")
    public LoginPage languageChangeButton() {
        languageChangeButton.click();
        return this;
    }

    @Step("Проверка смены языка на английский")
    public String isTitlePresentEnglish() {
        titleEnglish.shouldBe(visible);
        return TITLE_ENGLISH.getValue();
    }

    @Step("Выбор английского языка из списка")
    public LoginPage choiceLanguageEnglish() {
        languageEnglish.click();
        return this;
    }

    @Step("Выбор русского языка из списка")
    public LoginPage choiceLanguageRussian() {
        languageRussian.click();
        return this;
    }

    @Step("Проверка смены языка на русский")
    public String isTitlePresentRussian() {
        titleRussian.shouldBe(visible);
        return TITLE_RUSSIAN.getValue();
    }

    @Step("Нажатие кнопки Binance")
    public LoginPage getButtonBinance() {
        buttonBinance.shouldBe(visible);
        buttonBinance.click();
        return this;
    }
}