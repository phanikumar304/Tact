package Appium.Tactile;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TactAccount {
	
AndroidDriver driver= null;
	
	@Before
	public void openApp() throws MalformedURLException{
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "Appium");
		capabilities.setCapability("platformName", "Andriod");
		capabilities.setCapability("platformVersion","6.0");
		capabilities.setCapability("deviceName", "Galaxy");
		capabilities.setCapability("app", "C:\\Users\\Phani\\Downloads\\tactile.apk");
		capabilities.setCapability("appPackage", "com.tactile.tact");
		capabilities.setCapability("appActivity", "com.tactile.tact.activities.SplashActivity");
		 driver=new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}

	@Test
	public void signInAccount() throws InterruptedException {
		TactLogin.tactCred(driver);
		TapScreen.tapScreen(driver);
		Thread.sleep(500);
		Contacts.contactMenu(driver);
		TapScreen.tapScreen(driver);
		Contacts.scrollContacts(driver);
		Notes.goToNotes(driver);
		Notes.addNotes(driver);
		EditingNotes.eNotes(driver);
		LogtoSalesforce.logSalesforce(driver);
		LogtoSalesforce.scrollContacts(driver);

	}

}
