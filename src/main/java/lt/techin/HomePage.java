package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[1]/a[2]")
    WebElement createAccountButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div[1]/div[1]/a[1]")
    WebElement clickLoginButton;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[1]/div/div/div/div")
    WebElement errorMessage;

    public void clickButtonCreateAccount() {
        createAccountButton.click();
    }

    public void clickLoginButton() {
        clickLoginButton.click();
    }

    public String getErrorMessage() {
        return errorMessage.getText();
    }
}
