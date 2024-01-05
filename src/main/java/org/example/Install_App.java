package org.example;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Install_App {
    public AndroidDriver driver;
    @Test
    public void test() throws MalformedURLException {


        System.out.println(System.getProperty("user.dir")+"src/main/resources/ApiDemos-debug.apk");
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
        caps.setCapability(MobileCapabilityType.APP,System.getProperty("user.dir")+"\\src\\main\\resources\\ApiDemos-debug.apk");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver(url,caps);
        System.out.println("Application got installed in mobile");
    }
}
