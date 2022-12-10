package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;


public class PrintAllLinks {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the url");
		String url = sc.nextLine();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		List<WebElement> allLink = driver.findElements(By.xpath("//a"));
		int count = allLink.size();
		System.out.println(count);
		
		for(int i=0;i<allLink.size();i++)
		{
			String text = allLink.get(i).getText();
			System.out.println(text);
		}
		
		driver.close();
		
		
	}

}
