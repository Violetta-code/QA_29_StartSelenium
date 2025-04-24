import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTests {

    @BeforeClass
    public void preCondition(){
        //open browser
        //open site

    }

    @Test
    public void loginSuccess(){
        //open form (find element+ click)

        //fill form:
            //===fill email (find element+ click+ clear+ type)
            //===fill password (find element+ click+ type)

        //submit form (find element+ click)

    }

    @Test
    public void loginWrongEmail(){
        //open form
        //fill form
        //submit form
    }

    @Test
    public void loginWrongPassword(){
        //open form
        //fill form
        //submit form
    }

    @Test
    public void loginUnregistered(){
        //open form
        //fill form
        //submit form
    }

    @AfterClass
    public void postCondition(){
        //close browser

    }
}
