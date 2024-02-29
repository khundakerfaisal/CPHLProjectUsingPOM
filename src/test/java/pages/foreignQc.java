package pages;

import approval.qcApproval;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class foreignQc {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Inventory']")
    WebElement btnInventoryMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='cphl_inventory.menu_qa_mrr_root']")
    WebElement btnOperationsMenu;

    @FindBy(xpath = "//a[text()='QC']")
    WebElement btnQcSubMenu;

    @FindBy(className = "btn-primary")
    List<WebElement> btnQcCreateButton;

    @FindBy(xpath = "//select[@name='purchase_type']")
    WebElement btnQcType;


    @FindBy(xpath = "//div[@name='commercial_invoice_id']")
    WebElement qcForeignCiDropdownSelect;

    @FindBy(className = "ui-menu-item")
    List<WebElement> qcForeignCiDropdownValueSelect;
    @FindBy(xpath = "//button[@title='Save record']")
    WebElement btnQcSubmit;

    public foreignQc(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void foreignQcCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(1000);
        btnInventoryMenu.click();
        Thread.sleep(1000);
        btnOperationsMenu.click();
        Thread.sleep(1000);
        btnQcSubMenu.click();
        Thread.sleep(1000);
        btnQcCreateButton.get(1).click();

        btnQcType.click();
        Thread.sleep(1000);
        Select select=new Select(btnQcType);
        select.selectByVisibleText("Foreign Purchase");
        Thread.sleep(1000);

        qcForeignCiDropdownSelect.click();
        Thread.sleep(1000);
        qcForeignCiDropdownValueSelect.get(0).click();
        Thread.sleep(1000);

        btnQcSubmit.click();
        Thread.sleep(1000);
        qcApproval qcApproval=new qcApproval(driver);
        qcApproval.qcApprovalState();
        Thread.sleep(1000);
        System.out.println("Foreign QC Created Successfully");

    }
}
