package utility;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.StepDefinitionOfWebsite;

 
public class HelperClass {
	private static HelperClass helperClass;
	public static JavascriptExecutor jse;
	public static WebDriver driver;
	public static Logger log = null;
	public static Actions action=null;
	public static WebDriverWait wait =null;
	public static final int TIMEOUT = 20;
	  HelperClass(String browser){
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			driver = new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("edge")) {
			EdgeOptions options = new EdgeOptions();
			driver = new EdgeDriver(options);
		}else if(browser.equalsIgnoreCase("firefox")) {
			FirefoxOptions options = new FirefoxOptions();
			driver= new FirefoxDriver(options);
		}
		action = new Actions(driver);
		jse = (JavascriptExecutor)driver;
		log = LogManager.getLogger(StepDefinitionOfWebsite.class);
		wait= new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));	
		
	
	}
	public static void OpenPage(String url) {
			driver.get(url);
	}
	public static WebDriver getDriver() {
		return driver;
	}
	public static void setUpDriver(String browser) {
		if(helperClass==null) {
			helperClass=new HelperClass(browser);
			log.info("Driver setUp Successfully");
		}
	}
	public static void tearDown() {
		if(driver!=null) {
			driver.close();
			driver.quit();
			log.info("Driver closed Successfully");
		}
		helperClass=null;
	}
 
	
}