package TestRunner;

import config.setupPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.foreignOrderWithCs;
import pages.localCsWithPurhaseOrder;

public class foreignPoTestRunner extends setupPage {
    @Test(priority = 1)
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.doLogin("Live_Data_Migration","1234");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }
    @Test(priority = 2)

    public void foreignPoCreate() throws InterruptedException {
        foreignOrderWithCs foreignOrderWithCs=new foreignOrderWithCs(driver);
        foreignOrderWithCs.foreignPoWithCs(driver);
        String textActual=driver.findElements(By.className("breadcrumb-item")).get(0).getText();
        Thread.sleep(1000);
        String textExpected="Foreign Purchase Order";
        Assert.assertTrue(textActual.contains(textExpected));


    }
}
