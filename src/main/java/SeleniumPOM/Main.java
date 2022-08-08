package SeleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {


    public static void main(String[] args) throws InterruptedException {

        Random random = new Random(); // random int
        var varible = random.nextInt(2099999999);

        System.setProperty("webdriver.chrome.driver","/Users/haim/Desktop/driver/chromedriver-2"); // SetDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize(); // Maximize Window


        driver.get("https://practice.automationtesting.in/"); /// enter https://www.practice.automationtesting.in

        WebElement myaccountbtn = driver.findElement(By.id("menu-item-50")); // Set my account button
        myaccountbtn.click();

        WebElement emailreg = driver.findElement(By.id("reg_email"));  //
        emailreg.sendKeys(varible + varible + varible + "@gmail.com");


        WebElement Passreg = driver.findElement(By.id("reg_password"));
        Passreg.sendKeys("Haimindyk1234");
        Passreg.sendKeys(Keys.ENTER);


     //  WebElement RegBtn = driver.findElement(By.name("register"));
     //  RegBtn.click();



        Thread.sleep(3000);

        driver.quit();

    }







}
