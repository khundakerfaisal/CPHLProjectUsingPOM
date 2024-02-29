package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class csApproval {
    private WebDriver driver;
    public csApproval(WebDriver driver){
        this.driver =driver;
    }
    public void csApprovalState(WebDriver driver) throws InterruptedException {
        WebElement csSendToSCMHOD = driver.findElement(By.xpath("//button[@name='action_send_to_scm_hod']"));
        csSendToSCMHOD.click();

        Thread.sleep(3000);

        WebElement csSendToCooOPS = driver.findElement(By.xpath("//button[@name='action_send_to_coo_ops']"));
        csSendToCooOPS.click();

        Thread.sleep(3000);

        WebElement csSendScmCoo = driver.findElement(By.xpath("//button[@name='action_send_to_scm_coo']"));
        csSendScmCoo.click();

        Thread.sleep(3000);

        WebElement csFinalApprover = driver.findElement(By.xpath("//button[@name='action_approve']"));
        csFinalApprover.click();

        Thread.sleep(3000);

    }
}
