import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWork1 {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssSelectors(){
        //by tag name
        WebElement a1=wd.findElement(By.tagName("a"));
        WebElement a2= wd.findElement(By.cssSelector("a"));

        List<WebElement> list= wd.findElements(By.tagName("a"));
        List<WebElement> list2= wd.findElements(By.cssSelector("a"));

        //by class
        WebElement class1= wd.findElement(By.className("container"));
        WebElement class2= wd.findElement(By.cssSelector(".container"));

        WebElement class3= wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class4= wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement class5= wd.findElement(By.className("login_login__3EHKB"));
        WebElement class6= wd.findElement(By.cssSelector(".login_login__3EHKB"));

        WebElement class7= wd.findElement(By.className("active"));
        WebElement class8= wd.findElement(By.cssSelector(".active"));

        //by id
        WebElement id= wd.findElement(By.id("root"));
        WebElement id2= wd.findElement(By.cssSelector("#root"));

        //by attribute
        WebElement el1= wd.findElement(By.cssSelector("[name='registration']"));

        WebElement el2= wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el3= wd.findElement(By.cssSelector("[href='/login']"));

        WebElement el4= wd.findElement(By.cssSelector("[name='login']"));

        WebElement el5= wd.findElement(By.cssSelector("[href='/about']"));

        WebElement el6= wd.findElement(By.cssSelector("button"));

        WebElement inputEmail=wd.findElement(By.cssSelector("[name='email']"));
        WebElement inputPassword=wd.findElement(By.cssSelector("[name='password']"));

        WebElement inputEmail1=wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputPassword1=wd.findElement(By.cssSelector("[placeholder='Password']"));

    }
}
