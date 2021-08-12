package PageObjectModel;

import org.openqa.selenium.By;

public class LoginByClass2 {

    public By username= By.name("email");
    public By password= By.name("password");
    public By LoginBtn=By.xpath("//span[text()='Log In']");

}
