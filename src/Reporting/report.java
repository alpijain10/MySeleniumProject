package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class report {

    public static void main(String[] args)
    {
        ExtentHtmlReporter report=new ExtentHtmlReporter("C:\\Users\\nisha\\IdeaProjects\\Reports");
        ExtentReports extent=new ExtentReports("C:\\Users\\nisha\\IdeaProjects\\Reports");
        extent.attachReporter(report);
        ExtentTest test=extent.createTest("This is my first test case");
        ExtentTest node=test.createNode("LOgin Verification");
        extent.flush();

    }
}
