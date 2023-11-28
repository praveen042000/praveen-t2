package actions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import locators.SkillLocators;
import stepDefinition.ExternalFileReader;
import utility.HelperClass;

public class SkillActions {
    // Instance variables
    SkillLocators skillloc;
    ExternalFileReader fil = new ExternalFileReader();

    // Constructor
    public SkillActions() {
        // Initialize SkillLocators using PageFactory
        this.skillloc = new SkillLocators();
        PageFactory.initElements(HelperClass.getDriver(), skillloc);
    }

    // Method to click the qualification button
    public void clickqualificationButton() {
        skillloc.qulification.click();
    }

    // Method to click the skill button
    public void clickskillButton() {
        skillloc.skill.click();
    }

    // Method to click the add skill button
    public void clickskilladdButton() {
        skillloc.addskillbutton.click();
    }

    // Method to set the skill name
    public void setaddskill(String skill) {
        skillloc.addskillname.sendKeys(skill);
    }

    // Method to set the skill description
    public void setaddskilldescription(String addskilldescription) {
        skillloc.addskilldescription.sendKeys(addskilldescription);
    }

    // Method to click the skill save button
    public void clickskillsaveButton() {
        skillloc.skillsavebutton.click();
    }

    // Method to add skill details by setting skill name and description
    public void addskilldetails(String skill, String skilldesc) {
        setaddskill(skill);
        setaddskilldescription(skilldesc);
    }

    // Method to verify the text on the page
    public void getVerifyTextskill() {
    	HelperClass.wait.until(ExpectedConditions.visibilityOf(skillloc.AdSort));
//        wait.until(ExpectedConditions.visibilityOf(skillloc.AdSort));
        Assert.assertEquals(skillloc.AdSort.getText(), "Qualifications");
        System.out.println("Successfully Saved");
    }

    // Method to read data from an Excel sheet
    public void excelsheetread(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
        // Get data from the Excel sheet
        List<Map<String, String>> testdata = fil.getData("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

        // Get skill and description from the specified row
        String skill = testdata.get(rownumber).get("skill");
        String discription = testdata.get(rownumber).get("discription");

        // Add skill details using the retrieved data
        addskilldetails(skill, discription);
    }
}