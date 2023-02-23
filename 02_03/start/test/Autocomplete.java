import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Keith\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("479 78 Ave NE, Calgary, AB");
        Thread.sleep(1000);

        WebElement autocompleteResult = driver.findElement(By.id("pac-item"));
        autocompleteResult.click();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        driver.quit();
    }
}
