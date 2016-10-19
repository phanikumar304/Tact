package Appium.Tactile;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

public class LogtoSalesforce {
	public static void logSalesforce(AndroidDriver logsf){
		logsf.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/fab_expand_menu_button\")").click();
		logsf.findElementByXPath("//android.widget.TextView[@text = 'Log to Salesforce']").click();
		logsf.findElementByXPath("//android.widget.TextView[@text = 'Contact']").click();
		
	}
	
	public static void scrollContacts(AndroidDriver sfContacts) {
		Dimension dimensions = sfContacts.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("The screen scroll start at" + " " + scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		System.out.println("The screen scroll end at" + " " + scrollEnd);
		sfContacts.swipe(0, scrollStart, 0, scrollEnd, 1000);
		sfContacts.findElementByXPath("//android.widget.TextView[contains(@resource-id,'com.tactile.tact:id/log_contact_name_text_view') and @text = 'Alounge']").click();
		sfContacts.findElementByXPath("//android.widget.TextView[@text = 'Subject']").sendKeys("Sales Executive Meet logging at SalesF");
		sfContacts.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/save_btn\")").click();
	}

}
