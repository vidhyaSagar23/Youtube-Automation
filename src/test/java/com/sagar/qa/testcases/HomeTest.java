package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.Home;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners({com.sagar.qa.listeners.Listeners.class})
public class HomeTest extends TestBase {
    public TestBase testBase= new TestBase();

    Home home;

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        home=new Home();
    }

    @Test
    public void clickShorts(){
        log.info("clicking shorts");
        home.clickShorts();
    }

    @Test
    public void clickSubscriptions(){
        log.info("clicking subscritions");
        home.clickSubscribtions();
    }

    @Test
    public void clickYou(){
        log.info("clicking you");
        home.clickYou();
    }

    @Test
    public void clickHistory(){
        log.info("clicking history");
        home.clickHistory();
    }

    @Test
    public void clickHome(){
        log.info("clicking home");
        home.clickHome();
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}
