package Pages;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Buttons {

    @Test
    void openbrowser(){
        WebDriver  d =new  ChromeDriver();
        d.get("https://demoqa.com/buttons");
        d.manage().window().maximize();

        By rightclick = By.id("rightClickBtn");
        By doublclick = By.id("doubleClickBtn");
        By click = By.xpath("//button[@id='OOmB7']");

        WebElement rc = d.findElement(rightclick);
        WebElement dc=d.findElement(doublclick);
        WebElement c= d.findElement(click);
        c.click();
        Actions action = new Actions(d);
        Actions douc =action.doubleClick(dc).click();
        douc.perform();
        Actions r = action.contextClick(rc).click();
        r.perform();
        Actions cl = action.click(c);
        d.quit();
    }




}