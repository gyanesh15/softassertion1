import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class softassertion {
    @Test
    public void titletest()
    {
        SoftAssert softAssert = new SoftAssert();
        String expectedtitle = "Example";
        //String expectedtext = "Login with Email";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://digitaas.io/d3qa/app/#/login");
        String actualtitle = driver.getTitle();
        System.out.println(actualtitle);
        softAssert.assertEquals("Example","Maestro","Softassertion failed");
        softAssert.assertTrue(expectedtitle.equals(actualtitle),"Title verification failed");
//        softAssert.assertEquals(actualtitle,expectedtitle,"Title verification failed");
        //String actualtext = driver.findElement(By.xpath("//span[contains(text(),'Login with Email')]")).getText();
        //softAssert.assertEquals(actualtext,expectedtext,"Matched");
        driver.close();
        //softAssert.assertAll();

    }
    
}
