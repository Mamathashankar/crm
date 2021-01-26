package com.crm.testcases.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\webDriverBinaries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String expectedtitle = "Facebook – log in or sign up";
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if (expectedtitle.equals(actualtitle)) {
			System.out.println("correct");
		} else {
			System.out.println(String.format("wrong:%s",expectedtitle,actualtitle));
		}
System.out.println("3");
		driver.quit();
	}
}
