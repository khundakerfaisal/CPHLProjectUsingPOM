package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class noteSheetApproval {
    private WebDriver driver;
    public noteSheetApproval(WebDriver driver){
        this.driver = driver;
    }
    public void noteSheetApprovalState()throws InterruptedException {

        WebElement noteSheetPoFinalSubmit = driver.findElement(By.xpath("//button[@title='Save record']"));
        noteSheetPoFinalSubmit.click();
        Thread.sleep(3000);

        // Local po Scm Approval button Pressed
        WebElement noteSheetPoScmApproval = driver.findElement(By.xpath("//button[@name='action_scm_approve']"));
        noteSheetPoScmApproval.click();
        Thread.sleep(3000);
        // Local po Scm Coo Approval button Pressed
        WebElement noteSheetPoCooApproval = driver.findElement(By.xpath("//button[@name='action_coo_approve']"));
        noteSheetPoCooApproval.click();
        Thread.sleep(3000);

        // Local po Confirm Approval button Pressed
        WebElement noteSheetPoMdApproval = driver.findElement(By.xpath("//button[@name='action_md_approve']"));
        noteSheetPoMdApproval.click();
        Thread.sleep(3000);
        WebElement noteSheetPoFinalApproval = driver.findElement(By.xpath("//button[@name='action_done']"));
        noteSheetPoFinalApproval.click();
        Thread.sleep(3000);



    }
}
