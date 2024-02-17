package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class utils {

    public static void scrollPage(WebDriver driver){
//        WebElement genderRadio = driver.findElement(By.xpath("//input[@type=\"radio\"]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,650)");

    }

}
