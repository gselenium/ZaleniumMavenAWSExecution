package com.zalenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ZaleniumTest {
	@Test
	public void zaleniumtest() throws Exception {
		System.out.println("Zalenium test executing with zalenium");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName(BrowserType.FIREFOX);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444//wd/hub"), cap);
		driver.manage().window().maximize();
		driver.get("http://gmail.com");
		driver.quit();
		
	}

}
