

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	private static XSSFWorkbook wb;

	public static void main(String[] args) throws IOException 
	{
		File src=new File("D:\\register.xlsx");
		//C:\Users\srbobbil\Documents

		FileInputStream fis =new FileInputStream(src); 
		wb = new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowCount=sheet.getLastRowNum(); 
		System.out.println("Total no of rows:"+rowCount);
		
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
        WebDriver driver = new ChromeDriver(); 
        
        for(int i=1;i<=rowCount;i++)
		{
        	driver.get("http://demo.opencart.com"); 
        	driver.manage().window().maximize();	
        	driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/a/span[1]")).click();
        	System.out.println("My Account is clicked");
        	driver.findElement(By.xpath("//*[@id='top-links']/ul/li[2]/ul/li[1]/a")).click();
        	System.out.println("Register is clicked");
        	String firstname =sheet.getRow(i).getCell(1).getStringCellValue();
		    driver.findElement(By.name("firstname")).sendKeys(firstname);
			WebElement Name = driver.findElement(By.id("input-firstname"));
			String name = Name.getAttribute("value");
			System.out.println(name);
			if(Validations.Firstname(name))
			{
				String lastname =sheet.getRow(i).getCell(2).getStringCellValue();
				driver.findElement(By.name("lastname")).sendKeys(lastname);
				WebElement surname = driver.findElement(By.id("input-lastname"));
				String Lname = surname.getAttribute("value");
				System.out.println(Lname);
				if(Validations.Lastname(Lname)&&Lname!=null)
	            {
					String email  =sheet.getRow(i).getCell(3).getStringCellValue();
					driver.findElement(By.id("input-email")).sendKeys(email);
					WebElement mail = driver.findElement(By.id("input-email"));
					String Id = mail.getAttribute("value");
					System.out.println(Id);
					if(Validations.Email(Id))
	        		{
						String telephone  =sheet.getRow(i).getCell(4).getStringCellValue();
						driver.findElement(By.xpath("//*[@id='input-telephone']")).sendKeys(telephone);
						WebElement phone = driver.findElement(By.id("input-telephone"));
						String number = phone.getAttribute("value");
						System.out.println(number);
						if(Validations.Telephone(number))
	        			{
							String pass  =sheet.getRow(i).getCell(5).getStringCellValue();
							driver.findElement(By.cssSelector("#input-password")).sendKeys(pass);
							WebElement code = driver.findElement(By.id("input-password"));
							String password = code.getAttribute("value");
							System.out.println(password);
							if(Validations.Password(password))
	        				{
			
								String conpass  =sheet.getRow(i).getCell(6).getStringCellValue();
								driver.findElement(By.cssSelector("#input-confirm")).sendKeys(conpass);
								WebElement confirm = driver.findElement(By.id("input-confirm"));
								String passconfirm = confirm.getAttribute("value");
								System.out.println(passconfirm);
								if(Validations.Confirmation(password, passconfirm))
	        					{
									driver.findElement(By.cssSelector(".radio-inline>input")).click();
	        						driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[1]")).click();
	        						driver.findElement(By.xpath("//*[@id='content']/form/div/div/input[2]")).click();
	        						driver.close();
	        					}
	        				}
	        			}
	        		}
	            }
			}
		}
	}
}