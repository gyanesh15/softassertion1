import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.Test;
public class ExtentReportDemo {
        @Test
        public void loginTest()
        {
            System.out.println("login DOne");
            ExtentHtmlReporter reporter =new ExtentHtmlReporter("C:\\Users\\Gyanesh\\Desktop\\k\\testautomationdt" +
                    "-digitaltaas_d3_automation-b1a2da7a754e\\Automation learning\\reports\\Extendreport.html");
            ExtentReports extent = new ExtentReports();
            extent.attachReporter(reporter);
          ExtentTest logger= extent.createTest("Logintest");
          logger.log(Status.INFO,"Login to Mestro");
          logger.log(Status.PASS,"Title verified");
          extent.flush();
        }
    }

