package pages;

import approval.landedCostApproval;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class landedCost {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Inventory']")
    WebElement btnInventoryMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='cphl_inventory.menu_qa_mrr_root']")
    WebElement btnOperationsMenu;

    @FindBy(xpath = "//a[text()='Landed Cost']")
    WebElement btnLandedCostSubMenu;

    @FindBy(className = "btn-primary")
    List<WebElement> foreignLandedCostCreateButton;

    @FindBy(xpath = "//input[@name='name']")
    WebElement generateAutoNumber;




    @FindBy(xpath = "//div[@name='ci_id']")
    WebElement commercialInvoiceSelect;


    @FindBy(className = "ui-menu-item")
    List<WebElement> commercialInvoiceValueSelect;


    @FindBy(xpath = "//div[@name='approved_user_ids']")
    WebElement commercialApprovalSelect;


    @FindBy(xpath = "//a[text()='Approver']")
    WebElement commercialApprovalValueSelect;

//    @FindBy(className = "ui-menu-item")
//    List<WebElement> commercialApprovalValueSelect;


    @FindBy(xpath = "//input[@name='amount']")
    WebElement commercialOtherCostInput;
    public landedCost(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void landedCostCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(2000);
        btnInventoryMenu.click();
        Thread.sleep(2000);
        btnOperationsMenu.click();
        Thread.sleep(2000);

        btnLandedCostSubMenu.click();
        Thread.sleep(2000);

        foreignLandedCostCreateButton.get(1).click();
        Thread.sleep(2000);
        Random random=new Random();
        String formattedYear = "2024";
        int formattedSequence = random.nextInt(200001);
        String autoNumber = "L-cost-" + formattedYear + "-" + formattedSequence;
        generateAutoNumber.sendKeys(autoNumber);
        Thread.sleep(1000);

        commercialInvoiceSelect.click();
        Thread.sleep(2000);

        commercialInvoiceValueSelect.get(0).click();
        Thread.sleep(2000);
        JavascriptExecutor executor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        executor.executeScript("arguments[0].scrollIntoView(true);", commercialInvoiceSelect);

        commercialApprovalSelect.click();
        Thread.sleep(2000);
        commercialApprovalValueSelect.click();
        Thread.sleep(2000);

        commercialOtherCostInput.clear();
        commercialOtherCostInput.sendKeys("500");
        Thread.sleep(2000);

        landedCostApproval landedCostApproval=new landedCostApproval(driver);
        landedCostApproval.landedCostApprovalState(driver);
        Thread.sleep(2000);
        System.out.println("Landed Cost created Successfully");



    }
}
