package pages;

import approval.mrrApproval;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MRR {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Inventory']")
    WebElement btnInventoryMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='cphl_inventory.menu_qa_mrr_root']")
    WebElement btnOperationsMenu;

    @FindBy(xpath = "//a[text()='MRR']")
    WebElement btnMrrSubMenu;


    @FindBy(xpath = "//tr[@data-id='qa.mrr_2']/td[@name=\"name\"][1]")
    WebElement lastMrrSelection;

    public MRR(WebDriver  driver){
        PageFactory.initElements(driver,this);
    }
    public void MrrSelection(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(1000);
        btnInventoryMenu.click();
        Thread.sleep(1000);
        btnOperationsMenu.click();
        Thread.sleep(1000);
        btnMrrSubMenu.click();
        Thread.sleep(1000);

        lastMrrSelection.click();
        Thread.sleep(1000);

        mrrApproval mrrApproval=new mrrApproval(driver);
        mrrApproval.mrrApprovalState();
        Thread.sleep(1000);
        System.out.println("MRR Created successfully");



    }
}
