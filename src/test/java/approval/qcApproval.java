package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qcApproval {
    private WebDriver driver;
    public qcApproval(WebDriver driver){
        this.driver = driver;
    }
    public void qcApprovalState()throws InterruptedException {



        // QC Review Approval  button Pressed
        WebElement qcReviewApproval = driver.findElement(By.xpath("//button[@name='button_send_for_qa_review']"));
        qcReviewApproval.click();
        Thread.sleep(1000);

        // QC Final Approval button Pressed
        WebElement qcFinalApproval = driver.findElement(By.xpath("//button[@name='button_qa_approve']"));
        qcFinalApproval.click();
        Thread.sleep(1000);

        // Send For MRR button Pressed
        WebElement sendForMRRButton = driver.findElement(By.xpath("//button[@name='button_send_for_mrr']"));
        sendForMRRButton.click();
        Thread.sleep(1000);


    }
}
