import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd=new ChromeDriver();
        wd.get("file:///C:/Users/HP/OneDrive/Desktop/21.index.html");
    }

    @Test
    public void cssLocators(){
        //by tug name
       WebElement el= wd.findElement(By.tagName("button"));
       WebElement el2= wd.findElement(By.cssSelector("button"));

       WebElement a=wd.findElement(By.tagName("a"));
       WebElement a1= wd.findElement(By.cssSelector("a"));

       List<WebElement> list= wd.findElements(By.tagName("a"));
       List<WebElement> list2= wd.findElements(By.cssSelector("a"));

       //by class
        WebElement divContainer=wd.findElement(By.className("container"));
        WebElement divContainer2=wd.findElement(By.cssSelector(".container"));

        List<WebElement> nav=wd.findElements(By.className("nav-item"));
        List<WebElement> nav2=wd.findElements(By.cssSelector(".nav-item"));

        //by id
        WebElement div =wd.findElement(By.id("nav"));
        WebElement div2 =wd.findElement(By.cssSelector("#nav"));

        WebElement alert=wd.findElement(By.id("alert"));
        WebElement alert2=wd.findElement(By.cssSelector("#alert"));

        //by attribute
        WebElement inputEmail=wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputPassword=wd.findElement(By.cssSelector("[placeholder='Type your surename']"));

        WebElement a2=wd.findElement(By.cssSelector("[href='#item3']"));

        WebElement inputS=wd.findElement(By.cssSelector("[name='surename']"));
        WebElement inputS2=wd.findElement(By.name("[name='surename']"));


    }
}
