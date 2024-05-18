package com.sagar.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import static com.sagar.qa.base.TestBase.driver;

public class TestUtil {

    public  void failedTest(String FTname) throws IOException {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File SFile = ts.getScreenshotAs(OutputType.FILE);
        File DFile = new File(".\\YT_Screenshots\\"+ FTname + ".png");
        FileHandler.copy(SFile, DFile);
    }
}
