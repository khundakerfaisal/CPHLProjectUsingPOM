package TestRunner;
import config.setupPage;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTestRunner extends setupPage {
    @Test
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.doLogin("Live_Data_Migration","1234");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }

//    public void doLogout(){
//
//
//    }
}
