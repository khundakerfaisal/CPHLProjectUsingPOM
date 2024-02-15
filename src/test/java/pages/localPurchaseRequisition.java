package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class localPurchaseRequisition {

    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(className = "dropdown-item")
    List<WebElement> btnPrMenu;
    @FindBy(xpath = "//button[@data-original-title='Create record']")
    WebElement btnPrCreate;
    @FindBy(className = "o_input_dropdown")
    List<WebElement> budgetDropdownOptions;

    @FindBy(className = "ui-menu-item")
    List<WebElement> dropdownBudgetSelection;

    @FindBy(xpath = "//input[@name='requisition_date']")
    WebElement dateSelect;

    @FindBy(xpath = "//select[@name='priority']")
    WebElement prioritySelect;

    @FindBy(name = "requirement_for")
    WebElement requirement_forSelect;



    @FindBy(name = "requisition_type")
    WebElement requirementTypeSelect;
    @FindBy(name = "purchase_type")
    WebElement purchase_typeSelect;
//    @FindBy(name = "assigned_to")
//    WebElement approveBySelect;
    @FindBy(className = "ui-autocomplete-input")
    List<WebElement> approveBySelect;
//    @FindBy(className = "ui-menu-item")
//    List<WebElement> approverOptionSelect;

    public localPurchaseRequisition(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void localPr() throws InterruptedException {

        btnHomeMenu.click();

        btnPrMenu.get(5).click();
        Thread.sleep(1000);
        btnPrCreate.click();
        Thread.sleep(1000);
        //        End procurement Root Menu selection
        //        Budget Select section
        budgetDropdownOptions.get(0).click();
        Thread.sleep(1000);
        dropdownBudgetSelection.get(0).click();
        Thread.sleep(1000);
        //        End budget selection
        //        Date Selection
        dateSelect.click();
        dateSelect.clear();
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        dateSelect.sendKeys(formattedDateTime);
        Thread.sleep(2000);
        //        End date selection
        //        Priority selection
        prioritySelect.click();
        Select prioritySelection = new Select(prioritySelect);
        prioritySelection.selectByVisibleText("High");
        Thread.sleep(2000);
        //        End priority selection
        requirement_forSelect.click();
        Select requirementSelect = new Select(requirement_forSelect);
        requirementSelect.selectByVisibleText("Operation");
        Thread.sleep(2000);
//        End Requirement for selection
        requirementTypeSelect.click();
        Select requisitionSelect = new Select(requirementTypeSelect);
        requisitionSelect.selectByVisibleText("Local");
        Thread.sleep(2000);
//        End requirementTypeSelect selection
        purchase_typeSelect.click();
        Select purchaseTypeSelect = new Select(purchase_typeSelect);
        purchaseTypeSelect.selectByVisibleText("New Purchase");
        Thread.sleep(2000);
//        End purchaseTypeSelect selection
        approveBySelect.get(1).click();
//        approveBySelect.get(1).sendKeys(Keys.ARROW_DOWN);
        approveBySelect.get(1).sendKeys(Keys.ENTER);

        Thread.sleep(2000);

    }
}
