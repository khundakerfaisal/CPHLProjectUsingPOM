package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class foreignCi {
    @FindBy(xpath = "//button[@title=\"Home Menu\"]")
    WebElement btnHomeMenu;
    @FindBy(xpath = "//a[text()='Purchase']")
    WebElement btnPrMenu;

    @FindBy(xpath = "//button[@data-menu-xmlid='purchase.menu_procurement_management']")
    WebElement orderRootMenu;
    @FindBy(xpath = "//a[@role='menuitem' and text()='Commercial Invoice']")
    WebElement foreignCiSubMenu;
    @FindBy(className = "btn-primary")
    List<WebElement> foreignCiCreateButton;

    @FindBy(xpath = " //input[@name='name']")
    WebElement foreignCiAutoGenerateNumber;

    @FindBy(xpath = "//div[@name='lc_details_id']")
    WebElement foreignCiSelection;

    @FindBy(className = "ui-menu-item")
    List<WebElement> foreignCiValueSelection;



    @FindBy(xpath = "//button[@title='Save record']")
    WebElement foreignCiSubmit;
    public foreignCi(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void CiCreate(WebDriver driver) throws InterruptedException {
        btnHomeMenu.click();

        btnPrMenu.click();
        Thread.sleep(1000);
        orderRootMenu.click();
        Thread.sleep(1000);
        foreignCiSubMenu.click();
        Thread.sleep(1000);
        foreignCiCreateButton.get(1).click();
        Thread.sleep(1000);

        Random random=new Random();
        String formattedYear = "2024";
        int formattedSequence = random.nextInt(200001);
        String autoNumber = "CI-" + formattedYear + "-" + formattedSequence;
        foreignCiAutoGenerateNumber.clear();
        foreignCiAutoGenerateNumber.sendKeys(autoNumber);
        Thread.sleep(1000);



        foreignCiSelection.click();
        Thread.sleep(1000);


        foreignCiValueSelection.get(0).click();
        Thread.sleep(1000);

        foreignCiSubmit.click();
        Thread.sleep(1000);

        System.out.println("Foreign CI Created Successfully");

    }
}
