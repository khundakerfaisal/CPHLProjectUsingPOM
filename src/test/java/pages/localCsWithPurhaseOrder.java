package pages;

import approval.localPoApproval;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class localCsWithPurhaseOrder {
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

    @FindBy(xpath = "//div[@name='rfq_ids']")
    WebElement localPoRfqDropdownSelect;

    @FindBy(className = "ui-menu-item")
    List<WebElement> localPoRfqDropdownValueSelect;

    @FindBy(xpath = "//div[@name='budget_id']")
    WebElement localPoRfqBudgetSelect;


    @FindBy(xpath = "//ul[@id='ui-id-3']/li[1]/a")
    WebElement localPoRfqBudgetValueSelect;


    public localCsWithPurhaseOrder(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void localPoWithCs(WebDriver driver) throws InterruptedException {
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
        select.selectByVisibleText("Comparative Statement");
        Thread.sleep(1000);

        localPoRfqDropdownSelect.click();
        localPoRfqDropdownValueSelect.get(0).click();
        Thread.sleep(1000);

        localPoRfqBudgetSelect.click();
        localPoRfqBudgetValueSelect.click();
        Thread.sleep(1000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        executor.executeScript("arguments[0].scrollIntoView(true);", localPoRfqBudgetSelect);
        localPoApproval localPoApproval=new localPoApproval(driver);
        localPoApproval.LocalPoApprovalState();
        System.out.println("Local Cs-based PO Created Successfully");


    }
}
