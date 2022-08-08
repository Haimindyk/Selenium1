import SeleniumPOM.KatalonDemo;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DocTest {

    KatalonDemo katalon = new KatalonDemo();



    @Test
    public void lddoginTest(){
        // Sanity
        // check if the site's up
        var exepectedUrl = "https://katalon-demo-cura.herokuapp.com/";

        var actualUrl = katalon.openpage(exepectedUrl);

        Assert.assertEquals(actualUrl,exepectedUrl);


       katalon.loginBtnClick();
       katalon.loginLable();

        String expectedLable = "Login";
        String actualLable = katalon.loginLable();

        Assert.assertEquals(expectedLable,actualLable);
        katalon.closeDriver();

    }

    @Test
    public void LoginTest(){
       var actuaLink = katalon.loginAct("https://katalon-demo-cura.herokuapp.com/","John Doe","ThisIsNotAPassword");
       var expectedLink = "https://katalon-demo-cura.herokuapp.com/#appointment";
        Assert.assertEquals(actuaLink,expectedLink);
        katalon.closeDriver();







}



}
