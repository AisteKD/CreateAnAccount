import lt.techin.HomePage;
import lt.techin.LoginPage;
import lt.techin.MyAccountPage;
import lt.techin.RegisterPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HomePageTest extends BaseTest {


    @Test
    void testButtonCreateAccount() {
        HomePage homePage = new HomePage(driver);
        driver.get("https://practice.expandtesting.com/notes/app");
        homePage.clickButtonCreateAccount();
        palaukti();
    }

    @Test
    void testRegisterLoginButtons() {
        RegisterPage registerPage = new RegisterPage(driver);
        driver.get("https://practice.expandtesting.com/notes/app/register");

        String actualTitle = registerPage.getRegisteredPageText();
        String expectedTitle = "Register";
        assertEquals(expectedTitle, actualTitle);
        palaukti();

        registerPage.enterEmail("aiste2000005056128536359012306@gmail.com");
        palaukti();
        registerPage.enterPassword("aisteaiste");
        palaukti();
        registerPage.enterName("AisteKD");
        palaukti();
        registerPage.enterConfirmPassword("aisteaiste");
        palaukti();
        registerPage.clickButtonRegister();
        palaukti();

        MyAccountPage myAccountPage = new MyAccountPage(driver);
        String actualTitle1 = myAccountPage.getMyAccountText();
        String expectedTitle1 = "User account created successfully";
        assertEquals(expectedTitle1, actualTitle1);
        palaukti();

        myAccountPage.clickBackToLoginPageButton();
        palaukti();

        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://practice.expandtesting.com/notes/app/login");
        loginPage.enterEmail("aiste2000005056128536359012306@gmail.com");
        palaukti();
        loginPage.enterPassword("aisteaiste");
        palaukti();
        loginPage.clickButton();
        palaukti();

        String actualTitle2 = loginPage.getLoginText();
        String expectedTitle2 = "Profile";
        assertEquals(expectedTitle2, actualTitle2);
        palaukti();

        loginPage.clickProfileButton();
        palaukti();

        String actualTitle3 = loginPage.getProfileInputText();
        String expectedTitle3 = "AisteKD";
        assertEquals(expectedTitle3, actualTitle3);
        palaukti();

        loginPage.clickBLogoutButton();
        palaukti();
    }

    @Test
    void testButtonCreateAccountAndLoginWithIncorrectCredential() {
        HomePage homePage = new HomePage(driver);
        driver.get("https://practice.expandtesting.com/notes/app");
        homePage.clickLoginButton();
        palaukti();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterIncorrectEmail("aiste24@gmail.com");
        palaukti();
        loginPage.enterIncorrectPassword("lelija");
        palaukti();
        loginPage.clickButton();
        palaukti();
        String errorMessage = homePage.getErrorMessage();
        String expectedMessage = "Incorrect email address or password";
        assertEquals(expectedMessage, errorMessage);
    }
}
