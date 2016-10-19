package Appium.Tactile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class TapScreen {
	
	public static void tapScreen(MobileDriver tapS){
		WebDriverWait wait = new WebDriverWait(tapS, 1000); 
	    WebElement messageElement = wait.until( ExpectedConditions.presenceOfElementLocated(By.className("android.view.View")));
	    TouchAction action = new TouchAction(tapS);
	    action.longPress(messageElement).release().perform();
	    System.out.println("Tap got applied");
	}

}
