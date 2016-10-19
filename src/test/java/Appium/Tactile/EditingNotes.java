package Appium.Tactile;

import io.appium.java_client.android.AndroidDriver;

public class EditingNotes {
	
	public static void eNotes(AndroidDriver eNote){
		eNote.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/notebook_list_item_linear_layout\")").click();
		eNote.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/imageview_secondary_2\")").click();
		eNote.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/sync_sf_toggle\")").click();
		eNote.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/save_btn\")").click();
		eNote.findElementByAndroidUIAutomator("new UiSelector().resourceId(\"com.tactile.tact:id/fragment_actionBar_menu_button_layout\")").click();
		
	}

}
