
import org.junit.Assert;
import org.junit.Test;

public class RootAndUsersTests extends MySetup {


    @Test
    public void displayedUsers() throws InterruptedException {

        Thread.sleep(10000);

        UsersAndRoot usersAndRoot = new UsersAndRoot(androidDriver);

        Assert.assertTrue("Max is not displayed!" , usersAndRoot.maxisDisplayed());
        Assert.assertTrue("Sabine is not displayed!" , usersAndRoot.sabineisDisplayed());
        Assert.assertTrue("Benny is not displayed" , usersAndRoot.bennyisDisplayed());
      
    }

    @Test
    public void checkBennyStatus() throws InterruptedException {

        Thread.sleep(10000);

        UsersAndRoot usersAndRoot = new UsersAndRoot(androidDriver);
        Assert.assertEquals("Account has been locked" , usersAndRoot.bennyStatus());

    }



}
