package pages;

import approval.localPoApproval;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.internal.thread.ThreadExecutionException;

import java.util.List;

public class agreementPurchaseOrder {
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

    @FindBy(xpath = "//div[@name='purchase_request_id']")
    WebElement agreementPrDropdownSelect;


    @FindBy(className = "ui-menu-item")
    List<WebElement> agreementPrDropdownValueSelect;

    @FindBy(xpath = "//div[@name='partner_id']")
    WebElement agreementVendorDropdownSelect;

    @FindBy(xpath = "//a[text()='M/S Al-Rabbi Hardware']")
    WebElement agreementVendorValueSelection;



    @FindBy(xpath = "//div[@name='agreement_id']")
    WebElement agreementIdSelect;




    @FindBy(xpath = "//ul[@id='ui-id-2']/li[1]/a")
    WebElement agreementValueSelect;

    @FindBy(xpath = "//div[@name='budget_id']")
    WebElement agreementPoBudgetSelect;


    @FindBy(xpath = "//ul[@id='ui-id-3']/li[1]/a")
    WebElement agreementPoBudgetValueSelect;


    @FindBy(xpath = "//tr[@data-id='purchase.order.line_62']//td[@name='price_unit']")
    WebElement agreementPoFirstRowSelection;



//    @FindBy(className = "o_data_row")
//    List<WebElement> agreementPoFirstRowSelection;

    @FindBy(xpath = "//td[@name='price_unit']/input")
    WebElement agreementPoFirstPriceInput;

//    @FindBy(className = "o_data_row")
//    List<WebElement> agreementPoSecondRowSelection;
    @FindBy(xpath = "//tr[@data-id='purchase.order.line_71']//td[@name='price_unit']")
    WebElement agreementPoSecondRowSelection;
    @FindBy(xpath = "//td[@name='price_unit']/input")
    WebElement agreementPoSecondRowPriceInput;



    public agreementPurchaseOrder(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void agreementPo(WebDriver driver) throws InterruptedException {
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
        select.selectByVisibleText("Agreement & Notesheet");
        Thread.sleep(1000);


        agreementPrDropdownSelect.click();
        agreementPrDropdownValueSelect.get(0).click();


        agreementVendorDropdownSelect.click();
        agreementVendorValueSelection.click();

        agreementIdSelect.click();
        agreementValueSelect.click();

        agreementPoBudgetSelect.click();
        agreementPoBudgetValueSelect.click();


        JavascriptExecutor executor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        executor.executeScript("arguments[0].scrollIntoView(true);", agreementPoBudgetSelect);
//        agreementPoFirstRowSelection.click();
        agreementPoFirstRowSelection.click();
        agreementPoFirstPriceInput.click();
        agreementPoFirstPriceInput.clear();
        agreementPoFirstPriceInput.sendKeys("600");
        Thread.sleep(1000);


        agreementPoSecondRowSelection.click();
        agreementPoSecondRowPriceInput.click();
        agreementPoSecondRowPriceInput.clear();
        agreementPoSecondRowPriceInput.sendKeys("700");
        Thread.sleep(1000);


        localPoApproval localPoApproval=new localPoApproval(driver);
        localPoApproval.LocalPoApprovalState();
        System.out.println("Agreement PO Created Successfully");


    }

}
