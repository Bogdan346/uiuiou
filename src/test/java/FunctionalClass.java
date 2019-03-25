import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FunctionalClass extends WebDriverSetting implements FuncInterface {

    public void getLocator(String className) {
        driver.findElement(By.className(className));
        WebDriverWait wait = new WebDriverWait(driver, 3);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.className(className)));
        element.click();
    }


    public boolean isElementPresent(String loc) {
        try {
            driver.findElement(By.className(loc));
            return true;

        } catch (NoSuchElementException e) {
            System.out.println(e);
            return false;
        }
    }
}
