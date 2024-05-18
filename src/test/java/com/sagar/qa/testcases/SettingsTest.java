package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.Settings;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingsTest extends TestBase {
    public TestBase testBase= new TestBase();

    Settings settings;

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        settings = new Settings();
    }

    @Test
    public void yourData() throws InterruptedException {
        log.info("Clicking your data");
        settings.clickYourData();
    }

    @Test
    public void deviceTheme() throws InterruptedException {
        log.info("Clicking device themes");
        settings.clickDeviceTheme();
    }

    @Test
    public void language() throws InterruptedException {
        log.info("clicking language");
        settings.clickLanguage();
    }

    @Test
    public void location() throws InterruptedException {
        log.info("clicking location");
        settings.clickLocation();
    }

    @Test
    public void restrictMode() throws InterruptedException {
        log.info("clicking restrict mode");
        settings.clickRestrictMode();
    }

    @Test
    public void shortcuts() throws InterruptedException {
        log.info("clicking shortcuts");
        settings.clickShortcuts();
    }


    @AfterMethod
    public void close(){
        driver.close();
    }
}
