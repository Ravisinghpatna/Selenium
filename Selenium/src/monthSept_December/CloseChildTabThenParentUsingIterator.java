package monthSept_December;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildTabThenParentUsingIterator {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		String pwh = driver.getWindowHandle();
		Set<String> allwh = driver.getWindowHandles();
		
		int count=allwh.size();
		System.out.println(count);
		
		Iterator it= allwh.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		if(!(it.equals(pwh)))
		{
			
		}
		else
			driver.close();
		
		
		
	}

}
