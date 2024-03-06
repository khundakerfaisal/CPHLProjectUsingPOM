package pages;

import approval.miApproval;
import approval.mrrApproval;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class materialIssue {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Inventory']")
    WebElement btnInventoryMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='cphl_inventory.menu_qa_mrr_root']")
    WebElement btnOperationsMenu;

    @FindBy(xpath = "//a[text()='Material Issue']")
    WebElement btnMiSubMenu;


    @FindBy(xpath = "//tr[@data-id='material.issue_2']/td[@name=\"name\"][1]")
    WebElement lastMiSelection;
    public  materialIssue(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public  void MiSelection(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(1000);
        btnInventoryMenu.click();
        Thread.sleep(1000);
        btnOperationsMenu.click();
        Thread.sleep(1000);
        btnMiSubMenu.click();
        Thread.sleep(1000);

        lastMiSelection.click();
        Thread.sleep(1000);

        miApproval miApproval=new miApproval(driver);
        miApproval.miApprovalState();
        Thread.sleep(1000);
        System.out.println("MI Created successfully");



    }

}
