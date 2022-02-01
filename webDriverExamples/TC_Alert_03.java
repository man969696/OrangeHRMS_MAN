package webDriverExamples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Alert_03 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
        System.out.println(driver.getTitle());
        
        driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        
        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();
        Thread.sleep(3000);
        
        driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
        driver.findElement(By.name("Submit")).click();
        Thread.sleep(3000);
        
        System.out.println("login Completed");
        driver.findElement(By.linkText("Logout")).click();
        System.out.println("logout Completed");
        driver.close();
        
        }

}
