package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class sitePurchaseOrder {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(className = "dropdown-item")
    List<WebElement> btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Site Purchase Order']")
    WebElement sitePoSubMenu;

    @FindBy(xpath = "//button[@data-original-title='Create record']")
    WebElement sitePoCreate;
    @FindBy(xpath = "//div[@name='partner_id']")
    WebElement siteVendorDropdownSelect;

    @FindBy(xpath = "//a[text()='A A Electricny & Telecon Center']")
    WebElement siteVendorValueSelection;



    @FindBy(xpath = "//div[@name='purchase_request_id']")
    WebElement sitePrDropdownSelect;


    @FindBy(className = "ui-menu-item")
    List<WebElement> sitePrDropdownValueSelect;


    @FindBy(xpath = "//div[@name='budget_id']")
    WebElement sitePrBudgetSelect;


    @FindBy(xpath = "//ul[@id='ui-id-2']/li[1]/a")
    WebElement sitePrBudgetValueSelect;

    @FindBy(xpath = "//tr[@data-id='purchase.order.line_14']//td[@name='price_unit']")
    WebElement sitePoFirstRowSelection;

    @FindBy(xpath = "//td[@name='price_unit']/input")
    WebElement sitePoFirstPriceInput;


    @FindBy(xpath = "//tr[@data-id='purchase.order.line_21']//td[@name='price_unit']")
    WebElement sitePoSecondRowSelection;
    @FindBy(xpath = "//td[@name='price_unit']/input")
    WebElement sitePoSecondRowPriceInput;



    @FindBy(xpath = "//button[@title='Save record']")
    WebElement sitePoFinalSubmit;

    public sitePurchaseOrder(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
    public void sitePo(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.get(5).click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        sitePoSubMenu.click();
        Thread.sleep(1000);
        sitePoCreate.click();

        siteVendorDropdownSelect.click();
        siteVendorValueSelection.click();
        Thread.sleep(1000);

        sitePrDropdownSelect.click();
        sitePrDropdownValueSelect.get(0).click();
        Thread.sleep(1000);

        sitePrBudgetSelect.click();
        sitePrBudgetValueSelect.click();
        Thread.sleep(1000);

        sitePoFirstRowSelection.click();
        Thread.sleep(1000);
        sitePoFirstPriceInput.clear();
        sitePoFirstPriceInput.sendKeys("600");
        Thread.sleep(1000);

        sitePoSecondRowSelection.click();
        Thread.sleep(1000);
//        sitePoFirstPriceInput.click();
        sitePoSecondRowPriceInput.clear();
        sitePoSecondRowPriceInput.sendKeys("800");
        Thread.sleep(1000);

        sitePoFinalSubmit.click();
        Thread.sleep(2000);
        System.out.println("Site PO Created successfully!");

    }
}
