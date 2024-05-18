package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends TestBase {

    @FindBy(xpath = "//div[@class='style-scope ytd-mini-guide-renderer']/ytd-mini-guide-entry-renderer[1]")
    WebElement home;

    @FindBy(xpath = "//div[@class='style-scope ytd-mini-guide-renderer']/ytd-mini-guide-entry-renderer[2]")
    WebElement shorts;

    @FindBy(xpath = "//div[@class='style-scope ytd-mini-guide-renderer']/ytd-mini-guide-entry-renderer[3]")
    WebElement subscribtions;

    @FindBy(xpath = "//div[@class='style-scope ytd-mini-guide-renderer']/ytd-mini-guide-entry-renderer[4]")
    WebElement you;

    @FindBy(xpath = "//div[@class='style-scope ytd-mini-guide-renderer']/ytd-mini-guide-entry-renderer[5]")
    WebElement history;

    public Home() {
        PageFactory.initElements(driver, this);
    }
    public void clickShorts() {
        this.shorts.click();
    }

    public void clickSubscribtions() {
        this.subscribtions.click();
    }

    public void clickYou() {
        this.you.click();
    }

    public void clickHistory() {
        this.history.click();
    }

    public void clickHome() {
        this.home.click();
    }
}
