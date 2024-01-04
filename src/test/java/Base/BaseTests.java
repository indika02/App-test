package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class BaseTests {

    private WebDriver driver;
    protected Homepage HomePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.edge.driver","resources/msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
}
