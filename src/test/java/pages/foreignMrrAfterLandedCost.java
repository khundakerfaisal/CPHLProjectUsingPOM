package pages;

import approval.foreignMrrApprovalLandedCost;
import approval.mrrApproval;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class foreignMrrAfterLandedCost {
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
    public  foreignMrrAfterLandedCost(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void foreignMrrLandedCostApproval(WebDriver driver) throws InterruptedException {

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

        foreignMrrApprovalLandedCost foreignMrrApprovalLandedCost=new foreignMrrApprovalLandedCost(driver);
        foreignMrrApprovalLandedCost.foreignMrrApprovalState();
        Thread.sleep(1000);
        System.out.println("Foreign MRR Created successfully");


    }
}
