import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;



public class UsersAndRoot {

    private AndroidDriver androidDriver;

    private String MaxXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[1]/android.widget.TextView[1]";
    private String SabineXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.TextView[1]";
    private String BennyXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[3]/android.widget.TextView[1]";
    private String BennyStatusAccountXpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[3]/android.widget.TextView[2]";


    public UsersAndRoot(AndroidDriver androidDriver){
        this.androidDriver = androidDriver;
    }

    public boolean maxisDisplayed(){

        MobileElement MaxButton = (MobileElement) androidDriver.findElement(By.xpath(MaxXpath));
        boolean dispalyedMax = MaxButton.isDisplayed();
        return dispalyedMax;

    }

    public boolean sabineisDisplayed(){

        MobileElement SabineButton = (MobileElement) androidDriver.findElement(By.xpath(SabineXpath));
        boolean dispalyedSabine = SabineButton.isDisplayed();
        return dispalyedSabine;

    }

    public boolean bennyisDisplayed(){

        MobileElement BennyButton = (MobileElement) androidDriver.findElement(By.xpath(BennyXpath));
        boolean dispalyedBenny = BennyButton.isDisplayed();
        return dispalyedBenny;

    }

    public String bennyStatus(){

        MobileElement bennyStatus = (MobileElement) androidDriver.findElement(By.xpath(BennyStatusAccountXpath));
        String BennyStatusFromApp = bennyStatus.getText();
        return BennyStatusFromApp;

    }

    public ItemsScreen tapOnMaxLogin(){

        MobileElement MaxButton = (MobileElement) androidDriver.findElement(By.xpath(MaxXpath));
        MaxButton.click();
        return new ItemsScreen(androidDriver);

    }


}
