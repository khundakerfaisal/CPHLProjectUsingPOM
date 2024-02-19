package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class rfq {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(className = "dropdown-item")
    List<WebElement> btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@data-menu-xmlid='purchase_requisition.menu_purchase_requisition_pro_mgt']")
    WebElement rfqSubMenu;

    @FindBy(xpath = "//button[@data-original-title='Create record']")
    WebElement rfqCreate;

    @FindBy(xpath = "//div[@name='purchase_request_id']")
    WebElement rfqDropdownButton;


    @FindBy(className = "ui-menu-item")
    List<WebElement> rfqDropdownValueSelection;

    @FindBy(xpath = "//button[@name='action_create_multiple_quotation_form']")
    WebElement rfqVendorButton;
    @FindBy(xpath = "//div[@name='vendor_ids']")
    WebElement rfqVendorDropdownSelect;
    @FindBy(xpath = "//li/a[text()='A-1 Pest Specialist Pte Ltd']")
    WebElement rfqDropdownVendorSelection;
    @FindBy(className = "ui-autocomplete-input")
    List<WebElement> rfqDropdown2ndVendorSelect;

    @FindBy(xpath = "//tr[@data-id='purchase.order.line_9']//td[@name='price_unit']")
    WebElement rfqFirstTableSelection;

    @FindBy(xpath = "//td[@name='price_unit']/input")
    WebElement rfqFirstTablePriceInput;


    @FindBy(xpath = "//tr[@data-id='purchase.order.line_19']//td[@name='price_unit']/input")
    WebElement rfqSecondTablePriceInput;



    @FindBy(xpath = "//button[@name='action_multiple_quotation_save']")
    WebElement rfqFinalSubmit;
    public rfq(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void InitiateRfq(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.get(5).click();
        Thread.sleep(1000);
        orderRootMenu.click();
        rfqSubMenu.click();
        Thread.sleep(1000);
        rfqCreate.click();
        rfqDropdownButton.click();
        Thread.sleep(1000);
        //        RFQ Multiple vendor selection Part
        rfqDropdownValueSelection.get(0).click();
        Thread.sleep(1000);
        rfqVendorButton.click();
        rfqVendorDropdownSelect.click();
        rfqDropdownVendorSelection.click();
        Thread.sleep(1000);
        rfqDropdown2ndVendorSelect.get(3).click();
        rfqDropdown2ndVendorSelect.get(3).sendKeys(Keys.ARROW_DOWN);
        rfqDropdown2ndVendorSelect.get(3).sendKeys(Keys.ARROW_DOWN);
        rfqDropdown2ndVendorSelect.get(3).sendKeys(Keys.ARROW_DOWN);
        rfqDropdown2ndVendorSelect.get(3).sendKeys(Keys.ARROW_DOWN);
        rfqDropdown2ndVendorSelect.get(3).sendKeys(Keys.ARROW_DOWN);
        rfqDropdown2ndVendorSelect.get(3).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        //        End RFQ Multiple vendor selection Part

//        RFQ Price Input Part start
        rfqFirstTableSelection.click();
        rfqFirstTablePriceInput.click();
        rfqFirstTablePriceInput.clear();
        rfqFirstTablePriceInput.sendKeys("500");
        Thread.sleep(1000);
        rfqFirstTablePriceInput.sendKeys(Keys.ENTER);
        rfqSecondTablePriceInput.click();
        rfqSecondTablePriceInput.clear();
        rfqSecondTablePriceInput.sendKeys("800");
        Thread.sleep(1000);
//        RFQ Price Input Part End

        rfqFinalSubmit.click();
        Thread.sleep(1000);
        System.out.println("Rfq Created Successfully");




    }
}
