package homeWork3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DisableCheckBox {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://syntaxprojects.com/basic-checkbox-demo.php");
        Thread.sleep(2000);
        WebElement button= driver.findElement(By.xpath("//button[@id='enabledcheckbox']"));
        button.click();
        List<WebElement> options = driver.findElements(By.xpath("//input[@class='checkbox-field']"));
        for(WebElement option:options){
            String value=option.getAttribute("value");
            if(value.equalsIgnoreCase("checkbox-4")){
                option.click();
            }
        }
        Thread.sleep(2000);
        driver.quit();


    }
}
