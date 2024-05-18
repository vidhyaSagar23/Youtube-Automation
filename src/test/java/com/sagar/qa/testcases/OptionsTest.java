package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.Options;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//@Listeners({com.sagar.qa.listeners.Listeners.class})
public class OptionsTest extends TestBase {
    public TestBase testBase= new TestBase();

    Options options;

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        options=new Options();
    }

    @Test
    public void toggle() throws InterruptedException {
        log.info("clicking toggle button");
        options.clickToggle();
    }

    @Test
    public void trending() throws InterruptedException {
        log.info("clicking trending");
        options.clickTrending();
    }

    @Test
    public void shopping() throws InterruptedException {
        log.info("clicking shopping");
        options.clickShopping();
    }

    @Test
    public void movies() throws InterruptedException {
        log.info("clicking movies");
        options.clickMovies();
    }

    @Test
    public void music() throws InterruptedException {
        log.info("clicking music");
        options.clickMusic();
    }

    @Test
    public void news() throws InterruptedException {
        log.info("clicking news");
        options.clickNews();
    }

    @Test
    public void live() throws InterruptedException {
        log.info("clicking live");
        options.clickLive();
    }

    @Test
    public void gaming() throws InterruptedException {
        log.info("click gaming");
        options.clickGaming();
    }

    @Test
    public void sports() throws InterruptedException {
        log.info("click sports");
        options.clickSports();
    }
    @AfterMethod
    public void close(){
        driver.close();
    }
}
