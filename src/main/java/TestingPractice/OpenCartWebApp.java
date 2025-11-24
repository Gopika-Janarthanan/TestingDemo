package TestingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartWebApp {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.opencart.com/index.php?route=cms/demo");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Download")).click();

    }
}
