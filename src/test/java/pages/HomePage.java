package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import tests_Ui.BaseTest;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.urlContaining;

public class HomePage extends BaseTest {

    public final SelenideElement personalAccountButton = $x("//button[@aria-haspopup='menu']");
    public final SelenideElement exitButton = $x("//div[@class='tw-flex tw-items-center tw-justify-between tw-gap-[8px]'][4]");

    @Step("Открытие HomePage")
    public HomePage openHomePage() {
        open("home");
        return this;
    }

    @Step("Проверка загрузки HomePage")
    public void waitHomePageLoaded() {
        webdriver().shouldHave(urlContaining("home"));
    }

    @Step("Нажатие значка аккаунта")
    public HomePage getPersonalAccountButton() {
        personalAccountButton.shouldBe(Condition.visible).click();
        return this;
    }

    @Step("Нажатие кнопки выход")
    public HomePage getExitButton() {
        exitButton.shouldBe(Condition.visible).click();
        return this;
    }
}
