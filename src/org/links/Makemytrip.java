package org.links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemytrip {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Lenovo\\eclipse-workspace\\AllLinks\\driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://www.makemytrip.com/");
driver.manage().window().maximize();

driver.findElement(By.xpath("//a[text()='Search']")).click();
WebElement txt = driver.findElement(By.xpath("(//div[@class='makeFlex simpleow'])[4]"));
	
	System.out.println(txt.getText());
	}

}
