package com.crm.qa.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

/**
 * Created by mohansankaran on 3/24/20.
 */
public class InsertAsset extends TestBase {





    /*public void SetDriver(){

     System.setProperty("webdriver.chrome.driver","/Users/mohansankaran/Documents/Project/PageObjectModel/driver/chromedriver");

     driver = new ChromeDriver();


   // driver.manage().window().maximize();

    driver.manage().deleteAllCookies();


    //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        System.setProperty("web.gecko.driver","/Users/mohansankaran/Documents/Project/PageObjectModel/driver/geckodriver");
        WebDriver driver  = new FirefoxDriver();

    }*/


    public void assertTest(){

        SoftAssert softassert = new SoftAssert();

        driver.get("https://www.wellsfargo.com");


        String searchText = "About Wells Fargo";
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"headerTools\"]"));
        List<WebElement> options = dropdown.findElements(By.tagName("li"));
        String[] a = new String[options.size()];

        int j=0;
        for(WebElement e:options){
            a[j] = e.getText();

            j++;
        }
        for (String t : a) {
            System.out.println(" The header link are:  " + t);
        }


        for (WebElement option : options)
        {
            softassert.assertEquals(option.getText(),searchText, "First soft assert failed ");
           // Assert.assertEquals(option.getText(),searchText, "First soft assert failed ");
            System.out.println("Soft assert success....");
            if (option.getText().equals(searchText))
        {
            option.click(); // click the desired option
        }
        }





        List<WebElement> alist = driver.findElements(By.xpath("//*[@id=\"pageFooter\"]"));
        String[] linkText = new String[alist.size()];
        int i=0;
        for(WebElement e:alist){
            linkText[i] = e.getText();
            i++;
        }

       String g= "About Wells Fargo";

        for(WebElement r : alist){
            if (r.getText().equals(g))
            {
                r.click(); // click the desired option
            }

        }


    }





    public void verifyTitle()
    {
        driver.get("https://www.wellsfargo.com");
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "Wells Fargo – Banking, Credit Cards, Loans, Mortgages & More";
        Assert.assertEquals(ActualTitle, ExpectedTitle);
        System.out.println("Assert Passed");
    }


}




