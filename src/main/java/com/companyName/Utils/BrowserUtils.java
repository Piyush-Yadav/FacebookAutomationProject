package com.companyName.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class BrowserUtils {
	
	
	@Test
	void testM(){
		invokeBrowser("mac","ff");
	}

	static String driverDirPath =System.getProperty("user.dir")+
			"/src/main/java/com/companyName/Resources/Driver/";
	
	public static WebDriver invokeBrowser(String os,String browser){
		WebDriver d = null;

		switch (os) {
		case "win":
			switch (browser) {
			case "ch":
				System.setProperty("webdriver.chrome.driver", driverDirPath+"Win/chromedriver.exe");
				break;
			case "ff":

				break;

			default:
				break;
			}
			break;

		case "linux":
			switch (browser) {
			case "ch":

				break;
			case "ff":

				break;

			default:
				break;
			}

			break;

		case "mac":
			switch (browser) {
			case "ch":
				System.setProperty("webdriver.chrome.driver",driverDirPath+"Mac/chromedriver_2");
				d = new ChromeDriver();
				break;
			case "ff":
				System.setProperty("webdriver.gecko.driver",driverDirPath+"Mac/geckodriver");
				d = new FirefoxDriver();
				break;

			default:
				System.setProperty("wedriver.gecko.driver",driverDirPath+"Mac/geckodriver");
				d = new FirefoxDriver();
				break;
			}

			break;
		}

		return d;


	}

}
