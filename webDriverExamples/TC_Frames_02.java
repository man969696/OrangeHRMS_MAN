package webDriverExamples;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Frames_02 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		System.out.println(driver.getTitle());
		
		 driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
         driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
         driver.findElement(By.name("Submit")).click();
         System.out.println("Login Completed");
         Thread.sleep(4000);
         
         //Enter into frames
         driver.switchTo().frame("rightMenu");
         
         //clicking on add button
         driver.findElement(By.xpath("//input[@value='Add'][@type='button']")).click();
         driver.findElement(By.name("txtEmpFirstName")).sendKeys("Mangesh");
         driver.findElement(By.name("txtEmpLastName")).sendKeys("Neul");
         driver.findElement(By.id("btnEdit")).click();
         System.out.println("New Employee added");
         Thread.sleep(4000);
         
         //Exit from frame
         driver.switchTo().defaultContent();
         
         driver.findElement(By.linkText("Logout")).click();
         System.out.println("Logout Completed");
         driver.close();

	}

}
