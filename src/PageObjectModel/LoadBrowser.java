package PageObjectModel;

import ActionPackage.ContactAction1;
import ActionPackage.LoginAction;
import ActionPackage.MainActionClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadBrowser extends LoginAction {

        String driverpath;
        public WebDriver driver;

        public LoginAction obj1 ;

        public WebDriver initBrowser(String browsername) {
            if (browsername.equalsIgnoreCase("Chrome")) {
                System.out.println("Launching Chrome");
                driverpath = Utility.driverPath + "/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", driverpath);
                driver = new ChromeDriver();

            }
            if (browsername.equalsIgnoreCase("Firefox")) {
                System.out.println("Launching Firefox");
                driverpath = Utility.driverPath + "/geckodriver.exe";
                System.setProperty("webdriver.firefox.driver", driverpath);
                driver = new FirefoxDriver();
            }
            if (browsername.equalsIgnoreCase("IE")) {
                System.out.println("Launching IE");
                driverpath = Utility.driverPath + "/MicrosoftWebDriver.exe";
                System.setProperty("webdriver.ie.driver", driverpath);
                driver = new EdgeDriver();
            }
            return driver;
        }
        public void waitforVisibility(WebDriver driver, WebElement element)
        {
            WebDriverWait wait=new WebDriverWait(driver,2000);
            wait.until(ExpectedConditions.visibilityOf(element));

        }
        public void waitfn() {
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
            public static void main(String args[]) {

            LoadBrowser objload=new LoadBrowser();
            objload.initBrowser("chrome");
            LoginAction obj1=new LoginAction();
            obj1.loginrun();
        }

            public void login(WebDriver driver)
            {
                driver.get(Utility.urlcrm);
                driver.manage().window().maximize();
                waitfn();
                obj1.loginrun();

            }


        }

           }


