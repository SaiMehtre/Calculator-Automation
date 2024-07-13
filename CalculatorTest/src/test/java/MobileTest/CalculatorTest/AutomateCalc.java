package MobileTest.CalculatorTest;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class AutomateCalc {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		//Gather Desired capabilities
		
				DesiredCapabilities capabilities = new DesiredCapabilities();
				 capabilities.setCapability("app", "C:\\\\Users\\\\Rashi\\\\Downloads\\\\Calculator_15.0.15_Apkpure.apk");
				   capabilities.setCapability("deviceName","\"realme RMX3785\"");
			        capabilities.setCapability("platformname", "Android");     
			        capabilities.setCapability("automationName","uiautomator2");
			        capabilities.setCapability("platformversion", "14.0.0.81");
			       
			        capabilities.setCapability("appPackage","com.miui.calculator");
			        capabilities.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");
			        
			        

			        URL url = URI.create("http://192.168.1.6:4723/").toURL();
			        
			        AndroidDriver driver = new AndroidDriver(url, capabilities);
			        Thread.sleep(5000);
			        System.out.println("Application Started");
			        
			        
			        //click on number 8
			       WebElement num8 =  driver.findElement(By.id("com.miui.calculator:id/digit_8"));
			       num8.click(); //perform click action on number 8
			       
			       //click on plus sign
			       WebElement plus =  driver.findElement(By.id("com.miui.calculator:id/op_add"));
			       plus.click(); //perform click action on number 8
			    
			        //click on number 2
			       WebElement num2 =  driver.findElement(By.id("com.miui.calculator:id/digit_2"));
			       num2.click(); //perform click action on number 8
			    
			       
			        //click on equal sign
			       WebElement equal =  driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
			       equal.click(); //perform click action on number 8
			    
			       
			       //click on result sign
			       WebElement result =  driver.findElement(By.id("com.miui.calculator:id/result"));
			      String resultString =  result.getText();
			      
			      if(resultString.equals(result.getText()))
			      {
			    	  System.out.println("Pass");
			      }
			      else
			      {
			    	  System.out.println("fail");
			      }
			      
			    
			 
			        driver.quit();//CLOSE SESSION
			        
}
}