package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Dell");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aysha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Siddeeqa");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ayshu");
		driver.findElement(By.name("departmentName")).sendKeys("Finance");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Accounting Services");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("aysha91011@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("The tilte of Resulting Page is" + title);	
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		
		
		WebElement DuplicateCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		DuplicateCompanyName.clear();
		DuplicateCompanyName.sendKeys("Acer");
		
		WebElement DuplicatefirstName = driver.findElement(By.id("createLeadForm_firstName"));
		DuplicatefirstName.clear();
		DuplicatefirstName.sendKeys("Meeran");
				
		driver.findElement(By.name("submitButton")).click();
					
		String title1 = driver.getTitle();
		System.out.println("The Second title of Resulting Page is" +title1);
	}

}
