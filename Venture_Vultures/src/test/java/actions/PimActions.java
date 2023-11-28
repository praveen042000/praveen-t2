package actions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.PimLocators;
import stepDefinition.ExternalFileReader;
import utility.HelperClass;

public class PimActions {
	PimLocators pimlac;
	 ExternalFileReader fil = new ExternalFileReader();
	public PimActions() {
		this.pimlac = new PimLocators();
		PageFactory.initElements(HelperClass.getDriver(), pimlac);
	}
	public void pimclick() {
		pimlac.pim.click();
	}
	
	public void addemployeecategory() throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(pimlac.addemployee));
		pimlac.addemployee.click();
	}
	public void empfirstname(String empfirstname)
	{
		HelperClass.wait.until(ExpectedConditions.visibilityOf(pimlac.empfirstname));
		pimlac.empfirstname.sendKeys(empfirstname);
	}
	public void emplastname(String emplastname)
	{
		pimlac.emplastname.sendKeys(emplastname);
	}
	
	
	public void empnamedetails(String empfirstname, String emplastname) throws InterruptedException {
		empfirstname(empfirstname);
		emplastname(emplastname);
	}
	
	
	// Method to read data from an Excel sheet
    public void excelsheetread(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
        // Get data from the Excel sheet
        List<Map<String, String>> testdata1 = fil.getData("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

        // Get skill and description from the specified row
        String empfirstname = testdata1.get(rownumber).get("empfirstname");
        String emplastname = testdata1.get(rownumber).get("emplastname");

        // Add skill details using the retrieved data
        empnamedetails(empfirstname, emplastname);
        
    }	
	public void enable() {
		pimlac.enablebutton.click();
	}
	public void username(String empusername)
	{
		HelperClass.wait.until(ExpectedConditions.visibilityOf(pimlac.empusername));

		pimlac.empusername.sendKeys(empusername);
	}
	public void password(String emppassword)
	{
		pimlac.emppassword.sendKeys(emppassword);
	}
	public void empcpassword(String empcpassword)
	{
		pimlac.empcpassword.sendKeys(empcpassword);
	}
	
	
	public void userdetails(String empusername, String emppassword,String empcpassword ) throws InterruptedException {
		username(empusername);
		password(emppassword);
		empcpassword(empcpassword);
	}
	
	
	public void excelsheetreads(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
        // Get data from the Excel sheet
        List<Map<String, String>> testdata2 = fil.getData("C:\\Team2\\Praveen_pilot_project\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

        // Get skill and description from the specified row
        String empusername = testdata2.get(rownumber).get("empusername");
        String emppassword = testdata2.get(rownumber).get("emppassword");
        String empconfirmpassword = testdata2.get(rownumber).get("empcpassword");

        // Add skill details using the retrieved data
        userdetails(empusername, emppassword,empconfirmpassword);
        
    }	
	public void pimsave() {
		pimlac.savebutton.click();
	}
	public String pimverify() throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(pimlac.verfiyuser));

		return pimlac.verfiyuser.getText();
	}
	
	public String pimalreadyexists() throws InterruptedException {
		HelperClass.wait.until(ExpectedConditions.visibilityOf(pimlac.AlreadyExists));

		return pimlac.AlreadyExists.getText();
	}

}
