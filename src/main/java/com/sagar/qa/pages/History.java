package com.sagar.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.sagar.qa.base.TestBase.driver;


public class History {

    @FindBy(xpath = "//div[@class='style-scope ytd-mini-guide-renderer']/ytd-mini-guide-entry-renderer[5]")
    WebElement history;

    @FindBy(xpath = "//div[@id='contents' and @class='style-scope ytd-browse-feed-actions-renderer']/ytd-button-renderer[1]")
    WebElement clearHistory;

    @FindBy(xpath = "//div[@id='contents' and @class='style-scope ytd-browse-feed-actions-renderer']/ytd-button-renderer[2]")
    WebElement pauseWatchHistory;

    @FindBy(xpath = "//div[@id='contents' and @class='style-scope ytd-browse-feed-actions-renderer']/ytd-button-renderer[3]")
    WebElement clearWatchHistory;

    @FindBy(xpath = "//div[@id='contents' and @class='style-scope ytd-browse-feed-actions-renderer']/ytd-button-renderer[4]")
    WebElement pauseSearchHistory;

    public History(){
        PageFactory.initElements(driver, this);
    }

    public void clearHistory() throws InterruptedException {
        this.history.click();
        Thread.sleep(2000);
        this.clearHistory.click();
    }

    public void pauseWatchHistory() throws InterruptedException {
        this.history.click();
        Thread.sleep(2000);
        this.pauseWatchHistory.click();
    }

    public void clearSearchHistory() throws InterruptedException {
        this.history.click();
        Thread.sleep(2000);
        this.clearHistory.click();
    }
}
