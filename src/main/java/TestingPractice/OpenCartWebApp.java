package TestingPractice;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartWebApp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Download")).click();
        List <WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println("Count of image in the page :" +image.size());
        driver.quit();
    }
}
