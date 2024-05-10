package homeWork1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHomework {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://syntaxprojects.com/input-form-locator.php");
        Thread.sleep(2000);
        WebElement firstName= driver.findElement(By.id("first_name"));
        firstName.sendKeys("Anna");
        WebElement lastName= driver.findElement(By.name("last_name"));
        lastName.sendKeys("Mak");
        WebElement email= driver.findElement(By.name("email"));
        email.sendKeys("email@gmail.com");
        Thread.sleep(5000);

        WebElement submit= driver.findElement(By.id("submit_button"));
        submit.click();

    }
}
