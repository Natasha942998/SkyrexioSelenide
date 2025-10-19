package tests_Ui;

import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test
    public void openHomePage() {
        loginPage.openLoginPage()
                .emailInput(email)
                .passwordInput(password)
                .submit();
        homePage.waitHomePageLoaded();
    }

    @Test
    public void openHomePageNew() {
        homePage.openHomePage();
        loginPage.waitLoginPageLoaded();
    }

    @Test
    public void openMenuPersonalAccount() {
        loginPage.openLoginPage()
                .emailInput(email)
                .passwordInput(password)
                .submit();
        homePage.waitHomePageLoaded();
        homePage.getPersonalAccountButton();
    }

    @Test
    public void exitFromHomePageNew() {
        loginPage.openLoginPage()
                .emailInput(email)
                .passwordInput(password)
                .submit();
        homePage.waitHomePageLoaded();
        homePage.getPersonalAccountButton();
        homePage .getExitButton();
        loginPage.waitLoginPageLoaded();
    }
}