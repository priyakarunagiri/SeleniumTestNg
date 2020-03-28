package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.WFLoginPage;
import com.crm.qa.pages.WFLoginPage2;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mohansankaran on 3/23/20.
 */
public class WFLoginPageTest extends TestBase {
    WFLoginPage wfloginPage;

    WFLoginPage2 wfLoginPage2;
    HomePage homePage;


    public WFLoginPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization("FF");
        wfloginPage = new WFLoginPage();
    }

       /*@Test(priority=1)
        public void loginPageTitleTest(){
            String title = wfloginPage.validateLoginPageTitle();
            Assert.assertEquals(title, "Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More");
        }

        @Test(priority=2)
        public void crmLogoImageTest(){
            boolean flag = wfloginPage.validateCRMImage();
            Assert.assertTrue(flag);
        }*/


    @Test(priority = 1)
    public void loginTest() throws InterruptedException {
        homePage = wfloginPage.login(prop.getProperty("username"), prop.getProperty("password"));

       // Thread.sleep(5000);

       // homePage = wfLoginPage2.login("rama","6666");

    }

    /*@Test(priority=1)
    public void loginTest() throws InterruptedException {
        WFLoginPage pc = new WFLoginPage(driver);
        pc.Signon(prop.getProperty("username"), prop.getProperty("password"));

        //Thread.sleep(5000);

        WFLoginPage2 pc1 = new WFLoginPage2(driver);
        pc1.Signon(prop.getProperty("username"), prop.getProperty("password"));



    }*/



   /* @Test(priority=4)
    public void loginTest1() throws InterruptedException {
        WFLoginPage2 pc = new WFLoginPage2(driver);
        pc.Signon(prop.getProperty("username"), prop.getProperty("password"));
    }*/


/*
        @Test(priority =5)

        public void ErrorMsg(){
            String msg = wfLoginPage2.validateErrorMsg();
            Assert.assertEquals(msg,"To protect your account, please enter the moving letters and/or numbers in the CAPTCHA, and re-enter your username and password to continue.");
        }
*/

    /*@AfterMethod
    public void tearDown(){
       driver.quit();
    }
*/

}


