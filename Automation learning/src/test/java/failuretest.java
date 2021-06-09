import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class failuretest {
     WebDriver driver;
    
    @Test
    public void captureScreenshot() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-teams/div/div/div[2]/div/div[1]/div/div[2]/div/div[1]/img")).click();
        
    }
        @AfterMethod
    public void tearDown(ITestResult result) 
        {
            if (ITestResult.FAILURE == result.getStatus())
            {
                Utility.captureScreenshot(driver, result.getName());
            }
            driver.quit();
        }
}
