package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class foreignLc {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='LC/TT/LCAF']")
    WebElement foreignLcSubMenu;
    @FindBy(className = "btn-primary")
    List<WebElement> foreignLcCreateButton;



    @FindBy(xpath = " //input[@name='name']")
    WebElement foreignLcAutoGenerateNumber;
    @FindBy(xpath = "//div[@name='partner_id']")
    WebElement foreignLcVendorDropdownSelect;

    @FindBy(xpath = "//a[text()='A. R. Enterprise']")
//    @FindBy(xpath = "//a[text()='A-1 Pest Specialist Pte Ltd']")
    WebElement foreignLcVendorValueSelection;


    @FindBy(xpath = "//div[@name='proforma_invoice_ids']")
    WebElement foreignLcSelection;

    @FindBy(xpath = "//ul[@id='ui-id-6']/li[1]/a")
    WebElement foreignLcValueSelection;


    @FindBy(xpath = "//input[@name='conversion_rate']")
    WebElement foreignLcConvertedAmount;

    @FindBy(xpath = "//button[@title='Save record']")
    WebElement foreignLcSubmit;
    public foreignLc(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void LcCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        foreignLcSubMenu.click();
        Thread.sleep(1000);
        foreignLcCreateButton.get(1).click();
        Thread.sleep(1000);

        Random random=new Random();
        String formattedYear = "2024";
        int formattedSequence = random.nextInt(200001);
        String autoNumber = "LC/TT-" + formattedYear + "-" + formattedSequence;
        foreignLcAutoGenerateNumber.clear();
        foreignLcAutoGenerateNumber.sendKeys(autoNumber);
        Thread.sleep(1000);


        foreignLcVendorDropdownSelect.click();
        foreignLcVendorValueSelection.click();
        Thread.sleep(1000);

        foreignLcSelection.click();
        Thread.sleep(1000);
        foreignLcValueSelection.click();
        Thread.sleep(1000);

        foreignLcConvertedAmount.clear();
        foreignLcConvertedAmount.sendKeys("110");
        Thread.sleep(1000);

        foreignLcSubmit.click();
        Thread.sleep(1000);

        System.out.println("Foreign Lc Created Successfully");

    }

}
