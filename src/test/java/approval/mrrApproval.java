package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mrrApproval {
    private WebDriver driver;
    public mrrApproval(WebDriver driver){
        this.driver = driver;
    }
    public void mrrApprovalState()throws InterruptedException {



        // MRR Review Approval  button Pressed
        WebElement mrrReviewApproval = driver.findElement(By.xpath("//button[@name='button_send_for_mrr_review']"));
        mrrReviewApproval.click();
        Thread.sleep(1000);

        // MRR Final Approval button Pressed
        WebElement mrrFinalApproval = driver.findElement(By.xpath("//button[@name='button_mrr_approve']"));
        mrrFinalApproval.click();
        Thread.sleep(1000);



    }
}
