package pages;

import approval.localPoApproval;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class localPurchaseOrderNotesheet {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Local Purchase Order']")
    WebElement localPoSubMenu;
    @FindBy(className = "btn-primary")
    List<WebElement> localPoCreateButton;

    @FindBy(xpath = "//Select[@name='purchase_base']")
    WebElement localPoPurchaseBaseSelect;

    @FindBy(xpath = "//div[@name='notesheet_ids']")
    WebElement localPoNoteSheetSelect;

    @FindBy(className = "ui-menu-item")
    List<WebElement> localPoNoteSheetDropdownValueSelect;

    @FindBy(xpath = "//div[@name='budget_id']")
    WebElement localPoNoteSheetBudgetSelect;


    @FindBy(xpath = "//ul[@id='ui-id-3']/li[1]/a")
    WebElement localPoNoteSheetBudgetValueSelect;
    public localPurchaseOrderNotesheet(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void noteSheetPo(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        localPoSubMenu.click();
        Thread.sleep(1000);
        localPoCreateButton.get(1).click();
        localPoPurchaseBaseSelect.click();
        Select select=new Select(localPoPurchaseBaseSelect);
        select.selectByVisibleText("Notesheet");
        Thread.sleep(1000);

        localPoNoteSheetSelect.click();
        localPoNoteSheetDropdownValueSelect.get(0).click();
        Thread.sleep(1000);

        localPoNoteSheetBudgetSelect.click();
        localPoNoteSheetBudgetValueSelect.click();
        Thread.sleep(1000);

        JavascriptExecutor executor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        executor.executeScript("arguments[0].scrollIntoView(true);", localPoNoteSheetBudgetSelect);
        localPoApproval localPoApproval=new localPoApproval(driver);
        localPoApproval.LocalPoApprovalState();
        System.out.println("Local NoteSheet-based PO Created Successfully");

    }
}
