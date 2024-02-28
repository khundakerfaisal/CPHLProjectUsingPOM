package TestRunner;

import config.setupPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.foreignOrderWithCs;
import pages.foreignPi;

public class foreignPiTestRunner extends setupPage {
    @Test(priority = 1)
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.doLogin("Live_Data_Migration","1234");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }
    @Test(priority = 2)

    public void foreignPiCreate() throws InterruptedException {
        foreignPi foreignPi=new foreignPi(driver);
        foreignPi.piCreate(driver);
        String textActual=driver.findElements(By.className("breadcrumb-item")).get(0).getText();
        Thread.sleep(1000);
        String textExpected="Proforma Invoice";
        Assert.assertTrue(textActual.contains(textExpected));


    }
}
