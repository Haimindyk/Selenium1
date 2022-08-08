package SeleniumPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EladStore {
    String path;
    WebDriver driver;

    public EladStore(String path) {

        this.path=path;
        SetPrep();


    }

    public void SetPrep(){
        System.setProperty("webdriver.chrome.driver", path); // SetDriver
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
    }

    public String openpage (String url){
        this.driver.get(url);
        return this.driver.getCurrentUrl();
    }

    public String SignIn (String username){
        var signinbtn = this.driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a"));
        signinbtn.click();
        var emailTB = this.driver.findElement(By.id("email_create"));
        emailTB.sendKeys(username);
        emailTB.sendKeys(Keys.ENTER);
        return this.driver.getCurrentUrl();


    }

    public void closeDriver(){
        this.driver.quit();
    }

}