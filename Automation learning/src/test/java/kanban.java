import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class kanban {
    @Test
    public void verifyPageTitle() throws InterruptedException {
        String expectedtext="Kanban Board";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
      //  Thread.sleep(5000);
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//body/app-root[1]/app-login[1]/div[1]/p-panel[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")))
                .sendKeys("16211a1277@bvrit.ac.in");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/form/div[2]/input"))).sendKeys("123456789");
        driver.findElement(By.xpath("html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button[2]/span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/app-root/app-dashboard/div/div[1]/div[2]/div[3]/div"))).click();
        String actualtext = driver.findElement(By.
                xpath("//span[contains(text(),'Kanban Board')]")).getText();
        Assert.assertEquals(actualtext,"Kanban Board");
        driver.close();
        driver.quit();
    }
}
