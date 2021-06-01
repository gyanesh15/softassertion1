import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class google {
    @Test
    public void verifyPageTitle() throws InterruptedException {
        String expectedtext="Login with Emai";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        Thread.sleep(5000);
        String actualtext = driver.findElement(By.
                xpath("//span[contains(text(),'Login with Email')]")).getText();
        Assert.assertEquals(expectedtext,"Login with Email");
        driver.close();
        driver.quit();
        
    }
}
