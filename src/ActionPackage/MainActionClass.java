package ActionPackage;

import PageObjectModel.*;
import PageObjectModel.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainActionClass extends LoadBrowser{

    public WebDriver driver;

    public static void main(String args[]) {

      MainActionClass act=new MainActionClass();
      act.login(act.driver);
    }

    public void login(WebDriver driver)
    {
        driver= initBrowser("chrome");
        driver.get(Utility.urlcrm);
        driver.manage().window().maximize();
        waitfn();
        obj1.loginrun();

    }



}
