package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Options extends TestBase {
    @FindBy(xpath = "//yt-icon-button[@id='guide-button']")
    WebElement toggle;

    @FindBy(xpath = "//yt-formatted-string[text()='Trending']")
    WebElement trending;

    @FindBy(xpath = "//yt-formatted-string[text()='Shopping']")
    WebElement shopping;

    @FindBy(xpath = "//yt-formatted-string[text()='Music']")
    WebElement music;

    @FindBy(xpath = "//yt-formatted-string[text()='Movies']")
    WebElement movies;

    @FindBy(xpath = "//yt-formatted-string[text()='Live']")
    WebElement live;

    @FindBy(xpath = "//yt-formatted-string[text()='Gaming']")
    WebElement gaming;

    @FindBy(xpath = "//yt-formatted-string[text()='News']")
    WebElement news;

    @FindBy(xpath = "//yt-formatted-string[text()='Sports']")
    WebElement sports;

    public Options(){
        PageFactory.initElements(driver, this);
    }

    public void clickToggle() throws InterruptedException {
        this.toggle.click();
        Thread.sleep(2000);
    }

    public void clickTrending() throws InterruptedException {
        toggle.click();
        this.trending.click();
        Thread.sleep(2000);
    }

    public void clickShopping() throws InterruptedException {
        toggle.click();
        this.shopping.click();
        Thread.sleep(2000);
    }

    public void clickMovies() throws InterruptedException {
        toggle.click();
        this.movies.click();
        Thread.sleep(2000);
    }

    public void clickMusic() throws InterruptedException {
        toggle.click();
        this.music.click();
        Thread.sleep(2000);
    }

    public void clickNews() throws InterruptedException {
        toggle.click();
        this.news.click();
        Thread.sleep(2000);
    }

    public void clickLive() throws InterruptedException {
        toggle.click();
        this.live.click();
        Thread.sleep(2000);
    }

    public void clickGaming() throws InterruptedException {
        toggle.click();
        this.gaming.click();
        Thread.sleep(2000);
    }

    public void clickSports() throws InterruptedException {
        toggle.click();
        this.sports.click();
        Thread.sleep(2000);
    }
}
