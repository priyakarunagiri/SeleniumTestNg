package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by mohansankaran on 3/23/20.
 */
public class WFLoginPage extends TestBase {

    public WFLoginPage(WebDriver driver) {

        this.driver = driver;
    }

    WebDriverWait wait=new WebDriverWait(driver, 20);

    //Page Factory - OR:
    @FindBy(name="j_username")
    WebElement username;

    @FindBy(name="j_password")
    WebElement password;

    @FindBy(xpath="//input[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath="//button[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath="//img[contains(@alt,'Wells Fargo Home Page')]")
    WebElement crmLogo;





            //Initializing the Page Objects:
    public WFLoginPage(){
        PageFactory.initElements(driver, this);
    }

    //Actions:
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public boolean validateCRMImage(){
        return crmLogo.isDisplayed();
    }

   public HomePage login(String un, String pwd) {
        username.sendKeys(un);
        password.sendKeys(pwd);
        //loginBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);

        return new HomePage();
    }
}
