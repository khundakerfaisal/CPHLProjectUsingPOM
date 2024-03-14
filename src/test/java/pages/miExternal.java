package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class miExternal {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Inventory']")
    WebElement btnInventoryMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='cphl_inventory.menu_qa_mrr_root']")
    WebElement btnOperationsMenu;

    @FindBy(xpath = "//a[text()='Material Issue']")
    WebElement btnMiSubMenu;

    @FindBy(xpath = "//button[@data-original-title='Create record']")
    WebElement btnExternalMiCreate;

    @FindBy(xpath = "//div[@name='receiver_company_id']")
    WebElement receiverPlantSelect;

    @FindBy(className = "ui-menu-item")
    List<WebElement> receiverPlantValueSelection;


    @FindBy(xpath = "//input[@name='loading_master']")
    WebElement loading_master;

    @FindBy(xpath = "//a[text()='Add a line']")
    WebElement miProductLineSelection;

    @FindBy(xpath = "//div[@name='product_id']")
    WebElement miProductDropdownSelection;

    @FindBy(xpath = "//a[contains(text(), 'HFO')]")
    WebElement miProductDropdownValueSelection;

    @FindBy(xpath = "//input[@name='quantity']")
    WebElement miProductQtySelection;


    @FindBy(xpath = "//button[@title='Save record']")
    WebElement miSubmitButton;

    @FindBy(xpath = "//button[@name='button_approved']")
    WebElement miFinalApproveButton;
    public  miExternal(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void miExternalCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(1000);
        btnInventoryMenu.click();
        Thread.sleep(1000);
        btnOperationsMenu.click();
        Thread.sleep(1000);
        btnMiSubMenu.click();
        Thread.sleep(1000);

        btnExternalMiCreate.click();
        Thread.sleep(1000);

        receiverPlantSelect.click();


        receiverPlantValueSelection.get(4).click();
        Thread.sleep(2000);

        loading_master.click();
        JavascriptExecutor executor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        executor.executeScript("arguments[0].scrollIntoView(true);",loading_master);

        miProductLineSelection.click();
        Thread.sleep(1000);
        miProductDropdownSelection.click();
        miProductDropdownValueSelection.click();
        Thread.sleep(2000);
        miProductQtySelection.clear();
        miProductQtySelection.sendKeys("4.500");
        miSubmitButton.click();
        Thread.sleep(2000);
        miFinalApproveButton.click();
        Thread.sleep(2000);
        System.out.println("External MI Created successfully");

    }
}
