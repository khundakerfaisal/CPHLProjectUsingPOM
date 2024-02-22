package pages;

import approval.csApproval;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class comparativeStatement {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Comparative Statement']")
    WebElement csSubMenu;

    @FindBy(xpath = "//button[@data-original-title='Create record']")
    WebElement csCreateButton;


    @FindBy(xpath = "//div[@name='requisition_id']")
    WebElement csRfqDropdownSelect;


    @FindBy(className = "ui-menu-item")
    List<WebElement> csRfqDropdownValueSelect;
    @FindBy(xpath = "//input[@name='response_name']")
    WebElement csRfqResponseInput;

    @FindBy(xpath = "//button[@title='Save record']")
    WebElement csSaveButton;

    @FindBy(xpath = "//button[@name='action_comparative_statement']")
    WebElement csCompareButton;

    @FindBy(className = "submit_btn")
    List<WebElement> csSubmitFinalSelect;


    public comparativeStatement(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void comparisonCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(1000);
        btnPrMenu.click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        csSubMenu.click();
        Thread.sleep(1000);
        csCreateButton.click();
        Thread.sleep(1000);

        csRfqDropdownSelect.click();
        Thread.sleep(1000);
        csRfqDropdownValueSelect.get(0).click();
        Thread.sleep(1000);

        csRfqResponseInput.sendKeys("This is Test CS");


        csSaveButton.click();
        Thread.sleep(1000);

        csCompareButton.click();
        Thread.sleep(1000);

        java.util.Set<String> browserTabHandle = driver.getWindowHandles();

        java.util.Iterator<String> iterator = browserTabHandle.iterator();

        String ParentWindow=iterator.next();
        String ChildWindow = iterator.next();

        driver.switchTo().window(ChildWindow);
        Thread.sleep(2000);
        csSubmitFinalSelect.get(1).click();
        Thread.sleep(2000);
//        driver.switchTo().window(ParentWindow);
        csApproval csApproval=new csApproval(driver);
        csApproval.csApprovalState(driver);


        System.out.println("CS Vendor selection successfully");


    }
}
