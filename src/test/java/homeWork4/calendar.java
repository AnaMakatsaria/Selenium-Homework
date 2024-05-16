package homeWork4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class calendar {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");

        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
        //from calendar select any date of your choice
        driver.findElement(By.xpath("//input[@id='calFromDate']")).click();
        WebElement dropD= driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(dropD);
        sel.selectByVisibleText("Aug");
        WebElement dropYear=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select selY=new Select(dropYear);
        selY.selectByValue("1998");
        List<WebElement>dates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for(WebElement date:dates){
            if(date.getText().equals("17")){
                date.click();
                break;

            }
        }
        driver.findElement(By.xpath("//input[@id='calToDate']")).click();
        WebElement tDropD=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select select=new Select(tDropD);
        select.selectByValue("4");
        WebElement tDropDy=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        Select select1=new Select(tDropDy);
        select1.selectByVisibleText("2016");
        List <WebElement> tDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement tdate:tDates) {
            if (tdate.getText().equals("16")) {
                tdate.click();
                break;
            }
        }






    }
}
