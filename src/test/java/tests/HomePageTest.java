package tests;

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
}