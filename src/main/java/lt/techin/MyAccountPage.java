package lt.techin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage{
    public MyAccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/b")
    WebElement myAccountText;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div/div/div[2]/div/a")
    WebElement backToLoginPageButton;

    @FindBy(id = "email")
    WebElement inputLoginEmail;

    @FindBy(id = "password")
    WebElement inputLoginPassword;

    public String getMyAccountText() {
        return myAccountText.getText();
    }

    public void enterEmail(String email){
        inputLoginEmail.sendKeys(email);
    }

    public void enterPassword(String password){
       inputLoginPassword.sendKeys(password);
    }

    public void clickBackToLoginPageButton(){
        backToLoginPageButton.click();
    }
}
