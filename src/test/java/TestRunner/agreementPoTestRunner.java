package TestRunner;

import config.setupPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.agreementPurchaseOrder;
import pages.sitePurchaseOrder;

public class agreementPoTestRunner extends setupPage {
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
    @Test(priority = 2)

    public void agreementPoCreate() throws InterruptedException {
        agreementPurchaseOrder agreementPurchaseOrder=new agreementPurchaseOrder(driver);
        agreementPurchaseOrder.agreementPo(driver);
        String textActual=driver.findElements(By.className("breadcrumb-item")).get(0).getText();
        Thread.sleep(1000);
        String textExpected="Local Purchase Order";
        Assert.assertTrue(textActual.contains(textExpected));


    }
}
