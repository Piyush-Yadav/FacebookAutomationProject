package com.companyName.Test;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.companyName.PageObject.LoginPage;
import com.companyName.Utils.PropertyFileUtils;

public class TestLoginPage extends BaseTest{
	
	
	@Test
	void testLogin(){
		LoginPage lp = new LoginPage(d);
		lp.login("userisxyz", "password123");
	}

}
