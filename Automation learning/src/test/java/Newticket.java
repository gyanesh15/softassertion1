import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
public class Newticket {
    public static void main(String[] args) throws InterruptedException {
        chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/app-root[1]/app-login[1]/div[1]/p-panel[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"))).sendKeys("16211a1277@bvrit.ac.in");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/form/div[2]/input"))).sendKeys("123456789");
        driver.findElement(By.xpath("html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button[2]/span")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/div/div[2]/div[1]/div/div[2]/p-button/button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/p-dialog[1]/div/div/div[2]/div[1]/p-editor/div/div[2]/div[1]"))).sendKeys("sample1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/p-dialog[1]/div/div/div[2]/div[5]/textarea"))).sendKeys("sample1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/p-dialog[1]/div/div/div[2]/div[2]/textarea"))).sendKeys("sample1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/p-dialog[1]/div/div/div[2]/div[3]/textarea"))).sendKeys("sample1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/p-dialog[1]/div/div/div[2]/div[6]/textarea"))).sendKeys("sample1");
        Select select = new Select(driver.findElement(By.name("Local Issue Status")));
        select.selectByVisibleText("To Do");
    }
    }
