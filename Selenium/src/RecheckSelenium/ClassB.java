package RecheckSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassB {
static {System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		ClassA.testA(driver);
		//ClassA ob=new ClassA();
		//ob.testA(driver);
		
	}

}
