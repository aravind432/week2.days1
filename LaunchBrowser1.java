package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


 public class LaunchBrowser1 {
 public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();

	//find username and type value in textbox
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	String text=driver.findElement(By.tagName("h2")).getText();
	System.out.println(text);
	driver.findElement(By.linkText("CRM/SFA")).click();
	String title=driver.getTitle();
	System.out.println(title);
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aravind");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Aravind");
	driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
	driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SOFTWARE TESTER");
    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("50000");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("anand");
	driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("anand");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
	driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1000");








}
}

