package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mrApproval {
    private WebDriver driver;
    public mrApproval(WebDriver driver){
        this.driver = driver;
    }
    public void mrApprovalState()throws InterruptedException {

        // MR Submit button Pressed
        WebElement mrSubmit = driver.findElement(By.xpath("//button[@title='Save record']"));
        mrSubmit.click();
        Thread.sleep(3000);


        // MR Review Approval  button Pressed
        WebElement mrReviewApproval = driver.findElement(By.xpath("//button[@name='button_review']"));
        mrReviewApproval.click();
        Thread.sleep(3000);

        // MR Final Approval button Pressed
        WebElement mrFinalApproval = driver.findElement(By.xpath("//button[@name='button_approved']"));
        mrFinalApproval.click();
        Thread.sleep(15000);



    }
}
