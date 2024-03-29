import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static java.lang.Thread.sleep;
public class screenshot {
    public static void main(String[] args) throws IOException, InterruptedException {
        Date currentdate = new Date();
        String screenshotfilename = currentdate.toString().replace(" ","-").replace(":", "-");
        System.out.println(screenshotfilename);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        sleep(5000);
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshotFile,new File(".//screenshot//" + screenshotfilename + ".png"));
    }
}
