package Appium.Tactile;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class TactLogin {
	public static void tactCred(AndroidDriver tactLogin) throws InterruptedException{
		tactLogin.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/log_me_in\")").click();
		tactLogin.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/email_text\")").sendKeys("phanikumar851@gmail.com");
		System.out.println("Username got entered");
		tactLogin.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/password_text\")").sendKeys("jaisairam1");
		System.out.println("Password got entered");
		WebElement login = tactLogin.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/log_in\")");
		System.out.println(login.getText());
	    login.click();
	    Thread.sleep(2000);
		
	}

}
