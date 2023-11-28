package actions;
  
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import locators.UserLocators;
import utility.HelperClass;
import utility.Utility;


public class UserAction {
	  // Instance variables
	UserLocators userloc;
    Utility utility = new Utility();

    // Constructor
    public UserAction() {
        // Initialize AdminUserLocator using PageFactory
    	userloc = new UserLocators();
        PageFactory.initElements(HelperClass.getDriver(), userloc);
    }

    // Method to set the username
    public void setUsername() {
    	userloc.UmUsername.sendKeys(utility.username);
    }

    // Method to click the UmSaveButton
    public void getUmSaveButton() {
    	userloc.UmSaveButton.click();
    }

    // Method to assert and print the user enablement status
    public void getEnable() {
        // Assert that the text in UmEnable matches "Enabled"
        Assert.assertEquals(userloc.UmEnable.getText(), "Enabled");
        System.out.println("Admin is Enabled");
    }

}
