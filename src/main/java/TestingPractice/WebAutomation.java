package TestingPractice;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAutomation {
    public static void main(String[] args) throws InterruptedException {
      //  locators();
      // cssSelectors();
        orageHrm();

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
    static void orageHrm( ) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        //Website
        driver.get("https://www.orangehrm.com/");
        driver.manage().window().maximize();
        driver.getTitle();
        //declining
        WebElement close = driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyButtonDecline' and  text() ='Deny']"));
        if(close.isDisplayed()){
            close.click();
        }

        //booking demo

        WebElement booking =driver.findElement(By.xpath("//button[@class ='nav-link ' and  text() ='Book a Free Demo']"));
        booking.click();
        Thread.sleep(2000);

        WebElement fullname = driver.findElement(By.xpath("//input[@name='FullName' ]"));
        fullname.sendKeys("Anonymous");
        Thread.sleep(2000);
        fullname.submit();

        WebElement email = driver.findElement(By.xpath("//input[@class='email text' and @name='Email' ]"));
        email.sendKeys("anonymous@gmai.com");
        Thread.sleep(2000);
        email.submit();
        Thread.sleep(2000);

        WebElement phoneno = driver.findElement(By.xpath("//input[@class='text' and @name='Contact' ]"));
        phoneno.sendKeys("123456789");
        Thread.sleep(2000);
        phoneno.submit();
        Thread.sleep(2000);

        WebElement country = driver.findElement(By.xpath("//select[@name='Country']"));
        Thread.sleep(2000);
        country.click();

        WebElement countrydropdown = driver.findElement(By.xpath("//select[@name='Country']/child::option[97]"));
        countrydropdown.click();
        Thread.sleep(2000);
        countrydropdown.submit();
        Thread.sleep(2000);

        WebElement companyname = driver.findElement(By.xpath("//input[@name='CompanyName' and @class='text']"));
        Thread.sleep(2000);
        companyname.sendKeys("Anonymous company");
        Thread.sleep(2000);
        companyname.submit();
        Thread.sleep(2000);

        WebElement jobtitle = driver.findElement(By.xpath("//input[@name='JobTitle' and @class='text']"));
        Thread.sleep(2000);
        jobtitle.sendKeys("Software Tester");
        Thread.sleep(2000);
        jobtitle.submit();

        WebElement noofemp = driver.findElement(By.xpath("//select[@name='NoOfEmployees' and @class='dropdown']"));
        Thread.sleep(2000);
        noofemp.click();

        WebElement noofempdropdown = driver.findElement(By.xpath("//select[@name='NoOfEmployees' and @class='dropdown']/child::option[4]"));
        Thread.sleep(2000);
        noofempdropdown.click();
        Thread.sleep(2000);
        noofempdropdown.submit();

        Thread.sleep(5000);

        WebElement captcha = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']"));
        Thread.sleep(2000);
        captcha.click();
        Thread.sleep(2000);
        captcha.submit();


    }

}