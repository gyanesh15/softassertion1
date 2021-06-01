import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//body/app-root[1]/app-login[1]/div[1]/p-panel[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]")))
                .sendKeys("16211a1277@bvrit.ac.in");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/form/div[2]/input"))).sendKeys("123456789");
       driver.findElement(By.xpath("html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button[2]/span")).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html/body/app-root/app-dashboard/div/div[1]/div[2]/div[3]/div"))).click();
       Thread.sleep(2000);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("html[1]/body[1]/app-root[1]/app-dashboard[1]/div[1]/div[2]/div[1]/div[1]/i[1]"))).click();
       // driver.quit();
    }
}
