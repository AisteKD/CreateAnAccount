package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    public RegisterPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/h1")
    WebElement registeredPageText;

    @FindBy(xpath = "/html//input[@id='email']")
    WebElement inputEmail;

    @FindBy(id = "password")
    WebElement inputPassword;

    @FindBy(id = "name")
    WebElement inputName;

    @FindBy(id = "confirmPassword")
    WebElement inputConfirmPassword;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/form/div[2]/button")
    WebElement buttonRegister;

    public String getRegisteredPageText() {
        return registeredPageText.getText();
    }

    public void enterEmail(String email) {
        inputEmail.sendKeys(email);
    }

    public void enterPassword(String password) {
        inputPassword.sendKeys(password);
    }

    public void enterName(String name) {
        inputName.sendKeys(name);
    }

    public void enterConfirmPassword(String confirmPassword) {
        inputConfirmPassword.sendKeys(confirmPassword);
    }

    public void clickButtonRegister() {
        buttonRegister.click();
    }
}
