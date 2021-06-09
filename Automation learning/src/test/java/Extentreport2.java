import New1.Utility1;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
public class Extentreport2
{
    ExtentReports extent;
    ExtentTest logger;
    WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        ExtentHtmlReporter reporter =new ExtentHtmlReporter("C:\\Users\\Gyanesh\\Desktop\\k\\testautomationdt" +
                "-digitaltaas_d3_automation-b1a2da7a754e\\Automation learning\\reports\\Extentreportscreenshot.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        logger=extent.createTest("LoginTest");
    }
   
    @Test
    public void loginTest() throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        Thread.sleep(2000);
        System.out.println("title is"+driver.getTitle());
        Assert.assertTrue(driver.getTitle().contains("Test"));
        
    }
    @AfterMethod
    public void tearDown(ITestResult result1) throws IOException {
        if(result1.getStatus()==ITestResult.FAILURE)
        {
            String temp= Utility1.getScreenshot(driver);
            logger.fail( result1.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
        }
        extent.flush();
        driver.quit();
    }
    
}
