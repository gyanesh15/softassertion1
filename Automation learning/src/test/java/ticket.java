import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ticket{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/app-root[1]/app-login[1]/div[1]/p-panel[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/input[1]"))).sendKeys("16211a1277@bvrit.ac.in");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/form/div[2]/input"))).sendKeys("123456789");
        driver.findElement(By.xpath("html/body/app-root/app-login/div/p-panel/div/div[2]/div/div/div[2]/div/div[3]/button[2]/span")).click();
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/div/div[2]/div[1]/div/div[2]/p-button/button"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[1]/textarea"))).sendKeys("sample1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[2]/p-inputnumber/span/input"))).sendKeys("1");
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[3]/textarea"))).sendKeys("sample1");
      Thread.sleep(2000);
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[4]/div[2]/p-editor/div/div[2]/div[1]/p"))).sendKeys("sample1");
    //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[5]/div[2]/p-editor/div/div[2]/div[1]"))).sendKeys("sample1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[6]/textarea"))).sendKeys("status");
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[7]/textarea"))).sendKeys("high");
       Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[8]/textarea"))).sendKeys("Sprint1");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[9]/textarea"))).sendKeys("Assignee");
       Thread.sleep(2000);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/ul/p-dropdownitem[4]/li/span[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[10]/textarea"))).sendKeys("Reportor");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[11]/textarea"))).sendKeys("Creator");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[12]/p-calendar/span/input"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[2]/table/tbody/tr[4]/td[4]/span"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[13]/p-calendar/span/input"))).click();
      Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[2]/table/tbody/tr[3]/td[3]/span"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[14]/p-calendar/span/input"))).click();
       Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[2]/table/tbody/tr[4]/td[3]/span"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[15]/textarea"))).sendKeys("resolved");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[16]/textarea"))).sendKeys("Mastero");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[17]/textarea"))).sendKeys("Project");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[18]/textarea"))).sendKeys("d3-11");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[19]/textarea"))).sendKeys("Austin");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[20]/p-dropdown/div/span"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/ul/p-dropdownitem[1]/li/span[1]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[21]/p-dropdown/div/span"))).click();
       Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/ul/p-dropdownitem[2]/li"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[1]/div[1]/div[22]/p-dropdown/div/span"))).click();
       Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div/ul/p-dropdownitem[9]/li/span[1]"))).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-dashboard/div/div[2]/div[2]/app-backlog/app-add-edit-dialog/p-dialog/div/div/div[2]/div/div/div[2]/div/div/button/span"))).click();
    }
    
    }