import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Form {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Keith\\Downloads\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/form");

        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("Keith");

        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("Cuanan");

        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("Software Tester");

        WebElement educationLevel = driver.findElement(By.cssSelector("input[value='radio-button-2']"));
        educationLevel.click();

        WebElement gender = driver.findElement(By.cssSelector("input[value='checkbox-1']"));
        gender.click();

        WebElement experience = driver.findElement(By.cssSelector("option[value='2']"));
        experience.click();

        WebElement date = driver.findElement(By.id("datepicker"));
        date.sendKeys("02/23/2023");
        date.sendKeys(Keys.RETURN);

        WebElement submitButton = driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary"));
        submitButton.click();

        driver.quit();
    }
}
