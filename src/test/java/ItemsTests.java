import org.junit.Assert;
import org.junit.Test;

public class ItemsTests extends MySetup {

    @Test
    public void checkItemsDefaultSize() throws InterruptedException {

        Thread.sleep(10000);

        UsersAndRoot usersAndRoot = new UsersAndRoot(androidDriver);
        ItemsScreen itemsScreen = new ItemsScreen(androidDriver);

        usersAndRoot.tapOnMaxLogin();
        Assert.assertEquals(5,itemsScreen.elementsListSize());

    }

    @Test
    public void checkFiltering() throws InterruptedException {

        Thread.sleep(10000);

        UsersAndRoot usersAndRoot = new UsersAndRoot(androidDriver);
        ItemsScreen itemsScreen = new ItemsScreen(androidDriver);

        usersAndRoot.tapOnMaxLogin();
        itemsScreen.tapOnSearch();
        Thread.sleep(2000);
        Assert.assertTrue("Search bar not found!" , itemsScreen.isSearchBarDisplayed());
        Assert.assertTrue("Searched element does not match with one found!" , itemsScreen.enterInSearchBarAndCheckFirstElement("CREDENTIALS"));
        Thread.sleep(2000);

    }

}
