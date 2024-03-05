package pages;

import approval.mrApproval;
import com.google.j2objc.annotations.Weak;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class MaterialRequisition {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Inventory']")
    WebElement btnInventoryMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='cphl_inventory.menu_qa_mrr_root']")
    WebElement btnOperationsMenu;

    @FindBy(xpath = "//a[text()='Material Requisition']")
    WebElement btnMrrSubMenu;

    @FindBy(className = "btn-primary")
    List<WebElement> btnMrCreateButton;


    @FindBy(xpath = "//div[@name='approve_user_ids']")
    WebElement mrApprovedSelection;



    @FindBy(xpath = "//ul[@id='ui-id-1']/li[2]")
    WebElement mrApprovedValueSelection;


    @FindBy(xpath = "//input[@name='requisition_deadline']")
    WebElement dateSelect;


    @FindBy(xpath = "//a[text()='Add a line']")
    WebElement productLineSelection;


    @FindBy(className = "o_input_dropdown")
    List<WebElement> productDropdownSelection;

    @FindBy(xpath = "//a[contains(text(), '1 Gang 1 -Way Switch')]")
    WebElement productDropdownValueSelection;

    @FindBy(xpath = "//input[@name='quantity']")
    WebElement productQtyAdding;

    public MaterialRequisition(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void createMrr(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(1000);

        btnInventoryMenu.click();
        Thread.sleep(1000);

        btnOperationsMenu.click();
        Thread.sleep(1000);

        btnMrrSubMenu.click();
        Thread.sleep(1000);

        btnMrCreateButton.get(1).click();
        Thread.sleep(1000);

        mrApprovedSelection.click();
        Thread.sleep(1000);
        mrApprovedValueSelection.click();
        Thread.sleep(1000);


        dateSelect.click();
        dateSelect.clear();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        dateSelect.sendKeys(formattedDateTime);
        Thread.sleep(2000);

        productLineSelection.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        executor.executeScript("arguments[0].scrollIntoView(true);", productLineSelection);

        productDropdownSelection.get(1).click();
        Thread.sleep(1000);

        productDropdownValueSelection.click();
        Thread.sleep(2000);
//        dropdownBudgetSelection.get(2).click();
        productQtyAdding.clear();
        productQtyAdding.sendKeys("5");
        Thread.sleep(2000);

        mrApproval mrApproval=new mrApproval(driver);
        mrApproval.mrApprovalState();
        Thread.sleep(2000);

        System.out.println("MR Created Successfully");


    }
}
