package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    //private final SelenideElement emailInput = $x("//*[@placeholder='Email']");
    private final SelenideElement emailInput = $x("//*[text()='Email']");
    private final SelenideElement passwordInput = $x("//*[@placeholder='Password']");
    private final SelenideElement submit = $x("//*[text()='Sign in']");

    public void openPage() {
        open("login");
    }

    public void login() {
        emailInput.setValue("Natasha942998@gmail.com").pressEnter();
        passwordInput.sendKeys("Natasha942998@solnce");
        submit.submit();
    }
}