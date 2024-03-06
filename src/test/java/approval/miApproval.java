package approval;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class miApproval {
    private WebDriver driver;
    public miApproval(WebDriver driver){
        this.driver = driver;
    }
    public void miApprovalState()throws InterruptedException {

        // Mi Submit button Pressed
//        WebElement miSubmit = driver.findElement(By.xpath("//button[@title='Save record']"));
//        miSubmit.click();
//        Thread.sleep(3000);


        // Mi Approval button Pressed
        WebElement miFinalApproval = driver.findElement(By.xpath("//button[@name='button_approved']"));
        miFinalApproval.click();
        Thread.sleep(1000);

        // Mi Final Approval button Pressed
//        WebElement miValidateApproval = driver.findElement(By.xpath("//button[@name='change_valuation_date']"));
//        miValidateApproval.click();
//        Thread.sleep(3000);


    }
}
