package actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.AdminUserLocators;
import utility.HelperClass;
import utility.Utility;


public class AdminUserActions {
	 // Instance variables
	AdminUserLocators Loc;
    Utility utility = new Utility();

    // Constructor
    public AdminUserActions() {
        // Initialize AdminUserLocator using PageFactory
        Loc = new AdminUserLocators();
        PageFactory.initElements(HelperClass.getDriver(), Loc);
    }

 // Method to navigate to the Job section
    public void getJob() {
    	Loc.Job.click();
    }

    // Method to navigate to the Employment Status section
    public void getEmployeestatus() {
    	Loc.EmploymentStatus.click();
    }

    // Method to click the Add button
    public void getAddButton() {
    	Loc.AddButton.click();
    }

    // Method to set user status
    public void setUserStatus() {
    	Loc.AddEmpDetails.sendKeys(utility.changename);
    }

    // Method to click the Save button
    public void getSaveButton() {
    	Loc.SaveButton.click();
    }

    // Method to assert the status
    public void getAssertStatus() {
        // Wait for the visibility of AssertJob element
//      wait.until(ExpectedConditions.visibilityOf(Loc.AssertJob));
    	
    	HelperClass.wait.until(ExpectedConditions.visibilityOf(Loc.AssertJob));
    }
}
