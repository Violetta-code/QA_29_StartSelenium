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
        WebElement body=wd.findElement(By.tagName("body"));
        WebElement body1= wd.findElement(By.cssSelector("body"));

        WebElement body2= wd.findElement(By.xpath("//body"));

        WebElement a1=wd.findElement(By.tagName("a"));
        WebElement a2= wd.findElement(By.cssSelector("a"));

        WebElement a3= wd.findElement(By.xpath("//a"));
        WebElement a4= wd.findElement(By.xpath("//a[text()='ABOUT']"));
        WebElement a5= wd.findElement(By.xpath("//a[text()='HOME']"));
        WebElement a6= wd.findElement(By.xpath("//a[text()='LOGIN']"));

        WebElement h1=wd.findElement(By.tagName("h1"));
        WebElement h2= wd.findElement(By.cssSelector("h1"));

        WebElement h3= wd.findElement(By.xpath("//h1"));

        List<WebElement> list= wd.findElements(By.tagName("a"));
        List<WebElement> list2= wd.findElements(By.cssSelector("a"));

        List<WebElement> list3= wd.findElements(By.xpath("//a"));

        //by class
        WebElement class1= wd.findElement(By.className("container"));
        WebElement class2= wd.findElement(By.cssSelector(".container"));

        WebElement class3= wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement class4= wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));

        WebElement class5= wd.findElement(By.className("login_login__3EHKB"));
        WebElement class6= wd.findElement(By.cssSelector(".login_login__3EHKB"));

        WebElement class7= wd.findElement(By.className("active"));
        WebElement class8= wd.findElement(By.cssSelector(".active"));

        WebElement class9= wd.findElement(By.xpath("//*[@class='container']"));
        WebElement class10= wd.findElement(By.xpath("//*[@class= 'navbar-component_nav__1X_4m']"));
        WebElement class11= wd.findElement(By.xpath("//*[@class= 'login_login__3EHKB']"));
        WebElement class12= wd.findElement(By.xpath("//*[@class= 'active']"));

        //by id
        WebElement id= wd.findElement(By.id("root"));
        WebElement id2= wd.findElement(By.cssSelector("#root"));

        //by id+class
        WebElement idClass= wd.findElement(By.cssSelector("#root.container"));
        WebElement idClass1= wd.findElement(By.xpath("//*[@id='root' and @class='container']"));
        WebElement idClass2= wd.findElement(By.xpath("//*[@id='root' or @class='container']"));

        //by attribute
        WebElement el1= wd.findElement(By.cssSelector("[name='registration']"));

        WebElement el2= wd.findElement(By.cssSelector("[href='/home']"));
        WebElement el3= wd.findElement(By.cssSelector("[href='/login']"));

        WebElement el4= wd.findElement(By.cssSelector("[name='login']"));

        WebElement el5= wd.findElement(By.cssSelector("[href='/about']"));

        WebElement el6= wd.findElement(By.cssSelector("button"));

        WebElement el7= wd.findElement(By.xpath("//*[@name='registration']"));
        WebElement el8= wd.findElement(By.xpath("//*[@name='login']"));
        WebElement el9= wd.findElement(By.xpath("//*[@href='/home']"));
        WebElement el10= wd.findElement(By.xpath("//*[@href='/login']"));
        WebElement el11= wd.findElement(By.xpath("//*[@href='/about']"));

        WebElement inputEmail=wd.findElement(By.cssSelector("[name='email']"));
        WebElement inputPassword=wd.findElement(By.cssSelector("[name='password']"));

        WebElement inputEmail2=wd.findElement(By.xpath("//*[@name='email']"));
        WebElement inputPassword2=wd.findElement(By.xpath("//*[@name='email']"));

        WebElement inputEmail1=wd.findElement(By.cssSelector("[placeholder='Email']"));
        WebElement inputPassword1=wd.findElement(By.cssSelector("[placeholder='Password']"));

        WebElement inputEmail3=wd.findElement(By.xpath("//input[starts-with (@placeholder,'Em')]"));
        WebElement inputPassword3=wd.findElement(By.xpath("//input[contains(@placeholder,'word')]"));
        WebElement inputEmail4=wd.findElement(By.xpath("//input[starts-with (@placeholder,'Pass')]"));
        WebElement inputPassword4=wd.findElement(By.xpath("//input[contains(@placeholder,'il')]"));

        WebElement button2=wd.findElement(By.xpath("//button[starts-with(@name,'log')]"));
        WebElement button3=wd.findElement(By.xpath("//button[contains(@name,'og')]"));
        WebElement button4=wd.findElement(By.xpath("//button[starts-with(@name,'reg')]"));
        WebElement button5=wd.findElement(By.xpath("//button[contains(@name,'tion')]"));

        //parent
        WebElement per=wd.findElement(By.xpath("//h1/parent::*"));
        WebElement per1=wd.findElement(By.xpath("//h1/parent::div"));
        WebElement per2=wd.findElement(By.xpath("//h1/.."));
        WebElement per3=wd.findElement(By.xpath("//form/parent::*"));
        WebElement per4=wd.findElement(By.xpath("//form/parent::div"));
        WebElement per5=wd.findElement(By.xpath("//form/.."));
        WebElement per6=wd.findElement(By.xpath("//div[2]/parent::*"));
        WebElement per7=wd.findElement(By.xpath("//div[2]/parent::div"));
        WebElement per8=wd.findElement(By.xpath("//div[2]/.."));

        //ancestor
        WebElement anc=wd.findElement(By.xpath("//h1/ancestor::*"));
        WebElement anc1=wd.findElement(By.xpath("//h1/ancestor::html"));
        WebElement anc2=wd.findElement(By.xpath("//h1/ancestor::div"));
        WebElement anc3=wd.findElement(By.xpath("//h1/ancestor::div[1]"));
        WebElement anc4=wd.findElement(By.xpath("//a/ancestor::*"));
        WebElement anc5=wd.findElement(By.xpath("//a/ancestor::html"));
        WebElement anc6=wd.findElement(By.xpath("//a/ancestor::div"));
        WebElement anc7=wd.findElement(By.xpath("//a/ancestor::div[1]"));
        WebElement anc8=wd.findElement(By.xpath("//form/ancestor::*"));
        WebElement anc9=wd.findElement(By.xpath("//form/ancestor::html"));
        WebElement anc10=wd.findElement(By.xpath("//form/ancestor::div"));
        WebElement anc11=wd.findElement(By.xpath("//form/ancestor::div[1]"));

        //ancestor-or-self
        List <WebElement> list4=wd.findElements(By.xpath("//h1/ancestor-or-self::*"));
        List <WebElement> list5=wd.findElements(By.xpath("//h1/ancestor-or-self::div[2]"));
        List <WebElement> list6=wd.findElements(By.xpath("//a[3]/ancestor-or-self::div[1]"));
        List <WebElement> list7=wd.findElements(By.xpath("//input/ancestor-or-self::div[2]"));
        List <WebElement> list8=wd.findElements(By.xpath("//button/ancestor-or-self::div[2]"));

        //following-sibling
        WebElement follow=wd.findElement(By.xpath("//h1/following-sibling::*"));
        WebElement follow1=wd.findElement(By.xpath("//h1/following-sibling::a"));
        WebElement follow2=wd.findElement(By.xpath("//h1/following-sibling::a[last()]"));
        WebElement follow3=wd.findElement(By.xpath("//input/following-sibling::*"));
        WebElement follow4=wd.findElement(By.xpath("//input/following-sibling::br"));
        WebElement follow5=wd.findElement(By.xpath("//input/following-sibling::button"));
        WebElement follow6=wd.findElement(By.xpath("//input/following-sibling::button[last()]"));

        //preceding-sibling
        WebElement preced=wd.findElement(By.xpath("//a[@href='/login']/preceding-sibling::h1"));
        WebElement preced1=wd.findElement(By.xpath("//a[3]/preceding-sibling::h1"));
        List<WebElement>precedList=wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));

        WebElement preced2=wd.findElement(By.xpath("//a[@href='/home']/preceding-sibling::h1"));
        WebElement preced3=wd.findElement(By.xpath("//a[1]/preceding-sibling::h1"));
        List<WebElement>precedList1=wd.findElements(By.xpath("//input[last()]/preceding-sibling::*"));
    }

    @Test
    public void xPathSelectorsCheckingHW(){
        //by tag name
        WebElement body=wd.findElement(By.xpath("//body"));
        WebElement h1=wd.findElement(By.xpath("//h1"));
        //by class
        WebElement el1=wd.findElement(By.xpath("//*[@class='container']"));
        //by id
        WebElement id= wd.findElement(By.xpath("//*[@id='root']"));
        //by attribute
        WebElement el2= wd.findElement(By.xpath("//*[@name='registration']"));
        //=================================================================================================
        //=======================
        WebElement el4=wd.findElement(By.cssSelector("[placeholder^='Em']"));
        WebElement inputEmail3=wd.findElement(By.xpath("//input[starts-with (@placeholder,'Em')]"));
        //=======================
        WebElement el5=wd.findElement(By.cssSelector("[placeholder$='word']"));
        WebElement inputPassword2=wd.findElement(By.xpath("//input[contains(@placeholder,'word')]"));
        //=======================
        WebElement el6=wd.findElement(By.cssSelector("[placeholder*='ma']"));
        WebElement inputPassword3=wd.findElement(By.xpath("//input[contains(@placeholder,'ma')]"));
        //=================================================================================================
    }

}
