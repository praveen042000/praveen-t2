package actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import locators.MyinfoLocators;
import stepDefinition.ExternalFileReader;
import utility.HelperClass;

	public class MyinfoActions {
		MyinfoLocators bill ;
		ExternalFileReader fil = new ExternalFileReader();
		public MyinfoActions() {
			this.bill = new MyinfoLocators();
			
			PageFactory.initElements(HelperClass.getDriver(), bill);
			
		}
		public void getmyinfo()  {
			bill.myinfo.click();
		}
		public void RobotClass() throws AWTException {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
		      robot.keyPress(KeyEvent.VK_A);
		      robot.keyRelease(KeyEvent.VK_A);
		      robot.keyRelease(KeyEvent.VK_CONTROL);
		      robot.keyPress(KeyEvent.VK_BACK_SPACE);
		      robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		}
		public void setmyfirstname(String myfirstname) throws InterruptedException, AWTException {
			HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.myfirstname));
			bill.myfirstname.click();		
			RobotClass();
			bill.myfirstname.click();		
			RobotClass();
			bill.myfirstname.click();		
			RobotClass();
			bill.myfirstname.sendKeys(myfirstname);
			
			
		}
		
		public void setmylastname(String mylastname) throws AWTException {
			
			bill.mylastname.click();
			RobotClass();
			bill.mylastname.sendKeys(mylastname);
		}
//		public void setnickName(String nickName) throws AWTException {
//			bill.nickName.click();
//			RobotClass();
//			bill.nickName.sendKeys(nickName);
//		}
		
		
		public void setemployeeid(String employeeid) throws AWTException {
			bill.employeeid.click();
			RobotClass();
			bill.employeeid.sendKeys(employeeid);
		}
		public void setotherid(String otherid) throws AWTException {
			bill.otherid.click();
			RobotClass();
			bill.otherid.sendKeys(otherid);
		}
		public void setlicencenumber(String licencenumber) throws AWTException {
			bill.licencenumber.click();
			RobotClass();
			bill.licencenumber.sendKeys(licencenumber);
		
		}
		public void setExpirydate(String Expirydate) throws AWTException {
			bill.Expirydate.click();
			RobotClass();
			bill.Expirydate.sendKeys(Expirydate);
		
		}
//		public void setssnnumber(String ssnnumber) throws AWTException {
//			bill.ssnnumber.sendKeys(ssnnumber);
//			RobotClass();
//			bill.ssnnumber.sendKeys(ssnnumber);
	//	
//		}
//		public void setsinnumber(String sinnumber) throws AWTException {
////			bill.ssnnumber.click();
//			RobotClass();
//			bill.ssnnumber.sendKeys(sinnumber);
	//	
//		}
		public void getmysave() throws InterruptedException  {
			bill.infosave.click();	
			HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.infosave));	
			HelperClass.getDriver().navigate().refresh();
		}
		public void myinfoname(String myfirstname, String mylastname) throws InterruptedException, AWTException {
			
			setmyfirstname(myfirstname);
			setmylastname(mylastname);
			
	}
		
		// Method to read data from an Excel sheet
	    public void excelsheetread(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
	        // Get data from the Excel sheet
	        List<Map<String, String>> testdata1 = fil.getData("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

	        // Get skill and description from the specified row
	        String myfirstname = testdata1.get(rownumber).get("myfirstname");
	        String mylastname = testdata1.get(rownumber).get("mylastname");
	       

	        // Add skill details using the retrieved data
	        myinfoname(myfirstname, mylastname);
	        
	    }	
		
		
		public void mydetails(String employeeid,String otherid,String licencenumber,String Expirydate) throws AWTException {
			setemployeeid(employeeid);
			setotherid(otherid);
			setlicencenumber(licencenumber);
			setExpirydate(Expirydate);
//			setssnnumber(ssnnumber);
//			setsinnumber(sinnumber);
		}
		
		 public void excelsheetread2(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		        // Get data from the Excel sheet
		        List<Map<String, String>> testdata2 = fil.getData("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

		        // Get skill and description from the specified row
		        String employeeid = testdata2.get(rownumber).get("employeeid");
		        String otherid = testdata2.get(rownumber).get("otherid");
		        String licencenumber = testdata2.get(rownumber).get("licencenumber");
		        String Expirydate = testdata2.get(rownumber).get("Expirydate");

		        // Add skill details using the retrieved data
		        mydetails(employeeid, otherid,licencenumber,Expirydate);
		        
		    }	
		public void natilityclick() throws InterruptedException {
			bill.nationality.click();
		HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.nationality));		
			bill.nationality.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		}
		
		public void MaritalStatus() {
			bill.maritalstatus.click();
	bill.maritalstatus.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		}
		public String getsucessfull() {
			String Vtext =  bill.savedsucessfully.getText();
			return Vtext;
		}
		
		
		
		 public void dateOfBirthClick(String dateOfBirth) throws AWTException {
		        bill.dateOfBirth.click();
		        RobotClass();
		        bill.dateOfBirth.sendKeys(dateOfBirth);
		    }
		 public void excelsheetread3(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		        // Get data from the Excel sheet
		        List<Map<String, String>> testdata3 = fil.getData("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

		        // Get skill and description from the specified row
		        String dateOfBirth = testdata3.get(rownumber).get("dateOfBirth");

		        // Add skill details using the retrieved data
		        dateOfBirthClick(dateOfBirth);
		        
		    }
		 
//		 public void miltaryservice(String country) throws AWTException {
//			 bill.miltaryservice.click();
//			 RobotClass();
//			 bill.miltaryservice.sendKeys(country);
//		 }
		 
		 public String myinfoverify() {
			 return bill.myinfoverify.getText();
			 
		 }
		 
		 public void mybloodgroup() {
			 bill.bloodgroup.click();
			 bill.bloodgroup.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
			 bill.bloodgroupsave.click();
			 
		 }
		 public void addfile() throws InterruptedException, AWTException {
			 bill.addfile.click();
			 bill.browser.click();
			 HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.browser));
			 Robot rb = new Robot();	
			 // copying File path to Clipboard
		    StringSelection str = new StringSelection("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		
		     // press Contol+V for pasting
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		
		    // release Contol+V for pasting,
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		
		    // for pressing and releasing Enter
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		 }
		 public void comment(String comment) throws InterruptedException {
			 HelperClass.wait.until(ExpectedConditions.elementToBeClickable(bill.comment));
			 bill.comment.sendKeys(comment);			 
		 }
		 public void excelsheetread4(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException, AWTException {
		        // Get data from the Excel sheet
		        List<Map<String, String>> testdata4 = fil.getData("C:\\Team2\\Team2\\Venture_Vultures\\src\\test\\resources\\Data.xlsx", sheetname);

		        // Get skill and description from the specified row
		        String comment = testdata4.get(rownumber).get("comment");

		        // Add skill details using the retrieved data
		        comment(comment);
		        
		    }
		 
		 public void addfilesave() {
			bill.filebrowsersave.click(); 
		 }
		 
		
	}


