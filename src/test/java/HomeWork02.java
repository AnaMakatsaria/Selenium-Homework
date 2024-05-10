import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork02 {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/cssSelector.php");
        WebElement inputBox= driver.findElement(By.cssSelector("input[id='profileID']"));
        inputBox.sendKeys("Banana");
        WebElement profile=driver.findElement(By.cssSelector("input#profileBox"));
        profile.sendKeys("Hello");
        WebElement feedbackFjenny=driver.findElement(By.cssSelector("input.form-control.feedbackBox1"));
        feedbackFjenny.sendKeys("very good");
        WebElement feedbackFromR= driver.findElement(By.cssSelector("input.form-control.feedbackBox2"));
        feedbackFromR.sendKeys("omg");
        WebElement Email= driver.findElement(By.cssSelector("input[name='email']"));
        Email.sendKeys("abla@gmail.com");
        WebElement courseTopic = driver.findElement(By.cssSelector("input[name*='contentInput']"));
        courseTopic.sendKeys("selenium");
        WebElement intro = driver.findElement(By.cssSelector("input[name^='IntroInput']"));
        intro.sendKeys("selenium");
        WebElement conclusion = driver.findElement(By.cssSelector("input[name$='Input']"));
        conclusion.sendKeys("selenium");





    }
}
