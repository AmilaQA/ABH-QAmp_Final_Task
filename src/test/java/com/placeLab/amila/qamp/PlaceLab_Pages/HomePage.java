package com.placeLab.amila.qamp.PlaceLab_Pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends PageLocators {
    private final WebDriver driver;

    public HomePage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void validateUserRole(final String expectedUserRole) {
        final String actualUserRole = driver.findElement(USER_ROLE).getText();
        Assert.assertEquals(actualUserRole, expectedUserRole, "Validate user role is displayed.");
    }

    public void validateUserLoggedInHomePage() {
        // Verify successful login by checking the homepage/dashboard
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, EXPECTED_URL, "Login was successful.");
        Assert.assertTrue(driver.findElement(USER_NAME).isDisplayed(), "Verify if user name found.");
        Assert.assertTrue(driver.findElement(MAIN_CONTENT).isDisplayed(), "Verify if Report page visible.");
        Assert.assertTrue(driver.findElement(USER_DETAILS).isDisplayed(), "Verify if user name and user role found.");
    }

    public void clickSignOutButton() {
        //Verify if Sign out button is visible and active.
        driver.findElement(SIGN_OUT_LINK).click();
        Assert.assertTrue(driver.findElement(SIGN_OUT_LINK).isDisplayed(), "Verify if Sign out button is visible.");
        driver.findElement(SIGN_OUT_BTN).click();

    }
}
