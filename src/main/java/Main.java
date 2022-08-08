import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/haim/Desktop/driver/chromedriver-2");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.youtube.com/");
      //  Thread.sleep(500);
       // driver.get("https://www.ebay.com/");

     //  System.out.println(driver.getCurrentUrl());
     //  System.out.println(driver.getTitle());
     //  System.out.println(driver.getPageSource());


      //  WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/a"));
       // WebElement loginBtn = driver.findElement(By.id("gh-ug"));
     //  WebElement loginBtn = driver.findElement(By.tagName());
      // WebElement loginBtn = driver.findElement(By.cssSelector("#gh-ug > a"));
     //  WebElement srcBtn = driver.findElement(By.name("q"));
       // WebElement loginBtn = driver.findElement(By.className("gh-ug-guest"));
       // loginBtn.click();
      //  srcBtn.sendKeys("weather");
       // srcBtn.sendKeys(Keys.ENTER);

        //  driver.findElement(By.name("search_query")).sendKeys("baby shark");
        //  driver.findElement(By.name("search_query")).sendKeys(Keys.ENTER);
        //  driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();

        Thread.sleep(3000);

        driver.quit();



    }
}
