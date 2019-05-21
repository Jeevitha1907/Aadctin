package org.selenium;
	import java.util.List;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class WebTable{
	private static final int WebElement = 0;

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Rithish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
WebDriver path  = new ChromeDriver();
path.get(" http://toolsqa.com/automation-practice-table/");
List<WebElement> table = path.findElements(By.tagName("tr"));
/*for (WebElement ttable : table) {
	List<WebElement> ttd = ttable.findElements(By.tagName("td"));
	for (WebElement tttd : ttd) {
		String text = tttd.getText();
		System.out.println(text);
		if(text.equals("China")&& text.equals("Rank")) {
			List<WebElement> Xn =tttd.findElements(By.tagName("td"));
			String abc= ((WebElement) Xn).getText();
			System.out.println(abc);
			}
	}
	
}
*/
for(int i = 6; i<table.size()-3; i--)
{
	//int o=table.size();
	//System.out.println("table size is"+ o);
List<WebElement>cell = table.get(i).findElements(By.tagName("td"));
for(int j=0; j<cell.size(); j++)
{
	String text = cell.get(j).getText();
	System.out.println(text);
}

}
	}
	}
