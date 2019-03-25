import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class WebDriverSetting {
    public WebDriver driver;


    @Before
    public void setUp() throws IOException {


        Properties properties = new Properties();
        FileInputStream in = new FileInputStream("browserFile");
        properties.load(in);
        String browser = properties.getProperty("driver2");

        if ("Chrome".equals(browser)) {
            driver = new ChromeDriver();

        } else if ("FireFox".equals(browser)) {
            driver = new FirefoxDriver();

        } else if ("IE".equals(browser)) {
            driver = new InternetExplorerDriver();

        } else if ("Default Value".equals(browser)) {
            driver = new InternetExplorerDriver();

        }

    }


    @After
    public void quit() {
        driver.quit();

    }
}
