package Appium.Tactile;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class Contacts {
	
	public static void contactMenu(AndroidDriver selMenu) throws InterruptedException{
		selMenu.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/menu_button\")").click();
		Thread.sleep(500);
		   WebElement contacts =  selMenu.findElementByXPath("//android.widget.TextView[@text='Contacts']");
		   System.out.println(contacts.getText());
		   contacts.click();
	}
	
	public static void scrollContacts(AndroidDriver sContacts) {
		Dimension dimensions = sContacts.manage().window().getSize();
		Double screenHeightStart = dimensions.getHeight() * 0.5;
		int scrollStart = screenHeightStart.intValue();
		System.out.println("The screen scroll start at" + " " + scrollStart);
		Double screenHeightEnd = dimensions.getHeight() * 0.2;
		int scrollEnd = screenHeightEnd.intValue();
		System.out.println("The screen scroll end at" + " " + scrollEnd);
		sContacts.swipe(0, scrollStart, 0, scrollEnd, 1000);
		/*WebElement contact = sContacts.findElementByXPath("//android.widget.TextView[contains(@resource-id,'com.tactile.tact:id/contact_name_text_view') and @text = 'Alounge']");
		contact.click();*/

	}

}
