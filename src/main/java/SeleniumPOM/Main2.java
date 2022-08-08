package SeleniumPOM;

import org.openqa.selenium.WebDriver;

public class Main2 {

    public static void main(String[] args) {

        EladStore store = new EladStore("/Users/haim/Desktop/driver/chromedriver-2");
        String ExepectedLink = "https://www.youtube.com";
        String actualYoutubeLink = store.openpage(ExepectedLink);
        store.openpage("https://www.youtube.com");
       // driver.get("http://automationpractice.com/index.php");

    }
}
