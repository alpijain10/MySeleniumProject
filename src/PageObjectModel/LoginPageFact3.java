package PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageFact3 {

    WebDriver driver;

    @FindBy(name="Log In")
    WebElement btnLoginmain;

    @FindBy(name="email")
    WebElement txtemail;

    @FindBy(name="password")
    WebElement txtpwd;

    @FindBy(xpath = "//span[text()='Log In']")
    WebElement LoginBtn;

    public void usrname()
    {


    }


}
