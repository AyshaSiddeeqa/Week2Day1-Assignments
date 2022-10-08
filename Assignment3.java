package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment3 {

	private static WebElement webElement;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys ("Aysha");
	    driver.findElement(By.id("lastNameField")).sendKeys("Siddeeqa");
		driver.findElement(By.name ("submitButton")).click();
		
		WebElement findElement = driver.findElement(By.id("viewContact_fullName_sp"));
		String PrintFristName = findElement.getText();
		System.out.println(PrintFristName);
		String title = driver.getTitle();
		System.out.println("The browser title is" + title);
		driver.close();
		
	}

}
