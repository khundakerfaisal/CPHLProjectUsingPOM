package pages;

import approval.foreignPoApproval;
import approval.localPoApproval;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.util.List;

public class foreignOrderWithCs {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Foreign Purchase Order']")
    WebElement foreignPoSubMenu;
    @FindBy(className = "btn-primary")
    List<WebElement> foreignPoCreateButton;

    @FindBy(xpath = "//Select[@name='purchase_base']")
    WebElement foreignPoPurchaseBaseSelect;

    @FindBy(xpath = "//div[@name='rfq_ids']")
    WebElement foreignPoRfqDropdownSelect;

    @FindBy(className = "ui-menu-item")
    List<WebElement> foreignPoRfqDropdownValueSelect;

    @FindBy(xpath = "//div[@name='budget_id']")
    WebElement foreignPoRfqBudgetSelect;

    @FindBy(className = "ui-menu-item")
//    @FindBy(xpath = "//ul[@id='ui-id-5']/li[1]/a")
    List<WebElement> foreignPoRfqBudgetValueSelect;

    @FindBy(xpath = "//div[@name='currency_id']")
    WebElement foreignPoCurrencySelect;

    @FindBy(xpath = "//li/a[text()='EUR']")
    WebElement foreignPoCurrencyValueSelect;



    @FindBy(xpath = "//input[@name='conversion_rate']")
    WebElement foreignPoConvertedAmount;
    public foreignOrderWithCs(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void foreignPoWithCs(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        foreignPoSubMenu.click();
        Thread.sleep(1000);
        foreignPoCreateButton.get(1).click();
        foreignPoPurchaseBaseSelect.click();
        Select select=new Select(foreignPoPurchaseBaseSelect);
        select.selectByVisibleText("Comparative Statement");
        Thread.sleep(1000);

        foreignPoRfqDropdownSelect.click();
        foreignPoRfqDropdownValueSelect.get(0).click();
        Thread.sleep(1000);
//        utils.utils.scrollPage(driver);
        JavascriptExecutor rfqExecutor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        rfqExecutor.executeScript("arguments[0].scrollIntoView(true);", foreignPoRfqDropdownSelect);
        foreignPoRfqBudgetSelect.click();
        foreignPoRfqBudgetValueSelect.get(0).click();
//        foreignPoRfqBudgetValueSelect.sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        foreignPoCurrencySelect.click();
        foreignPoCurrencyValueSelect.click();
        Thread.sleep(1000);
        foreignPoConvertedAmount.clear();
        foreignPoConvertedAmount.sendKeys("110");

        JavascriptExecutor executor = (JavascriptExecutor) driver;

// Scroll the element into view using JavaScript
        executor.executeScript("arguments[0].scrollIntoView(true);", foreignPoRfqBudgetSelect);
        Thread.sleep(1000);
        foreignPoApproval foreignPoApproval=new foreignPoApproval(driver);
        foreignPoApproval.foreignPoApprovalState();
        System.out.println("Foreign Cs-based PO Created Successfully");


    }
}
