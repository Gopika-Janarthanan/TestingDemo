package TestingPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
    public static void main(String[] args) {
        WebDriver d =new ChromeDriver();
        Actions action = new Actions(d);
        d.get("https://www.flipkart.com/");
        d.manage().window().maximize();
//      WebElement login.feature = d.findElement(By.xpath("//span[text()='login.feature']"));
//      login.feature.click();
//      WebElement phoneno = d.findElement(By.xpath("//input[@type='number' ]"));
//      phoneno.sendKeys("1234567890");

        WebElement search = d.findElement(By.xpath("//input[@title ='Search for Products, Brands and More']"));
        search.sendKeys("Phone");
        search.submit();
        WebElement mobile = d.findElement(By.xpath("//div[text()='OPPO K13x 5G 6000mAh and 45W SUPERVOOC Charger & AI (Midnight Violet, 128 GB)']"));
        mobile.click();
//        WebElement pincode= d.findElement(By.xpath("//input[@placeholder='Enter Delivery Pincode']"));
//        pincode.sendKeys("631101");
//        pincode.submit();
        WebElement ram = d.findElement(By.xpath("//a[text()='6 GB']"));
        action.scrollToElement(ram).perform();

        d.quit();


    }
}
