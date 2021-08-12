package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//First POM method by returning method

public class LoginClassMethod1 {

    public WebElement LoginBtnmainpage(WebDriver driver)
    {
        return driver.findElement(By.xpath("//span[text()='Log In']"));
    }

    public WebElement txtemail(WebDriver driver)
    {
        return driver.findElement(By.name("email"));
    }

    public WebElement txtpwd(WebDriver driver)
    {
        return driver.findElement(By.name("password"));
    }

    public WebElement btnLogin(WebDriver driver)
    {
        return driver.findElement(By.xpath("//div[text()='Login']"));
    }
}
