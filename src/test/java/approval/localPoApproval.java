package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class localPoApproval {
    private WebDriver driver;
    public localPoApproval(WebDriver driver){
        this.driver = driver;
    }
    public void LocalPoApprovalState()throws InterruptedException {

        WebElement agreementPoFinalSubmit = driver.findElement(By.xpath("//button[@title='Save record']"));
        agreementPoFinalSubmit.click();
        Thread.sleep(2000);

        // Local po Scm Approval button Pressed
        WebElement LocalPoScmApproval = driver.findElement(By.xpath("//button[@name='send_for_scm_approval']"));
        LocalPoScmApproval.click();
        Thread.sleep(2000);
        // Local po Scm Coo Approval button Pressed
        WebElement LocalPoScmCooApproval = driver.findElement(By.xpath("//button[@name='send_for_scm_coo_approval']"));
        LocalPoScmCooApproval.click();
        Thread.sleep(2000);

        // Local po Confirm Approval button Pressed
        WebElement LocalPoConfirmApproval = driver.findElement(By.xpath("//button[@name='button_confirm']"));
        LocalPoConfirmApproval.click();
        Thread.sleep(2000);






    }
}
