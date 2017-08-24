package com.companyName.Test;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

import com.companyName.Utils.BrowserUtils;
import com.companyName.Utils.PropertyFileUtils;

public class BaseTest {
	
	static Map<String,String> envMap;
	static public WebDriver d;
	
	
	@BeforeSuite
	void setup(){
		envMap = PropertyFileUtils.LoadPlaceHolder("Env.config");
		d = BrowserUtils.invokeBrowser(envMap.get("os"),envMap.get("browser"));
		d.get(envMap.get("url"));
		d.manage().timeouts().implicitlyWait(Integer.parseInt(envMap.get("implicitWait")), TimeUnit.SECONDS);
	}

}
