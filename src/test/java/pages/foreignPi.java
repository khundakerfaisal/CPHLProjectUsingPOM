package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class foreignPi {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Proforma Invoice']")
    WebElement foreignPiSubMenu;
    @FindBy(className = "btn-primary")
    List<WebElement> foreignPiCreateButton;



    @FindBy(xpath = " //input[@name='name']")
    WebElement foreignPiAutoGenerateNumber;
    @FindBy(xpath = "//div[@name='partner_id']")
    WebElement foreignPiVendorDropdownSelect;

//    @FindBy(xpath = "//a[text()='A-1 Pest Specialist Pte Ltd']")
//    WebElement foreignPiVendorValueSelection;
    @FindBy(xpath = "//a[text()='A. R. Enterprise']")
    WebElement foreignPiVendorValueSelection;

    @FindBy(xpath = "//div[@name='purchase_order_ids']")
    WebElement foreignPiPoSelection;

    @FindBy(xpath = "//ul[@id='ui-id-5']/li[1]/a")
    WebElement foreignPiPoValueSelection;

    @FindBy(xpath = "//div[@name='currency_id']")
    WebElement foreignPiCurrencySelect;

    @FindBy(xpath = "//li/a[text()='EUR']")
    WebElement foreignPiCurrencyValueSelect;



    @FindBy(xpath = "//input[@name='conversion_rate']")
    WebElement foreignPiConvertedAmount;

    @FindBy(xpath = "//button[@title='Save record']")
    WebElement foreignPiSubmit;
    public foreignPi(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void piCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        foreignPiSubMenu.click();
        Thread.sleep(1000);
        foreignPiCreateButton.get(1).click();
        Thread.sleep(1000);

        Random random=new Random();
        String formattedYear = "2024";
        int formattedSequence = random.nextInt(200001);
        String autoNumber = "PI-" + formattedYear + "-" + formattedSequence;
        foreignPiAutoGenerateNumber.sendKeys(autoNumber);
        Thread.sleep(1000);


        foreignPiVendorDropdownSelect.click();
        foreignPiVendorValueSelection.click();
        Thread.sleep(1000);

        foreignPiPoSelection.click();
        Thread.sleep(1000);
        foreignPiPoValueSelection.click();
        Thread.sleep(1000);
//        JavascriptExecutor rfqExecutor = (JavascriptExecutor) driver;
//
//// Scroll the element into view using JavaScript
//        rfqExecutor.executeScript("arguments[0].scrollIntoView(true);", foreignPiPoSelection);
//        foreignPiPoValueSelection.get(0).click();


        foreignPiCurrencySelect.click();
        foreignPiCurrencyValueSelect.click();
        Thread.sleep(1000);

        foreignPiConvertedAmount.clear();
        foreignPiConvertedAmount.sendKeys("110");
        Thread.sleep(1000);

        foreignPiSubmit.click();
        Thread.sleep(1000);

        System.out.println("Foreign PI Created Successfully");

    }

}
