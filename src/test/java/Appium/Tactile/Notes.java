package Appium.Tactile;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class Notes {
	
	public static void goToNotes(AndroidDriver gTnotes){
		WebElement contact = gTnotes.findElementByXPath("//android.widget.TextView[contains(@resource-id,'com.tactile.tact:id/contact_name_text_view') and @text = 'Alounge']");
		contact.click();
		gTnotes.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/fab_expand_menu_button\")").click();
		gTnotes.findElementByXPath("//android.widget.TextView[@text = 'Add Note']").click();	
	}
	
	public static void addNotes(AndroidDriver aNotes){
		
		for (int i=0;i<=2;i++){
			
		WebElement title = aNotes.findElementByXPath("//android.widget.TextView[@text = 'Title']");
		title.click();
		title.sendKeys("Sales Executive Meet"+" "+ i);
		aNotes.findElementByXPath("//android.widget.TextView[@text = 'Body']").sendKeys("Sales Executive Meet @Tact"+" "+ i);
		aNotes.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/save_btn\")").click();
		
		if (i<=1){
			aNotes.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/fab_expand_menu_button\")").click();
			aNotes.findElementByXPath("//android.widget.TextView[@text = 'Add Note']").click();	
		}
		
		else if (i>1&&i<=2){
			break;
		}
		
		}
		
		aNotes.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/fragment_menu_button\")").click();
		aNotes.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/menu_button\")").click();
		aNotes.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/drawer_notebook_field\")").click();
		//aNotes.findElementByXPath("//android.widget.TextView[@text = 'Notebook']").click();
		
	}

}
