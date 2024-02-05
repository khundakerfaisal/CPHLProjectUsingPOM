package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "login")
    WebElement txtUserName;

    @FindBy(name = "password")
    WebElement txtPassword;

    @FindBy(className = "btn-primary")
    WebElement btnLogin;

    @FindBy(className = "list-group-item")
    List<WebElement> dbSelectLevel;

    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    public void doLogin (String username,String password){
        dbSelectLevel.get(2).click();
        txtUserName.sendKeys(username);
        txtPassword.sendKeys(password);
        btnLogin.click();

    }

    public void doLogout(){



    }

}
