package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\unknown user\\Documents\\Browser\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        System.out.println("Page Title: " + driver.getTitle());

        WebElement searchbar = driver.findElement(By.id("small-searchterms"));
        WebElement searchbtn = driver.findElement(By.cssSelector(".button-1.search-box-button"));

        searchbar.sendKeys("computer");
        Thread.sleep(2000);

        searchbtn.click();
        Thread.sleep(2000);

        WebElement loginnav = driver.findElement(By.className("ico-login"));
        loginnav.click();

        Thread.sleep(2000);
        driver.quit();
    }
}
