package pages;

import approval.noteSheetApproval;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class noteSheet {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Notesheet']")
    WebElement noteSheetSubMenu;

    @FindBy(xpath = "//button[@data-original-title='Create record']")
    WebElement noteSheetCreateButton;

    @FindBy(xpath = "//div[@name='partner_id']")
    WebElement noteSheetVendorDropdownSelect;

    @FindBy(xpath = "//a[text()='A. R. Enterprise']")
    WebElement noteSheetVendorValueSelection;


    @FindBy(xpath = "//div[@name='quotation_ids']")
    WebElement noteSheetRfqDropdownSelect;


    @FindBy(className = "ui-menu-item")
    List<WebElement> noteSheetRfqDropdownValueSelect;



    @FindBy(xpath = "//td/textarea[@name='subject']")
    WebElement noteSheetSubject;


    @FindBy(xpath = "//td/textarea[@name='body']")
    WebElement noteSheetBody;
    public noteSheet(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void noteSheetCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();
        Thread.sleep(1000);
        btnPrMenu.click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        noteSheetSubMenu.click();
        Thread.sleep(1000);
        noteSheetCreateButton.click();
        Thread.sleep(1000);

        noteSheetVendorDropdownSelect.click();
        noteSheetVendorValueSelection.click();

        noteSheetRfqDropdownSelect.click();
        Thread.sleep(1000);
        noteSheetRfqDropdownValueSelect.get(10).click();
        Thread.sleep(1000);

        noteSheetSubject.sendKeys("This is approval for note sheet .This is a test page");
        Thread.sleep(1000);

        noteSheetBody.sendKeys("This is Another data for note sheet test");
        Thread.sleep(1000);
        noteSheetApproval noteSheetApproval=new noteSheetApproval(driver);
        noteSheetApproval.noteSheetApprovalState();
        System.out.println("Note Sheet created successfully");

    }
}
