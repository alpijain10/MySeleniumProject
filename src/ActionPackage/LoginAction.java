package ActionPackage;

import PageObjectModel.*;
import org.openqa.selenium.WebDriver;

public class LoginAction extends LoginClassMethod1 {

    public WebDriver driver;

       public void loginrun()
     {

            LoginBtnmainpage(driver).click();
            txtemail(driver).sendKeys("alpijain10@gmail.com");
            txtpwd(driver).sendKeys("Alpi1051");
            btnLogin(driver).click();

        }

}

