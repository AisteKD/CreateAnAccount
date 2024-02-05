package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement inputEmail;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/form/div[2]/button")
    WebElement clickLoginButton;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
    WebElement loginPageText;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[2]/button")
    WebElement logoutButton;

    @FindBy(xpath = "//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")
    WebElement profileButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[2]/div/div/div/div/div/form/div[1]/div[1]/div[3]/input")
    WebElement inputcheckProfile;



    public void enterEmail(String mail) {
        inputEmail.sendKeys(mail);
    }

    public void enterPassword(String aisteaiste) {
        inputPassword.sendKeys(aisteaiste);
    }

    public void clickButton() {
        clickLoginButton.click();
    }

    public String getLoginText() {
        return loginPageText.getText();
    }

    public void clickBLogoutButton() {
        logoutButton.click();
    }

    public void clickProfileButton() {
        profileButton.click();
    }

    public String getProfileInputText() {
        return inputcheckProfile.getAttribute("value");
    }

    public void enterIncorrectEmail(String mail) {
        inputEmail.sendKeys(mail);
    }

    public void enterIncorrectPassword(String password) {
        inputPassword.sendKeys(password);
    }
}
