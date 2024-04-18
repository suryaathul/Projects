package Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.geeksforgeeks;

public class geekstest {
WebDriver driver;

@BeforeTest
public void setup()
{
 driver=new FirefoxDriver();
 
}
@BeforeMethod
public void url()
{
	driver.get("https://www.geeksforgeeks.org/");
	driver.manage().window().maximize();
}
@Test
public void test1() throws Exception
{
	geeksforgeeks obj=new geeksforgeeks(driver);
	obj.titleverification();
	obj.contentverify();
	obj.logoverify();
	obj.linkvalidation();
	obj.searchbar();
	//obj.search();
	//obj.screenshot();
	//obj.register();
	//obj.log();
	//obj.scroll();
}

















}
