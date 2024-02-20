package TestRunner;

import config.setupPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.localPurchaseRequisition;
import pages.sitePurchaseRequisition;

public class sitePrTestRunner extends setupPage {
    @Test(priority = 1)
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.doLogin("Live_Data_Migration","1234");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }
    @Test(priority = 2)

    public void sitePrCreate() throws InterruptedException {
        sitePurchaseRequisition sitePurchaseRequisition=new sitePurchaseRequisition(driver);
        sitePurchaseRequisition.sitePr(driver);
        String textActual=driver.findElements(By.className("breadcrumb-item ")).get(0).getText();
        String textExpected="Purchase Requisition";
        Assert.assertTrue(textActual.contains(textExpected));


    }
}