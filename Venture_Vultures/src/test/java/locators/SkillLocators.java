package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SkillLocators {
	 // Locator for the "Admin" element
    @FindBy(xpath = "//span[text()='Admin']")
    public WebElement Admin;

    // Locator for the "Qualification" element in the top navigation bar
    @FindBy(xpath = "//nav[@class='oxd-topbar-body-nav']//child::li[@class='oxd-topbar-body-nav-tab --parent'][3]//child::span[@class='oxd-topbar-body-nav-tab-item']")
    public WebElement qulification;

    // Locator for the "Skill" element
    @FindBy(xpath = "//ul[@class='oxd-dropdown-menu']//li[1]")
    public WebElement skill;

    // Locator for the "Add Skill" button
    @FindBy(xpath = "(//button[@type='button'])[3]")
    public WebElement addskillbutton;

    // Locator for the input field to add skill name
    @FindBy(xpath = "//div[@class='oxd-input-group__label-wrapper']//following-sibling::div//child::input[@class='oxd-input oxd-input--active']")
    public WebElement addskillname;

    // Locator for the input field to add skill description
    @FindBy(xpath = "//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")
    public WebElement addskilldescription;

    // Locator for the "Save Skill" button
    @FindBy(xpath = "//button[contains(@class,'oxd-button oxd-button--medium')]/following-sibling::button[1]")
    public WebElement skillsavebutton;

    // Locator for the header asserting the skill section
    @FindBy(xpath ="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-level']")
    public WebElement AdSort;


}
