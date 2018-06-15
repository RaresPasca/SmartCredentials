import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;


import java.util.List;

public class ItemsScreen {

    private AndroidDriver androidDriver;

    private String ElementsListId = "root_item";
    private String SearchButtonId = "menu_filter";
    private String SearchFieldId = "filter_field";
    private String FirstElementFromFilterID = "layout_item_title";


    public ItemsScreen(AndroidDriver androidDriver){
        this.androidDriver = androidDriver;
    }

    public int elementsListSize(){

        List<MobileElement> ElementsList = (List<MobileElement>) androidDriver.findElements(By.id(ElementsListId));
        int ListSize =  ElementsList.size();
        return ListSize;

    }

    public void tapOnSearch(){

        MobileElement SearchButton = (MobileElement) androidDriver.findElement(By.id(SearchButtonId));
        SearchButton.click();

    }

    public boolean isSearchBarDisplayed(){

        MobileElement SearchButton = (MobileElement) androidDriver.findElement(By.id(SearchFieldId));
        boolean SearchBarDisplayed = SearchButton.isDisplayed();
        return SearchBarDisplayed;

    }

    public boolean enterInSearchBarAndCheckFirstElement(String searchItem){

        MobileElement SearchBar = (MobileElement) androidDriver.findElement(By.id(SearchFieldId));
        MobileElement FirstElementFromFilter = (MobileElement) androidDriver.findElements(By.id(FirstElementFromFilterID)).get(0);
        SearchBar.sendKeys(searchItem);
        String firstElement = FirstElementFromFilter.getText();
        System.out.println("User searched for: " + searchItem + ",in app first element is: " +firstElement );
        if (firstElement.equals(searchItem)) {
            return true;
        } else return false;


    }




}
