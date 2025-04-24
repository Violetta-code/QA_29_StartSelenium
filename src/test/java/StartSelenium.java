import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class StartSelenium {

    WebDriver wd;

    @Test
    public void test(){
        wd = new ChromeDriver();
        // =====START==========
        // wd.get("https://telranedu.web.app/home"); // without history
        wd.navigate().to("https://telranedu.web.app/home");

        //=======BACK==========
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        //======FINISH==========
        //wd.close();
     //   wd.quit();
    }


}
