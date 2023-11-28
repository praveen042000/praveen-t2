package actions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;

import locators.OrganisationLocators;
import stepDefinition.ExternalFileReader;
import utility.HelperClass;

public class OrganisationtActions {
	ExternalFileReader fil = new ExternalFileReader();
	OrganisationLocators Orglc;
	
	public OrganisationtActions() {
		this.Orglc = new OrganisationLocators();
		PageFactory.initElements(HelperClass.getDriver(), Orglc);
	}
	  public void getAdmin() {
	        Orglc.Admin.click();
	    }

	    public void getOrganization() {
	        Orglc.Organization.click();
	    }

	    public void getStructure() {
	        Orglc.Structure.click();
	    }

	    public void getEdit()  {
	        Orglc.Edit.click();
	    }

	    public void getAdd() {
	        Orglc.AddStructure.click();
	    }

	    public void setUnitId(String UnitId) {
	        Orglc.UnitId.sendKeys(UnitId);
	    }

	    public void setName1(String Name) {
	        Orglc.Name1.sendKeys(Name);
	    }

	    public void setDescription1(String Desc) {
	        Orglc.Description1.sendKeys(Desc);
	    }

	    public void getSave() {
	        Orglc.Save.click();
	    }

	    public String getAssertStructure() {
	        return Orglc.StructureAdded.getText();
	    }

	    public String getAssertStructureExit() {
	        return Orglc.Structureexit.getText();
	    }

	    public void StructureEnter(String UnitId, String Name, String Desc) {
	        setUnitId(UnitId);
	        setName1(Name);
	        setDescription1(Desc);
	    }
	

	    // Method to read data from an Excel sheet
	    public void excelsheetread(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
	        // Get data from the Excel sheet
	        List<Map<String, String>> testdata = fil.getData("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

	        // Get skill and description from the specified row
	        String UnitId = testdata.get(rownumber).get("UnitId");
	        String Name = testdata.get(rownumber).get("Name");
	        String Desc = testdata.get(rownumber).get("Desc");
	        

	        // Add skill details using the retrieved data
	        StructureEnter(UnitId,Name, Desc);
	    }

}