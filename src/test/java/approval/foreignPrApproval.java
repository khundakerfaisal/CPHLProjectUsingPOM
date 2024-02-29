package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class foreignPrApproval {
    private WebDriver driver;
    public foreignPrApproval(WebDriver driver){
        this.driver = driver;


    }
    public void foreignPrApprovalState()throws InterruptedException {
        // Pr Save button Pressed
        WebElement prSubmit = driver.findElement(By.xpath("//button[@title='Save record']"));
        prSubmit.click();
        Thread.sleep(3000);
        // Pr Store Hod Approval button Pressed
        WebElement PrStoreHodApproval = driver.findElement(By.xpath("//button[@name='button_store_hod_approve']"));
        PrStoreHodApproval.click();
        Thread.sleep(3000);

        // Pr Hod Approval button Pressed
        WebElement PrHodApproval = driver.findElement(By.xpath("//button[@name='button_hod_approve']"));
        PrHodApproval.click();
        Thread.sleep(8000);

        // Pr pm Approval button Pressed
        WebElement PrPmApproval = driver.findElement(By.xpath("//button[@name='button_pm_approve']"));
        PrPmApproval.click();
        Thread.sleep(8000);

        // Pr pm Ops Approval button Pressed
        WebElement PrPmOpsApproval = driver.findElement(By.xpath("//button[@name='button_pm_ops_approve']"));
        PrPmOpsApproval.click();
        Thread.sleep(8000);

        // Pr SCM Approval button Pressed
        WebElement PrScmApproval = driver.findElement(By.xpath("//button[@name='button_scm_approve']"));
        PrScmApproval.click();
        Thread.sleep(8000);

        // Pr COO Approval button Pressed
        WebElement PrCooApproval = driver.findElement(By.xpath("//button[@name='button_coo_approved']"));
        PrCooApproval.click();
        Thread.sleep(8000);

        // Pr Final/Done Approval button Pressed
        WebElement PrFinalApproval = driver.findElement(By.xpath("//button[@name='button_done' and @states='coo_approved']"));
        PrFinalApproval.click();
        Thread.sleep(8000);


    }
}
