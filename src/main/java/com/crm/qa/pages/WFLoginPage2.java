package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

/**
 * Created by mohansankaran on 3/23/20.
 */
public class WFLoginPage2 extends TestBase {


    @FindBy(xpath="//input[@name='j_username']")
    WebElement username;

    @FindBy(xpath="//input[@name='j_password']")
    WebElement password;

    @FindBy(xpath="//input[@type='submit']")
    WebElement loginBtn;


    @FindBy(css = "div[id=pageerrors].[class=alert]")
    WebElement ErrorMsg;

    public String validateErrorMsg(){
        return ErrorMsg.getText();

    }

    

    public HomePage login(String un, String pwd) {


        Actions action = new Actions(driver);
        WebElement sd =driver.findElement(By.name("j_username"));
        action.doubleClick(sd).perform();


        username.sendKeys(un);
        password.sendKeys(pwd);
        //loginBtn.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", loginBtn);

        return new HomePage();
    }

}
