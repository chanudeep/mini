

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class Registrationform {

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
	        WebDriver driver = new ChromeDriver(); 
	
	        driver.get("http://demo.opencart.com"); 
	        driver.manage().window().maximize();
	        
	        driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
	        driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
	        driver.findElement(By.name("firstname")).sendKeys("Anudeep");
	        WebElement Name = driver.findElement(By.id("input-firstname"));
			String name = Name.getAttribute("value");
			
	        if(Validations.Firstname(name))
	        {
	        driver.findElement(By.name("lastname")).sendKeys("chowtapalli");
	        WebElement surname = driver.findElement(By.id("input-lastname"));
			String Lname = surname.getAttribute("value");
	        if(Validations.Lastname(Lname))
	        {
	        driver.findElement(By.id("input-email")).sendKeys("Anudeep@mail.com");
	        WebElement mail = driver.findElement(By.id("input-email"));
			String Id = mail.getAttribute("value");
			if(Validations.Email(Id))
			{
	        driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys("1095972061");
	        WebElement phone = driver.findElement(By.id("input-telephone"));
			String number = phone.getAttribute("value");
	        if(Validations.Telephone(number))
	        {
	        driver.findElement(By.cssSelector("#input-password")).sendKeys("aduoo548"); 
	        WebElement code = driver.findElement(By.id("input-password"));
			String password = code.getAttribute("value");
	        if(Validations.Password(password))
	        {
	        driver.findElement(By.cssSelector("#input-confirm")).sendKeys("aduoo548");
	        WebElement confirm = driver.findElement(By.id("input-confirm"));
			String passconfirm = confirm.getAttribute("value");
			
	        if(Validations.Confirmation(password, passconfirm))
	        {
	        	driver.findElement(By.cssSelector(".radio-inline>input")).click();
			driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[1]")).click();
			driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
			driver.quit();
	        }
			}
			}
		}
	}
	}	
	}	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	        