package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class qcApproval {
    private WebDriver driver;
    public qcApproval(WebDriver driver){
        this.driver = driver;
    }
    public void qcApprovalState()throws InterruptedException {



        // QC Review Approval  button Pressed
        WebElement qcReviewApproval = driver.findElement(By.xpath("//button[@name='button_send_for_qa_review']"));
        qcReviewApproval.click();
        Thread.sleep(3000);

        // QC Final Approval button Pressed

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement qcFinalApproval = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='button_qa_approve']")));
        qcFinalApproval.click();

//        WebElement qcFinalApproval = driver.findElement(By.xpath("//button[@name='button_qa_approve']"));
//        qcFinalApproval.click();
        Thread.sleep(60 * 1000);
//        Thread.sleep(10000); // 60 seconds * 1000 milliseconds


        // Send For MRR button Pressed
        WebElement sendForMRRButton = driver.findElement(By.xpath("//button[@name='button_send_for_mrr']"));
        sendForMRRButton.click();
        Thread.sleep(3000);


    }
}
