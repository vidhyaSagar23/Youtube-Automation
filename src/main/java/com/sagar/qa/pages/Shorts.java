package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shorts extends TestBase {

    @FindBy(xpath = "//div[@class='style-scope ytd-mini-guide-renderer']/ytd-mini-guide-entry-renderer[2]")
    WebElement shorts;

    @FindBy(xpath = "//div[@id='like-button']/ytd-like-button-renderer/ytd-toggle-button-renderer[1]")
    WebElement like;

    @FindBy(xpath = "//div[@id='like-button']/ytd-like-button-renderer/ytd-toggle-button-renderer[2]")
    WebElement dislike;

    @FindBy(xpath = "//div[@ID='comments-button']")
    WebElement comments;

    @FindBy(xpath = "//div[@ID='share-button']")
    WebElement share;

    public Shorts(){
        PageFactory.initElements(driver, this);
    }

    public void likeBtn() throws InterruptedException {
        this.shorts.click();
        Thread.sleep(2000);
        this.like.click();
        Thread.sleep(2000);
    }

    public void disLikeButton() throws InterruptedException {
        this.shorts.click();
        Thread.sleep(2000);
        this.dislike.click();
        Thread.sleep(2000);
    }

    public void comment() throws InterruptedException {
        this.shorts.click();
        Thread.sleep(2000);
        this.comments.click();
        Thread.sleep(2000);
    }

    public void shareVideo() throws InterruptedException {
        this.shorts.click();
        Thread.sleep(2000);
        this.share.click();
        Thread.sleep(2000);
    }
}
