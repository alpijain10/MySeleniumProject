//package ActionPackage;
//
//import PageObjectModel.LoadBrowser;
//import PageObjectModel.LoginClassMethod1;
//import PageObjectModel.Utility;
//import org.openqa.selenium.WebDriver;
//
//public class LoginupdateAction extends LoadBrowser {
//
//        public WebDriver driver;
//
//        public void loginrun1()
//        {
//            LoginupdateAction objactionlogin = new LoginupdateAction();
//            initBrowser("Chrome");
//            waitfn();
//            driver.get(Utility.urlcrm);
//            driver.manage().window().maximize();
//            waitfn();
//            objactionlogin.LoginBtnmainpage(driver).click();
//            objactionlogin.txtemail(driver).sendKeys("alpijain10@gmail.com");
//            objactionlogin.txtpwd(driver).sendKeys("Alpi1001");
//            objactionlogin.btnLogin(driver).click();
//
//        }
//
//
//
//
//
//}
