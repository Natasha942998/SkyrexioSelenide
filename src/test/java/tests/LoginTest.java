package tests;

import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

public class LoginTest extends BaseTest {
    @Test
    public void projectLogin(){
       open("login");
       loginPage.openPage();
       loginPage.login();
    }
}