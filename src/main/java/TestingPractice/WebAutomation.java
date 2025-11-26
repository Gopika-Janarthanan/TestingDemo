package TestingPractice;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {
    public static void main(String[] args) {
        locators();
        cssSelectors();

    }
    static void locators(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Download")).click();
        List <WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println("Count of image in the page :" +image.size());
        driver.quit();
    }
    static void cssSelectors(){
        WebDriver d = new ChromeDriver();
        d.get("https://demo.nopcommerce.com/");
        d.manage().window().maximize();
        d.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Computer");
        d.quit();


    }

}
