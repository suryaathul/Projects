package pages;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;


public class geeksforgeeks {
	WebDriver driver;
	
	
	 By logo=By.xpath("/html/body/nav/div/a[2]/div/img");
	By signin=By.xpath("/html/body/div[2]/div/div[2]/div[1]/label[1]");
	By emailid=By.xpath("//*[@id=\"luser\"]");
	By password=By.xpath("//*[@id=\"password\"]");
	By login=By.xpath("/html/body/div[2]/div/div[2]/div[1]/section[1]/form/button");
	
	
	By signup=By.xpath("/html/body/div[2]/div/div[2]/div[1]/label[2]");
	By email=By.xpath("//*[@id=\"email\"]");
	By paswrd=By.xpath("//*[@id=\"reg-password\"]");
	By inst=By.xpath("//*[@id=\"organization\"]");
	By logup=By.xpath("/html/body/div[8]/div[3]/div/div[2]/div[1]/section[2]/form/button");
	By checkbox=By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span/div[1]");
			
	
	
	//---------------constructor----------
	
	public geeksforgeeks(WebDriver driver)
	{
		this.driver=driver;
	}
	//------------Titleverification----------------
	

     public void titleverification()
     {
                String actualtitle=driver.getTitle();
                String expectedtitle="geeks";
                if(actualtitle.equals(expectedtitle))
                  {
                      System.out.println("pass");
                   }
                   else
                   {
                        System.out.println("fail");
                    }
       }

  //--------------contentverification-----------
     public void contentverify() {
    	 String content=driver.getPageSource();
    	 if(content.contains("Tutorials"))
    	 {
    		 System.out.println("content verified");
    	 }
    	 else
    	 {
    		 System.out.println("content not verified");
    	 }
    	 
    	 }
//---------logoverification-----------
     public void logoverify()
     {
    	 By logo=By.xpath("/html/body/nav/div/a[2]/div/img");
    	 WebElement logodesign=driver.findElement(logo);
    	 boolean display=logodesign.isDisplayed();
    	 if(display)
    	 {
    		 System.out.println("logo is displayed");
    	 }
    	 else
    	 {
    		 System.out.println("logo is not displayed");
    	 }
     } 
	
//---------------link validation--------------
     public void linkvalidation() throws Exception
     {
    	 String baseurl="https://www.geeksforgeeks.org/";
    	 //driver.get(baseurl);
    	 URL ob=new URL(baseurl);
    	 HttpsURLConnection con=(HttpsURLConnection)ob.openConnection();
    	 con.connect();
    	 
    	 if(con.getResponseCode()==200)
    	 {
    		 System.out.println("valid url :" +baseurl);
    	 }
    	 else
    	 {
    		 System.out.println("invalid urln :" +baseurl);
    	 }
     }
	
	//----------------searchbar verification------------
     public void searchbar()
     {
    	 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/span/span/span[1]/input")).sendKeys("python",Keys.ENTER);
     }
     
      public void search()
      {
    	  driver.findElement(By.xpath("//*[@id=\"gcse-form\"]/button/i")).click();
      }
	
      
  //---------------screenshot---------------
      public void screenshot() throws Exception
      {
    	  WebElement dayelement=driver.findElement(logo);
  		File srcl=dayelement.getScreenshotAs(OutputType.FILE);
  		FileHandler.copy(srcl,new File("./screenshot//logo1.png"));
  		
      }
      
      
     //-----------------signup------------
      public void register()
      {
    	  driver.findElement(signup).click();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    	  driver.findElement(email).sendKeys("suryareghu1998@gmail.com");
    	  driver.findElement(paswrd).sendKeys("surya123");
    	  driver.findElement(inst).sendKeys("luminar");
    	  driver.findElement(checkbox).click();
    	  driver.findElement(logup).click();
    	  
      }
      
      //--------------signin-------------
      public void log()
      {
    	  driver.findElement(signin).click();
    	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    	  driver.findElement(emailid).sendKeys("suryareghu1998@gmail.com");
    	  driver.findElement(password).sendKeys("surya123");
    	  driver.findElement(login).click();
      }
    //-----------------scrolldown--------------
      public void scroll() throws Exception
      {
    	  Thread.sleep(500);
    	  JavascriptExecutor js=(JavascriptExecutor)driver;
    	  js.executeScript("window.scrollBy(0,300)");
      }
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
