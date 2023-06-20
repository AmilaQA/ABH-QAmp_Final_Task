package com.placeLab.amila.qamp.PlaceLab_Pages;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class DuplicateDetectionReportPage extends PageLocators {
    private final WebDriver driver;

    public DuplicateDetectionReportPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void validateDuplicateDetectionPageOpened() {
        Assert.assertTrue(driver.findElement(DD_REPORT_PAGE_HEADER).isDisplayed(), "Verify created report page header is visible");
        Assert.assertTrue(driver.findElement(CLUSTER_MAP).isDisplayed(), "Verify cluster map is visible");
    }

    public void returnToQueriesPage() {
        driver.findElement(REPORT_FIELD).click();
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, EXPECTED_URL_2, "Verify Queries page successfully opened.");
        Assert.assertTrue(driver.findElement(SPS_NAV_BAR).isDisplayed(), "Verify if Navigation bar is visible.");
    }
}
