package DDfwDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo5 
{


	@Test(dataProvider="setData")
	public void funA(String userName,String password) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(4000);
		WebElement userName1=driver.findElement(By.xpath("//input[@name='username']"));
		userName1.sendKeys("userName1");		
		WebElement password1=driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("password1");
		

	}
    
	@DataProvider
	public Object[][] setData()
	{
		Object[][] o1=new Object[3][2];
		o1[0][0]="parveen";
		o1[0][1]="rehan";
		o1[1][0]="Begum";

		o1[1][1]="md";
		o1[2][0]="yaseen";
		o1[2][1]="shabbir";

		
return o1;
		
	}




}
