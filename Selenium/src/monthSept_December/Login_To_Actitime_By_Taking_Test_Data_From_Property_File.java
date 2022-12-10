package monthSept_December;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_To_Actitime_By_Taking_Test_Data_From_Property_File {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		FileInputStream fis=new FileInputStream("./data/actitime.property");
		Properties p=new Properties();
		p.load(fis);

		driver.get("url");
//		driver.findElement(By.id(""));
//		driver.findElement(By.name(""));
		
		



	}

}
