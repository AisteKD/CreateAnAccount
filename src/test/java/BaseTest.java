import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    WebDriver driver;

    @BeforeEach
    void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

//    @AfterEach
//    void tearDown() {
//        driver.close();
//    }

    public void palaukti() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
    }
}
