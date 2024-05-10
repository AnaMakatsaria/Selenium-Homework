package homoWork2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork01 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/Xpath.php");
        WebElement userName= driver.findElement(By.xpath("//input[@id='title']"));
        userName.sendKeys("ana");
        Thread.sleep(2000);


        WebElement button= driver.findElement(By.xpath("//button[@id='DisplayName']"));
        button.click();

       WebElement sQ1 = driver.findElement(By.xpath("//input[contains(@name,'securityPartial')]"));
       sQ1.sendKeys("your favorite color?");
       WebElement text= driver.findElement(By.xpath("//label[contains(text(),'amet')]"));
        System.out.println(text.getText());
        WebElement apiSettings= driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiSettings.sendKeys("anmarax");
        WebElement email1= driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("a@gmail.com");
        WebElement email2= driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("ab@gmail.com");
        WebElement email3= driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("ac@gmail.com");
        WebElement field1= driver.findElement(By.xpath("//input[@data-detail='one' and @name='customField']"));
        field1.sendKeys("hello");
        WebElement field2= driver.findElement(By.xpath("//input[@data-detail='two' and @name='customField']"));
        field2.sendKeys("World");
        WebElement customField1= driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='one']"));
        customField1.sendKeys("How are");
     WebElement customField2= driver.findElement(By.xpath("//input[@name='customField1' and @data-detail='two']"));
        customField2.sendKeys("You");



    }
}
