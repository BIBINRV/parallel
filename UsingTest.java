package org.parl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UsingTest {

	WebDriver driver;


		@Parameters("browser")
		@Test
		public void Facebook(String brwsr) {

			if (brwsr.equals("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();

			}
//			else if (brwsr.equals("firefox")) {
//				WebDriverManager.geckoDriver.setup();
//				driver= new geckoDriver();			
//			}
			driver.get("https://www.facebook.com");
			driver.manage().window().maximize();
















		}

	}
