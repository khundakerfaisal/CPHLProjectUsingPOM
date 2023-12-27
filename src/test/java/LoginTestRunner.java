import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTestRunner extends setupPage{
    @Test
    public void doLogin(){
        LoginPage loginPage= new LoginPage(driver);
        loginPage.doLogin("Live_Data_Migration","1234");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        boolean isNameExist = driver.findElements(By.className("oe_topbar_name")).get(1).isDisplayed();
        Assert.assertTrue(isNameExist);
    }

//    public void doLogout(){
//
//
//    }
}
