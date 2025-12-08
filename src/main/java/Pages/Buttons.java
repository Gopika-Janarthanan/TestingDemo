package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Buttons {

    WebDriver d;

    void openbrowser(){
        d =new  ChromeDriver();
        d.get("https://demoqa.com/buttons");
        d.manage().window().maximize();

        By rightclick = By.id("rightClickBtn");
        By doublclick = By.id("doubleClickBtn");
        By click = By.xpath("//button[@id=\"bhjoN\"]");

        WebElement rc = d.findElement(rightclick);
        WebElement dc=d.findElement(doublclick);
        WebElement c= d.findElement(click);
        c.click();
        Actions action = new Actions(d);
        Actions d =action.doubleClick(dc).click();
        d.perform();
        Actions r = action.contextClick(rc).click();
        r.perform();
        Actions cl = action.click(c);


    }


    public static void main(String[] args) {
        Buttons b= new Buttons();
        b.openbrowser();


    }

}
