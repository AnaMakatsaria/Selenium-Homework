package homeWork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework02 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");

        WebElement createNewAccount=driver.findElement(By.linkText("Create new account"));
        createNewAccount.click();
        Thread.sleep(2000);

        WebElement firstName= driver.findElement(By.name("firstname"));

        firstName.sendKeys("Abla");
        WebElement lastName= driver.findElement(By.name("lastname"));
        lastName.sendKeys("Masal");
        WebElement email= driver.findElement(By.name("reg_email__"));
        email.sendKeys("sdds5@gmail.com");
        WebElement password= driver.findElement(By.id("password_step_input"));
        password.sendKeys("127_hjsg");

        WebElement month= driver.findElement(By.id("month"));
        month.sendKeys("May");
        WebElement day= driver.findElement(By.id("day"));
        day.sendKeys("12");
        WebElement year= driver.findElement(By.id("year"));
        year.sendKeys("1967");
        WebElement gender= driver.findElement(By.className("_58mt"));
        gender.click();
        Thread.sleep(2000);
        WebElement button= driver.findElement(By.name("websubmit"));
        button.click();

        WebElement reEnterEmail= driver.findElement(By.name("reg_email_confirmation__"));
        reEnterEmail.sendKeys("sdd@gmail.com");

    }
}
