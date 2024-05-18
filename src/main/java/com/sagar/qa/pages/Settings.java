package com.sagar.qa.pages;

import com.sagar.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Settings extends TestBase {

    @FindBy(xpath = "//yt-icon-button[@id='button']")
    WebElement settingsBtn;

    @FindBy(xpath = "//yt-formatted-string[text()='Your data in YouTube']")
    WebElement yourData;

    @FindBy(xpath = "//div[text()='Appearance: Device theme']")
    WebElement deviceTheme;

    @FindBy(xpath = "//yt-formatted-string[@id='label' and text()='Language:']")
    WebElement language;

    @FindBy(xpath = "//yt-formatted-string[@id='label' and text()='Restricted Mode: Off']")
    WebElement restrictMode;

    @FindBy(xpath = "//yt-formatted-string[@id='subtitle' and text()='India']")
    WebElement location;

    @FindBy(xpath = "//yt-formatted-string[@id='label' and text()='Keyboard shortcuts']")
    WebElement shortCuts;
    public Settings(){
        PageFactory.initElements(driver, this);
    }

    public void clickYourData() throws InterruptedException {
        this.settingsBtn.click();
        this.yourData.click();
        Thread.sleep(2000);
    }

    public void clickDeviceTheme() throws InterruptedException {
        this.settingsBtn.click();
        this.deviceTheme.click();
        Thread.sleep(2000);
    }

    public void clickLanguage() throws InterruptedException {
        this.settingsBtn.click();
        this.language.click();
        Thread.sleep(2000);
    }

    public void clickLocation() throws InterruptedException {
        this.settingsBtn.click();
        this.location.click();
        Thread.sleep(2000);
    }

    public void clickRestrictMode() throws InterruptedException {
        this.settingsBtn.click();
        this.restrictMode.click();
        Thread.sleep(2000);
    }

    public void clickShortcuts() throws InterruptedException {
        this.settingsBtn.click();
        this.shortCuts.click();
        Thread.sleep(2000);
    }
}
