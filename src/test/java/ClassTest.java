import org.junit.Test;
import org.openqa.selenium.By;

public class ClassTest extends FunctionalClass {

    @Test
    public void test() {

        driver.get("http://www.rozetka.com.ua");
        driver.findElement(By.name("search")).sendKeys("Ноутбук");
        getLocator("button-inner");
        isElementPresent("pab-h4");
        driver.quit();

    }

}



