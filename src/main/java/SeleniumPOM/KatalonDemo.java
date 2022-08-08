package SeleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class KatalonDemo {

    WebDriver driver;


    public KatalonDemo() {
        System.setProperty("webdriver.chrome.driver","/Users/haim/Desktop/driver/chromedriver-2"); // SetDriver
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
    }


 //  public void SetPrep(){
 //      System.setProperty("webdriver.chrome.driver", path); // SetDriver
 //      this.driver = new ChromeDriver();
 //      this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 //      this.driver.manage().window().maximize();
 //  }

    public void loginBtnClick(){
        WebElement loginPageBtn = this.driver.findElement(By.id("btn-make-appointment"));
        loginPageBtn.click();
    }

    public String loginLable(){
        WebElement loginLable = driver.findElement(By.cssSelector("#login > div > div > div.col-sm-12.text-center > h2"));
        return loginLable.getText();
    }

    public String openpage (String url){
        this.driver.get(url);
        return this.driver.getCurrentUrl();
    }

    public String currentUrl(){
        return this.driver.getCurrentUrl();
    }

    public void closeDriver(){
        this.driver.quit();
    }


    public String loginAct(String url ,String username , String password){
        openpage(url);
        loginBtnClick();
        this.driver.findElement(By.id("txt-username")).sendKeys(username);
        var passwordTB =this.driver.findElement(By.id("txt-password"));
        passwordTB.sendKeys(password);
        passwordTB.sendKeys(Keys.ENTER);
        return driver.getCurrentUrl();
    }

}
