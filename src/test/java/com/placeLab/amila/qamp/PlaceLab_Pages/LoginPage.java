package com.placeLab.amila.qamp.PlaceLab_Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends PageLocators {
    private final WebDriver driver;

    public LoginPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void validateLoginPageContent() {
        final String actualPageTitle = driver.getTitle();

        Assert.assertEquals(actualPageTitle, EXPECTED_PAGE_TITLE, "Validate page title is correct");
        Assert.assertTrue(driver.findElement(LOGIN_PAGE).isDisplayed(), "Login page visible.");
        final boolean isHeaderDisplayed = driver.findElement(LOGIN_HEADER).isDisplayed();
        final boolean isLoginFormDisplayed = driver.findElement(LOGIN_FORM).isDisplayed();
        Assert.assertTrue(isLoginFormDisplayed, "Validate login form is displayed");
        Assert.assertTrue(isHeaderDisplayed, "Validate header is displayed");
    }

    public void enterCredentials(final String email, final String password) {
        driver.findElement(EMAIL_INPUT).sendKeys(email);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
    }

    public void clickLoginSubmitButton() {
        driver.findElement(LOGIN_SUBMIT_BTN).click();
    }
}


