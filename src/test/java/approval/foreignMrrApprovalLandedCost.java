package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class foreignMrrApprovalLandedCost {
    private WebDriver driver;
    public foreignMrrApprovalLandedCost(WebDriver driver){
        this.driver = driver;
    }
    public void foreignMrrApprovalState()throws InterruptedException {


        // MRR Final Approval button Pressed
        WebElement mrrFinalApproval = driver.findElement(By.xpath("//button[@name='button_mrr_approve']"));
        mrrFinalApproval.click();
        Thread.sleep(3000);



    }
}
