package myPractices;

import java.io.IOException;

public class Screenshot_Methodcall_2 {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws IOException {
		
		Screenshot_Methodcall_1 ss=new Screenshot_Methodcall_1();
		ss.screenshot();
	}

}
