import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    public void tableTest(){
    //Canada
        WebElement canada=wd.findElement(By.cssSelector("tr:nth-child(3)>td:last-child"));
        WebElement canada2=wd.findElement(By.xpath("//*[text()='Canada']"));
        Assert.assertEquals(canada.getText(),"Canada");

    }


    @Test
    public void cssLocators(){
        //by tug name
       WebElement el= wd.findElement(By.tagName("button"));
       WebElement el2= wd.findElement(By.cssSelector("button"));
       WebElement el3= wd.findElement(By.xpath("//button"));

       WebElement a=wd.findElement(By.tagName("a"));
       WebElement a1= wd.findElement(By.cssSelector("a"));
       WebElement a5= wd.findElement(By.xpath("//a"));

       List<WebElement> list= wd.findElements(By.tagName("a"));
       List<WebElement> list2= wd.findElements(By.cssSelector("a"));
        List<WebElement> list3= wd.findElements(By.xpath("//a"));

       //by class
        WebElement divContainer=wd.findElement(By.className("container"));
        WebElement divContainer2=wd.findElement(By.cssSelector(".container"));

        WebElement divContainer3=wd.findElement(By.xpath("//*[@class='container']"));

        List<WebElement> nav=wd.findElements(By.className("nav-item"));
        List<WebElement> nav2=wd.findElements(By.cssSelector(".nav-item"));

        List<WebElement> nav3=wd.findElements(By.xpath("//*[@class='nav-item']"));

        //by id
        WebElement div =wd.findElement(By.id("nav"));
        WebElement div2 =wd.findElement(By.cssSelector("#nav"));

        WebElement div3 =wd.findElement(By.xpath("//*[@id='nav']"));

        WebElement alert=wd.findElement(By.id("alert"));
        WebElement alert2=wd.findElement(By.cssSelector("#alert"));

        WebElement alert3=wd.findElement(By.xpath("//*[@id='alert']"));

        //by attribute
        WebElement inputEmail=wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputPassword=wd.findElement(By.cssSelector("[placeholder='Type your surename']"));

        WebElement inputEmail1=wd.findElement(By.xpath("//*[@placeholder='Type your name']"));
        WebElement inputPassword1=wd.findElement(By.xpath("//*[@placeholder='Type your surename']"));

        WebElement a2=wd.findElement(By.cssSelector("[href='#item3']"));

        WebElement a6=wd.findElement(By.xpath("//*[@href='#item3']"));

        WebElement inputS=wd.findElement(By.cssSelector("[name='surename']"));

        // By.linkText & By.partialLinkText
        WebElement a3=wd.findElement(By.linkText("Item 3"));

        WebElement a4=wd.findElement(By.partialLinkText("m 3"));

        WebElement imp=wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        //start poisk po
        WebElement imp2=wd.findElement(By.cssSelector("[placeholder ^='Type']"));
        //and
        WebElement imp3=wd.findElement(By.cssSelector("[placeholder $='name']"));
        //conteins
        WebElement imp4=wd.findElement(By.cssSelector("[placeholder *='your']"));


    }

    @Test
    public void classWork(){
        //parent
        WebElement per=wd.findElement(By.xpath("//h1/parent::*"));
        WebElement per1=wd.findElement(By.xpath("//h1/parent::div"));
        WebElement per2=wd.findElement(By.xpath("//h1/.."));

        //ancestor
        WebElement anc=wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement anc1=wd.findElement(By.xpath("//h1/ancestor::html"));//html
        WebElement anc2=wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement anc3=wd.findElement(By.xpath("//h1/ancestor::div[1]"));//one option

        //ancestor-or-self
        List <WebElement> list=wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        WebElement follow=wd.findElement(By.xpath("//h1/following-sibling::*"));
        WebElement follow1=wd.findElement(By.xpath("//h1/following-sibling::a"));//all A
        WebElement follow2=wd.findElement(By.xpath("//h1/following-sibling::a[last()]"));//last A

        //preceding-sibling
        WebElement preced=wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        WebElement preced1=wd.findElement(By.xpath("//a[3]/preceding-sibling::h1"));
        List<WebElement>precedList=wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));
        
    }
}
