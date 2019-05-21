package org.selenium;

//import java.nio.file.Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.ClickAction;
//import org.openqa.selenium.remote.server.handler.FindElement;

//import javafx.beans.property.SetProperty;

public class XpathDay1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rithish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver path  = new ChromeDriver();
		path.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement u = path.findElement(By.name("name"));
		u.sendKeys("Vivekanandan");		
		WebElement UV= path.findElement(By.name("email"));
		UV.sendKeys("rvkece@gmail.com");
		WebElement UW = path.findElement(By.name("phone"));
		UW.sendKeys("9790565912");
		/*WebElement U = path.findElements(By.value("ADYAR"));(By.placeholder("Branch"));
		U.sendKeys("9790565912");
		WebElement UO = path.findElement(By.value("submit"));
		UO.click();
		WebElement UR = path.findElement(By.id("email"));
		UR.sendKeys("rvkece@gmail.com");*/
		WebElement UO = path.findElement(By.name("submit"));
		UO.click();
		
		
		
	}

}
