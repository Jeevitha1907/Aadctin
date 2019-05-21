package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.remote.server.handler.FindElement;
//import org.openqa.selenium.remote.server.handler.GetTitle;

public class WebBrowsers {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rithish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver object = new ChromeDriver();
object.get("https://www.google.com/search?source=hp&ei=gYyoXN6lGIXjz7sPx7ytqAg&q=Greens+Technology&btnK=Google+Search&oq=Greens+Technology&gs_l=psy-ab.3..0l10.756.983..38334...0.0..2.503.1732.3-1j2j1......0....1..gws-wiz.....0.LrU7AG-YyLs");
/*string title=object.GetTitle();
String url = object.getCurrentUrl();
System.out.println(url);
String title = object.getTitle();
System.out.println(title);
object.quit();*/
WebElement text = object.findElement(By.name("q"));
text.sendKeys("Greens Technology");
//WebElement click = object.findElement(By.name("btnK"));
//click.click();
object.findElement(By.xpath("//span[text()='Greens Technology']")).click();
//object.findElement(By.xpath(xpathExpression))
}
}