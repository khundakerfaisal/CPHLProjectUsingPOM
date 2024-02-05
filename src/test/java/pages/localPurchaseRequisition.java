package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class localPurchaseRequisition {

    @FindBy(xpath = "//button[@title='Home Menu']")
    WebElement btnHomeMenu;

    @FindBy(xpath = "//a[@data-menu-xmlid='purchase.menu_purchase_root']")
    WebElement btnPrMenu;

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
//
//    @FindBy(css = "ul.ui-menu li.ui-menu-item a.dropdown-item.ui-menu-item-wrapper")
//    List<WebElement> dropdownOptions;






    
    public localPurchaseRequisition(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void localPr() throws InterruptedException {
        //        procurement Root Menu selection
        btnHomeMenu.click();
        Thread.sleep(1000);
        btnPrMenu.click();
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
        Select select = new Select(prioritySelect);
        select.selectByVisibleText("High");
        Thread.sleep(2000);
        //        End priority selection

    }
}
