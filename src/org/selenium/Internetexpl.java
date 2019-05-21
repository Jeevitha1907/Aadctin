package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//import javafx.beans.property.SetProperty;

public class Internetexpl {
public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver","C:\\Users\\Rithish\\eclipse-workspace\\Selenium\\driver\\IEDriverServer.exe");
	WebDriver Internet = new InternetExplorerDriver();
	Internet.get("https://www.google.com/");
}
}
