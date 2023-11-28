
package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminUserLocators {
		
	 // Locator for the "Job" element in the top navigation bar
		@FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']//child::li[@class='oxd-topbar-body-nav-tab --parent --visited']//following-sibling::li[@class='oxd-topbar-body-nav-tab --parent'][1]")
		public WebElement Job;
		
	    // Locator for the "Employment Status" link
		@FindBy(xpath = "//a[text()='Employment Status']")
		public WebElement EmploymentStatus;
		
	    // Locator for the "Add" button
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")
		public WebElement AddButton;
		
	    // Locator for the input field to add employee details
		@FindBy(xpath ="//div[@class='oxd-input-group__label-wrapper']//following-sibling::div//child::input[@class='oxd-input oxd-input--active']")
		public WebElement AddEmpDetails;
		
	    // Locator for the "Save" button
		@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")
		public WebElement SaveButton;
		
	    // Locator for the header asserting the Employment Status
		@FindBy(xpath = "//h6[text()='Employment Status']")//span[@class='oxd-topbar-header-breadcrumb']
		public WebElement AssertJob;

	}

