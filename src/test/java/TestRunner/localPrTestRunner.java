package TestRunner;

import config.setupPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.localPurchaseRequisition;

public class localPrTestRunner extends setupPage {
    @Test(priority = 1)
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
        String adminUser=System.getProperty("username");
        String adminPass=System.getProperty("password");
        loginPage.doLogin(adminUser,adminPass);
//        loginPage.doLogin("Live_Data_Migration","1234");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }
    @Test(priority = 2)

    public void localPr() throws InterruptedException {
        localPurchaseRequisition localPurchaseRequisition=new localPurchaseRequisition(driver);
        localPurchaseRequisition.localPr(driver);
        String textActual=driver.findElements(By.className("btn-primary")).get(2).getText();
        String textExpected="Request for Quotations";
        Assert.assertTrue(textActual.contains(textExpected));


    }
}
