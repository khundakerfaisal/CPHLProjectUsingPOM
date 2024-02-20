package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class agreementPurchaseOrder {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(className = "dropdown-item")
    List<WebElement> btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Local Purchase Order']")
    WebElement localPoSubMenu;
    public agreementPurchaseOrder(WebDriver driver){
        PageFactory.initElements(driver,this);

    }

    public void agreementPo(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.get(5).click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        localPoSubMenu.click();
    }

}
