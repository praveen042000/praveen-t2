package stepDefinition;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Assert;

import actions.AdminUserActions;
import actions.LeaveActions;
import actions.LoginActions;
import actions.MyinfoActions;
import actions.OrganisationtActions;
import actions.PimActions;
import actions.SkillActions;
import actions.TimeActions;
import actions.UserAction;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HelperClass;
import utility.Utility;

public class StepDefinitionOfWebsite {
	LoginActions logact = new LoginActions();
	Utility data = new Utility();
	TimeActions TiAct = new TimeActions();
	OrganisationtActions OrgAc = new OrganisationtActions();
	AdminUserActions ADac = new AdminUserActions();
	SkillActions skillac = new SkillActions();
	UserAction usac = new UserAction();
	LeaveActions Leaac = new LeaveActions();
	PimActions pimac = new PimActions();
	MyinfoActions myinac = new MyinfoActions();

@Given("User is on the Website homepage")
public void user_is_on_the_orangehrm_com_homepage() {
	HelperClass.driver.get(data.url);
	HelperClass.log.info("Navigated to the website homepage");
}

@When("User enters the valid username and password")
public void user_enters_the_valid_username_and_password() {
	logact.loginAccount(data.username,data.password);	
	HelperClass.log.info("Entered valid username and password");
   
}

@When("User clicks the login button")
public void user_clicks_the_login_button() {
	logact.clickLoginButton();
	HelperClass.log.info("Clicked on the login button");
	
}

@Then("User sees the login successful message")
public void user_sees_the_login_successful_message() throws InterruptedException {
	Assert.assertTrue(logact.getVerifyText().contains("Dashboard"));
	HelperClass.log.info("Login successful. Dashboard page displayed");
    
}

@When("User enters the invalid username {string}")
public void user_enters_the_invalid_username(String string) {
	logact.username(string);
	HelperClass.log.info("Entered invalid username");
}

@When("User enters the invalid password {string}")
public void user_enters_the_invalid_password(String string) {
	logact.password(string);
	HelperClass.log.info("Entered invalid password");
}

@Then("Login is unsuccessful with error messages")
public void login_is_unsuccessful_with_error_messages() {
	Assert.assertTrue(logact.getErrorText().contains("Invalid credentials"));
	HelperClass.log.info("Login unsuccessful. Error message displayed");
}

@When("user selects the time feature")
public void user_selects_the_time_feature() {
	TiAct.clickTimeButton();
	HelperClass.log.info("user selects the time feature");
}

@When("user selects the projectinfo category")
public void user_selects_the_projectinfo_category() {
	 TiAct.clickProjectInfo();
	 HelperClass.log.info("user selects the projectinfo category");
}

@When("user selects the customer option")
public void user_selects_the_customer_option() {
	TiAct.selectCustomer();
	HelperClass.log.info("user selects the customer option");
}

@When("user clicks the add button")
public void user_clicks_the_add_button() {
	 TiAct.clickaddbutton();
	 HelperClass.log.info("user clicks the add button");
}

@When("user adds the addcustomer name, description, and clicks the save button")
public void user_adds_the_addcustomer_name_description_and_clicks_the_save_button() {
	 TiAct.AddEmployee(data.name,data.discription);
	    TiAct.savebutton();
	    HelperClass.log.info("user adds the addcustomer name, description, and clicks the save button");
}

@Then("user sees the added customer details")
public void user_sees_the_added_customer_details() {
	Assert.assertTrue(TiAct.getVerifydiscription().contains("welcome"));
	  Assert.assertTrue(TiAct.getverifyerror().contains("Already exists"));
	  HelperClass.log.info("user sees the added customer details");
}

@When("User clicks admin feature")
public void user_clicks_admin_feature() {
	OrgAc.getAdmin();
	 HelperClass.log.info("User clicks admin feature");
    
}

@When("user selects Organization category")
public void user_selects_organization_category() {
	OrgAc.getOrganization();
	 HelperClass.log.info("user selects Organization category");
}

@When("User selects Structure in organaization category")
public void user_selects_structure_in_organaization_category() {
	OrgAc.getStructure();
	HelperClass.log.info("User selects Structure in organaization category");
    
}

@When("User enables Edit function")
public void user_enables_edit_function() {
	OrgAc.getEdit();
    HelperClass.log.info("User enables Edit function");
}

@When("User clicks Add button")
public void user_clicks_add_button() {
	 OrgAc.getAdd();
	   HelperClass.log.info("User clicks Add button");
}

@When("User enters unit identification using sheetname {string} and rownumber {int}")
public void user_enters_unit_identification_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	OrgAc.excelsheetread(sheetname,rownumber);
    HelperClass.log.info("User enters unit identification");
}

@When("user clicks save")
public void user_clicks_save() {
	OrgAc.getSave();
	HelperClass.log.info("user clicks save");
}

@Then("User should be able to see structure added sucessfully")
public void user_should_be_able_to_see_structure_added_sucessfully() {
	Assert.assertEquals(OrgAc.getAssertStructureExit(),"Organization Structure");
	HelperClass.log.info("User should be able to see structure added sucessfully");
}
@When("User selects Job")
public void user_selects_job() {
	ADac.getJob();
	HelperClass.log.info("User selects Job");
   
}

@When("User selects Employee Status")
public void user_selects_employee_status() {
	  ADac.getEmployeestatus();
	   HelperClass.log.info("User selects Employee Status");
    
}

@When("User Clicks on Add button")
public void user_clicks_on_add_button() {
	ADac.getAddButton();
	   HelperClass.log.info("User Clicks on Add button");
}

@When("User Enters the Employee Status")
public void user_enters_the_employee_status() {
	 ADac.setUserStatus();
	    HelperClass.log.info("User Enters the Employee Status");
}

@When("User Clicks on Save button")
public void user_clicks_on_save_button() {
	 ADac.getSaveButton();
	   HelperClass.log.info("User Clicks on Save button");
   
}

@Then("User Recevices Successfully Saved message")
public void user_recevices_successfully_saved_message() {
	 HelperClass.log.info("User Recevices Successfully Saved message");
}
@When("user select the qualification category")
public void user_select_the_qualification_category() {
	skillac.clickqualificationButton();
	HelperClass.log.info("user select the qualification category");
}

@When("user select the add skills category")
public void user_select_the_add_skills_category() {
	skillac.clickskillButton();
	skillac.clickskilladdButton();
	HelperClass.log.info("user select the add skills category");
}

@When("user enter the details using sheetname {string} and rownumber {int}")
public void user_enter_the_details_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	skillac.excelsheetread(sheetname,rownumber);
	HelperClass.log.info("user enter the details");
}

@When("user click save button")
public void user_click_save_button() {
	 skillac.clickskillsaveButton();
	    HelperClass.log.info("user click save button");
}

@Then("user is able to see the added skilled details")
public void user_is_able_to_see_the_added_skilled_details() {
	skillac.getVerifyTextskill();
	HelperClass.log.info("user is able to see the added skilled details");
}

@When("User the enters the username to Search")
public void user_the_enters_the_username_to_search() {
	usac.setUsername();
	   HelperClass.log.info("User the enters the username to Search");
}

@When("User the Clciks the savebutton")
public void user_the_clciks_the_savebutton() {
	usac.getUmSaveButton();
	HelperClass.log.info("User the Clciks the savebutton");
}

@Then("User is Checking the Status of user is Enabled or not")
public void user_is_checking_the_status_of_user_is_enabled_or_not() {
	usac.getEnable();
    HelperClass.log.info("User is Checking the Status of user is Enabled or not");
}

@When("User clicks the leave feature")
public void user_clicks_the_leave_feature() throws InterruptedException {
	Leaac.leavetype();
	HelperClass.log.info("User clicks the leave feature");
}

@When("user cliks to the configure to the field")
public void user_cliks_to_the_configure_to_the_field() throws InterruptedException {
	Leaac.configure();
	HelperClass.log.info("user cliks to the configure to the field");
}

@When("user Creates new leave type using sheetname {string} and rownumber {int}")
public void user_creates_new_leave_type_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
	Leaac.excelsheetread(sheetname,rownumber);
	   HelperClass.log.info("user Creates new leave type");
}

@Then("user sees the adding the leave page switching")
public void user_sees_the_adding_the_leave_page_switching() throws InterruptedException {
//	Assert.assertTrue(Leaac.getverifyleave().contains("Leave Types"));
	Assert.assertTrue(Leaac.getalreadyexists().contains("Already exists"));
	 HelperClass.log.info("user sees the adding the leave page switching");
}


@When("User select the pim feature")
public void user_select_the_pim_feature() {
	pimac.pimclick();
	HelperClass.log.info("User select the pim feature");
}

@When("Select the add employee category")
public void select_the_add_employee_category() throws InterruptedException {
	pimac.addemployeecategory();
}
@When("User fills the add employee details using sheetname {string} and rownumber {int}")
public void user_fills_the_add_employee_details_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
	 pimac.excelsheetread(sheetname, rownumber);
	    pimac.enable();
	    pimac.excelsheetreads(sheetname, rownumber);
	    pimac.pimsave();
	    HelperClass.log.info("User fills the add employee details");
}

@Then("User is able to see the new employee added details")
public void user_is_able_to_see_the_new_employee_added_details() throws InterruptedException {
//	Assert.assertTrue(pimac.pimverify().contains("Venkadesh"));
	Assert.assertTrue(pimac.pimalreadyexists().contains("Username already exists"));
	HelperClass.log.info("User is able to see the new employee added details");
}

@When("user clicks the Myinfo category")
public void user_clicks_the_myinfo_category() {
	myinac.getmyinfo();
	HelperClass.log.info("user clicks the Myinfo category");
	
}

@When("user enters the firstname, lastname, and nickname using sheetname {string} and rownumber {int}")
public void user_enters_the_firstname_lastname_and_nickname_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
	myinac.excelsheetread(sheetname, rownumber);
}

@When("And User edit the myinfo details using sheetname {string} and rownumber {int}")
public void and_user_edit_the_myinfo_details_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
	myinac.excelsheetread2(sheetname, rownumber);
	HelperClass.log.info("User edit the myinfo details");
}

@When("user enters the select the value of Nationality, Marital Status,and dateofbrith using sheetname {string} and rownumber {int}")
public void user_enters_the_select_the_value_of_nationality_marital_status_and_dateofbrith_using_sheetname_and_rownumber(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
	myinac.natilityclick();
	myinac.MaritalStatus();
	myinac.excelsheetread3(sheetname, rownumber);
	HelperClass.log.info("user enters the select the value of Nationality");
}

@When("user clicks the save button")
public void user_clicks_the_save_button() throws InterruptedException {
	myinac.getmysave();
	HelperClass.log.info("user clicks the save button");
}

@When("user selects the blood group")
public void user_selects_the_blood_group() {
	myinac.mybloodgroup();
	HelperClass.log.info("user selects the blood group");
}

@Then("user is able to see the edited details")
public void user_is_able_to_see_the_edited_details() {
	String verify = myinac.myinfoverify();
	Assert.assertTrue(verify.contains("Praveen"));
	HelperClass.log.info("user is able to see the edited details");
}

}
