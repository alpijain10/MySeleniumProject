//package ActionPackage;
//
//import PageObjectModel.CreateContact;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//
//public class ContactActionupdated extends LoginupdateAction {
//
//        public WebDriver driver;
//
//        public static void main(String args[])
//        {
//            ActionPackage.ContactAction1 objcontact=new ActionPackage.ContactAction1();
//            LoginupdateAction loginclass= new LoginupdateAction();
//            loginclass.loginrun1();
//            WebElement elecont = objcontact.elecontact(loginclass.driver);
//            loginclass.waitfn();
//            Actions act= new Actions(loginclass.driver);
//            act.moveToElement(elecont);
//            act.build().perform();
//            // objcontact.actioncontacthover(loginclass.driver, elecont);
//            objcontact.eleaddcont(loginclass.driver).click();
//        }
//        //public void actioncontacthover(WebDriver driver,WebElement elecont)
//        //{
//        //Actions act= new Actions(driver);
//        //act.moveToElement(t);
//        //act.build().perform();
//        //}
//    }
//
//
