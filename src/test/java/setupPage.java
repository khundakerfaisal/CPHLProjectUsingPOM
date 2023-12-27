import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class setupPage {
    WebDriver driver;
    @BeforeTest
    public void startBrowser() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("http://10.10.14.196:9091/web/login");

    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
}
