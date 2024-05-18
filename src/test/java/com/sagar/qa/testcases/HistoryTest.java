package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.History;
import com.sagar.qa.pages.Home;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners({com.sagar.qa.listeners.Listeners.class})
public class HistoryTest extends TestBase {
    public TestBase testBase= new TestBase();

    History history;

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        history=new History();
    }

    @Test
    public void clickClearHistory() throws InterruptedException {
        log.info("clear History method");
        history.clearHistory();
    }

    @Test
    public void pauseWatchHistory() throws InterruptedException {
        log.info("pause watch history");
        history.pauseWatchHistory();
    }

    @Test
    public  void clearAllSearchHistory() throws InterruptedException {
        log.info("clear all search history");
        history.clearSearchHistory();
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}
