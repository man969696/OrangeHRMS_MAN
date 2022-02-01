package webDriverExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class TC001 {
     public static void main(String args[]) throws Exception  {
//test case steps
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(3000);
		System.out.println("Application opened");
//verify title
//actual result compare to Expected result
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Title matched");
		}
		else 
		{
		System.out.println("Title not matched");
		System.out.println(driver.getTitle());
		}
		Thread.sleep(3000);
                                                                                                                                       
//mouseover
           Actions ac = new Actions(driver);
           ac.moveToElement(driver.findElement(By.linkText("PIM"))).perform();
           System.out.println("Mouseover Completed");
            Thread.sleep(3000);
//click on submenu
           driver.findElement(By.linkText("Add Employee")).click();
           System.out.println("Clicked on submenu");
            Thread.sleep(3000);
           driver.findElement(By.linkText("Logout")).click();
            Thread.sleep(3000);
           System.out.println("Logout Completed");
           driver.close();
}
}



