package com.companyName.Test;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.companyName.PageObject.LoginPage;
import com.companyName.Utils.PropertyFileUtils;

public class TestLoginPage {
	
	static Map<String,String> evnMap;
	
	@BeforeSuite
	void setup(){
		evnMap = PropertyFileUtils.LoadPlaceHolder("Env.config");
	}
	
	@Test
	void testLogin(){
		//Hello this is comment
		System.out.println("Running on CH");
		System.setProperty("webdriver.chrome.driver", "/Users/piyushyadav/Documents/workspace/MavenSeleniumProject/src/main/java/com/companyname/autoamtion/resourcs/Drivers/mac/chromedriver_2");
		WebDriver d= new ChromeDriver();
		d.get(evnMap.get("url"));
		LoginPage lp = new LoginPage(d);
		lp.login("userisxyz", "password123");
	}

}
