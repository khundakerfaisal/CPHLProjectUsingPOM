package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class foreignPoApproval {
    private WebDriver driver;
    public foreignPoApproval(WebDriver driver){
        this.driver = driver;
    }
    public void foreignPoApprovalState()throws InterruptedException {

        WebElement foreignPoFinalSubmit = driver.findElement(By.xpath("//button[@title='Save record']"));
        foreignPoFinalSubmit.click();
        Thread.sleep(1000);

        // foreign Po Scm Approval button Pressed
        WebElement foreignPoScmApproval = driver.findElement(By.xpath("//button[@name='send_for_scm_approval']"));
        foreignPoScmApproval.click();
        Thread.sleep(1000);
        // foreign PoScm Coo Approval button Pressed
        WebElement foreignPoScmCooApproval = driver.findElement(By.xpath("//button[@name='send_for_scm_coo_approval']"));
        foreignPoScmCooApproval.click();
        Thread.sleep(1000);

        // foreign Po Confirm Approval button Pressed
        WebElement foreignPoConfirmApproval = driver.findElement(By.xpath("//button[@name='button_confirm']"));
        foreignPoConfirmApproval.click();
        Thread.sleep(1000);

        // foreign Po MD Approval button Pressed
        WebElement foreignPoMdApproval = driver.findElement(By.xpath("//button[@name='button_approve']"));
        foreignPoMdApproval.click();
        Thread.sleep(1000);


    }
}
