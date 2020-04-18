package com.crm.qa.testcases;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.InsertAsset;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by mohansankaran on 3/24/20.
 */
public class InsertAssetTest extends TestBase {

    InsertAsset insertAsset;

    public InsertAssetTest() {
        super();
    }

    @BeforeMethod
    public void SetUp() {
        initialization("chrome");
        insertAsset = new InsertAsset();
    }

    @Test (priority = 2)
    public void verifyTitleTest(){

        insertAsset.verifyTitle();
        System.out.println("verified!!!!!");

    }

    @Test(priority = 1)
    public void verifyHeaderAndFooterTest(){

        insertAsset.assertTest();
        System.out.println("verified2!!!!!");
    }

/*Closing the browser*/
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}

