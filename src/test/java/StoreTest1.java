import SeleniumPOM.EladStore;
import org.junit.Assert;
import org.junit.Test;

public class StoreTest1 {

    @Test
    public void sanityTest(){
        EladStore store = new EladStore("/Users/haim/Desktop/driver/chromedriver-2");
        String ExepectedLink = "https://www.youtube.com/";
        String actualYoutubeLink = store.openpage(ExepectedLink);
        Assert.assertEquals(actualYoutubeLink,ExepectedLink);
    }

    @Test
    public void signinTest(){
        EladStore store = new EladStore("/Users/haim/Desktop/driver/chromedriver-2");
        String ExepectedLink = "http://automationpractice.com/index.php";
        String actualLink = store.openpage(ExepectedLink);
        store.SignIn("jjjjjj@gmakkk.com");
    }


}
