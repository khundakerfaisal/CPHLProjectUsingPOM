package TestRunner;

import config.setupPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.localPurchaseRequisition;
import pages.rfq;

public class rfqTestRunner extends setupPage {
    @Test(priority = 1)
    public void doLoinWithValidCred(){

        LoginPage loginPage=new LoginPage(driver);
        loginPage.doLogin("Live_Data_Migration","1234");
        String textActual=driver.findElement(By.xpath("//span[@id='ks_dashboard_title_label']")).getText();
        String textExpected="My Dashboard";
        Assert.assertTrue(textActual.contains(textExpected));

    }
    @Test(priority = 2)

    public void createNewRfq() throws InterruptedException {
        rfq newRfq=new rfq(driver);
        newRfq.InitiateRfq(driver);
        String textActual=driver.findElements(By.className("breadcrumb-item")).get(0).getText();
        String textExpected="Request For Quotations";
        Assert.assertTrue(textActual.contains(textExpected));
    }
}
