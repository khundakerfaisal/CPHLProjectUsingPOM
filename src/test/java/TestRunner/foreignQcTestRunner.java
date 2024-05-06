package TestRunner;

import config.setupPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.foreignQc;
import pages.localQc;

public class foreignQcTestRunner extends setupPage {
    @Test(priority = 1)
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
//        String adminUser=System.getProperty("username");
//        String adminPass=System.getProperty("password");
//        loginPage.doLogin(adminUser,adminPass);
        loginPage.doLogin("Live_Data_Migration","1234");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }
    @Test(priority = 2,description = "Foreign QC created")

    public void foreignQcCreate() throws InterruptedException {
        foreignQc foreignQc=new foreignQc(driver);
        foreignQc.foreignQcCreate(driver);
        String textActual=driver.findElements(By.className("breadcrumb-item")).get(0).getText();
        Thread.sleep(1000);
        String textExpected="QC";
        Assert.assertTrue(textActual.contains(textExpected));


    }
}
