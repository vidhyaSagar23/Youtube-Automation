package com.sagar.qa.base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {
    public Logger log = Logger.getLogger(TestBase.class);
    public ExtentReports extent = new ExtentReports();
    public ExtentSparkReporter spark= new ExtentSparkReporter("test-output/ExtentReport.html");

    public static WebDriver driver;
    public static Properties props;

    public TestBase() {
        try {
            props = new Properties();
            FileInputStream f=new FileInputStream("C:\\Users\\sagar\\Desktop\\SELENIUM TESTING\\App_Page_object_model\\src\\main\\java\\com\\sagar\\qa\\config\\config.properties");
            props.load(f);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void initialization() {
        log.info("Brower Name :" + props.getProperty("browser"));
        String browserName = props.getProperty("browser");
        if(browserName.equals("chrome")) {
            driver=new ChromeDriver();
        }
        log.info("Application URL : "+props.getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.get(props.getProperty("url"));
    }

    public void close(){
        driver.close();
    }
}
