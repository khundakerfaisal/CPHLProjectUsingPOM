package TestRunner;
import config.setupPage;
import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;


public class LoginTestRunner extends setupPage {
    @Test(priority = 1)
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
        String adminUser=System.getProperty("username");
        String adminPass=System.getProperty("password");
        loginPage.doLogin(adminUser,adminPass);

//        loginPage.doLogin("Live_Data_Migration","@!livemigrate1234#");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }

//    public void doLogout(){
//
//
//    }
}
