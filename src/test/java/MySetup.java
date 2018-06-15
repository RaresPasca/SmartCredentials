import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class MySetup {

    public AndroidDriver androidDriver;

    @Before
    public void setUp() throws MalformedURLException {

        System.out.println("Starting the Android Driver session in setUp method");
        URL serverUrl = new URL("http://127.0.0.1:4723/wd/hub/");

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(CapabilityType.PLATFORM, "Android");
        capabilities.setCapability(MobileCapabilityType.UDID, "ENU7N16126002505");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy s7 edge");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, "false");
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "600");

        String appPath = "C:\\Users\\rapasca\\Desktop\\SCBuilds\\app-debug.apk";
        capabilities.setCapability(MobileCapabilityType.APP, appPath);
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "de.telekom.smartcredentialsdemoapp");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "de.telekom.smartcredentialsdemoapp.activities.SplashActivity");

        androidDriver = new AndroidDriver(serverUrl, capabilities);
        System.out.println("Android Driver session started successfully in setUp method");

    }

    @After
    public void tearDown(){

        System.out.println("Trying to close Android Driver session in tearDown method");
        //Closes the session
        androidDriver.quit();
        System.out.println("Android Driver session closed successfully in tearDown method");

    }

}
