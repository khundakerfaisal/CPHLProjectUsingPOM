package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class landedCostApproval {
    private WebDriver driver;
    public landedCostApproval(WebDriver driver){
        this.driver =driver;
    }
    public void landedCostApprovalState(WebDriver driver) throws InterruptedException {
        WebElement landedCostSubmit = driver.findElement(By.xpath("//button[@title='Save record']"));
        landedCostSubmit.click();
        Thread.sleep(3000);

        WebElement landedCostSentForApproval = driver.findElement(By.xpath("//button[@name='send_to_approver']"));
        landedCostSentForApproval.click();
        Thread.sleep(3000);


        WebElement landedCostFinalApproval = driver.findElement(By.xpath("//button[@name='validate_landed_cost']"));
        landedCostFinalApproval.click();
        Thread.sleep(3000);


    }
}
