package org.links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinksfb {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\AllLinks\\driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	

	 List<WebElement> alllinks = driver.findElements(By.tagName("a"));
	
	int add= alllinks.size();
	System.out.println(add);
	
	for (WebElement links : alllinks) {
		String attribute = links.getAttribute("href");
		System.out.println(attribute);
		
		
	}
	}

}
