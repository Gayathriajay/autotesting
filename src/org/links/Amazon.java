package org.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Lenovo\\eclipse-workspace\\AllLinks\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("apple iphone 13 pro max");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
WebElement txt = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal']//ancestor::h2)[1]"));
		
		System.out.println(txt.getText());
		
		System.out.println("****");
		
	WebElement price = driver.findElement(By.xpath("(//div//descendant::span[@class='a-price-whole'])[1]"));
		System.out.println(price.getText());
		System.out.println("*******");
		
		WebElement delvry = driver.findElement(By.xpath
("(//div[@class='a-section a-spacing-none a-spacing-top-micro']//child::span//"
		+ "following-sibling::span[text()='Friday, September 16'])[1]"));
		
		System.out.println(delvry.getText());
		
		WebElement delvry1 = driver.findElement(By.xpath("(//span[@class='a-color-base a-text-bold'])[1]"));
	
	System.out.println(delvry1.getText());
	}

}
