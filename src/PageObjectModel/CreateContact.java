package PageObjectModel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class CreateContact extends LoadBrowser {

    WebDriver driver;
    public WebElement elecont;

    public WebElement elecontact(WebDriver driver1)
    {
            elecont= driver.findElement(By.xpath("//span[text()='Contacts']"));
        //return driver.findElement(By.linkText("/contacts"));
            return elecont;

    }

    public void actclickelementcontact(WebDriver driver2,WebElement elecon)
    {
        Actions act= new Actions(driver);
        act.moveToElement(elecont);
        act.build().perform();
    }

    public void contcreate()
    {
        WebElement elecont = elecontact(driver);
        actclickelementcontact(driver, elecont);
        eleaddcont(driver).click();
    }

    public WebElement eleaddcont(WebDriver driver)
    {
        return driver.findElement(By.xpath("//span[text()='Contacts']/following::button[1]"));

    }
    public WebElement elefirstname(WebDriver driver)
    {
        return driver.findElement(By.name("first_name"));

    }

    public WebElement eleLastName(WebDriver driver)
    {
        return driver.findElement(By.name("last_name"));
    }
    public WebElement eleMidName(WebDriver driver)
    {
        return driver.findElement(By.name("middle_name"));
    }

    public WebElement elecompany(WebDriver driver)
    {
        return driver.findElement(By.xpath("//div[@name='company']"));
    }


    public WebElement eleaccess(WebDriver driver)
    {
        return driver.findElement(By.xpath("//i[@class='unlock icon']"));
    }
    public WebElement eleaccessdropdown(WebDriver driver)
    {
        return driver.findElement(By.xpath("//div[text()='Select users allowed access']"));
    }

}
