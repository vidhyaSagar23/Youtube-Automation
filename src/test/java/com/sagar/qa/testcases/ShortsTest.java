package com.sagar.qa.testcases;

import com.sagar.qa.base.TestBase;
import com.sagar.qa.pages.Shorts;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


//@Listeners({com.sagar.qa.listeners.Listeners.class})
public class ShortsTest extends TestBase {
    public TestBase testBase= new TestBase();

   public Shorts shorts;

    @BeforeMethod
    public void setUp() {
        testBase.initialization();
        shorts=new Shorts();
    }

    @Test
    public  void likeButton() throws InterruptedException {
        log.info("like button");
        shorts.likeBtn();
    }

    @Test
    public void dislikeButton() throws InterruptedException {
        log.info("Dislike button");
        shorts.disLikeButton();
    }

    @Test
    public void comments() throws InterruptedException {
        log.info("Comments method");
        shorts.comment();
    }

    @Test
    public void share() throws InterruptedException {
        log.info("Share method");
        shorts.shareVideo();
    }

    @AfterMethod
    public void close(){
        driver.close();
    }
}
