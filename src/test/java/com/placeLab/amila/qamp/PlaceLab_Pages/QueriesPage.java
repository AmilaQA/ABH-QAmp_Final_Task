package com.placeLab.amila.qamp.PlaceLab_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class QueriesPage extends PageLocators {

    private final WebDriver driver;
    private final WebDriverWait wait;

    public QueriesPage(final WebDriver webDriver) {
        this.driver = webDriver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }

    public void validateQueriesPageContent() {
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, SPS_EXPECTED_URL, "Verify dashboard traffic page successfully opened.");
        Assert.assertTrue(driver.findElement(SPS_NAV_BAR).isDisplayed(), "Verify if Navigation bar is visible.");
    }

    public void clickCreateReportToOpenDropdownMenu() {
        driver.findElement(SPS_DROPDOWN_MENU_CLICK).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(SPS_DROPDOWN_MENU_OPEN));
        Assert.assertTrue(driver.findElement(SPS_DROPDOWN_MENU_OPEN).isDisplayed(), "Verify dropdown menu opens");
        Assert.assertTrue(driver.findElement(CONTENT_CLASIFICATION).isDisplayed(), "Verify title Content Classification is visible in dropdown menu");
        wait.until(ExpectedConditions.visibilityOfElementLocated(DUPLICATE_DETECTION_DROP_FIELD));
        Assert.assertTrue(driver.findElement(DUPLICATE_DETECTION_DROP_FIELD).isDisplayed(), "Verify Duplicate Detection button is visible");
    }

    public void clickDuplicateDetectionFromDropdownMenu() {
        driver.findElement(DUPLICATE_DETECTION_BTN).click();
        String actualUrl1 = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl1, SPS_EXPECTED_URL_1, "Verify page for report creating successfully opened.");
    }

    public void validateReportPageContent() {
        String actualUrl2 = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl2, EXPECTED_URL_2, "Verify page for successfully created report opened.");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    public void verifyReportName(String reportId) {
        driver.get("https://demo.placelab.com/queries");
        String reportName = "//span[@id='working_on_request_" + reportId + "']";
        WebElement reportNameElement = driver.findElement(By.xpath(reportName));
        Assert.assertTrue(reportNameElement.isDisplayed());
        String actualReportName = reportNameElement.getText();
        Assert.assertEquals(actualReportName, "duplicate_detection_sample.txt");
    }

    public void openDuplicateDetectionReport(String reportId) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(18));
        String reportName = "//a[@id='request_" + reportId + "']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reportName)));
        WebElement reportNameElement = driver.findElement(By.xpath(reportName));
        wait.until(ExpectedConditions.elementToBeClickable(reportNameElement));
        reportNameElement.click();
    }

    public void deletePreviouslyCreatedDDReport(String reportId) {
        driver.get("https://demo.placelab.com/queries");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
        String reportName = "//a[@id='request_" + reportId + "']";
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(reportName)));

        //click on checkbox in front of report
        driver.findElement(By.xpath("//input[@value='" + reportId + "']/parent::div")).click();

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(TRASH_BIN_ICON));
        actions.perform();
        driver.findElement(TRASH_BIN_ICON).click();

        wait.until(ExpectedConditions.elementToBeClickable(POPUP_CONFIRM_BUTTON_DELETE));
        driver.findElement(CONFIRM_DELETE_LINK).click();
    }

    public void verifyMessageSuccessfulDeletedReport() {
        WebElement messageSuccessfulDeletedReport = driver.findElement(VERIFY_MESSAGE_DELETE_REPORT);
        Assert.assertTrue(messageSuccessfulDeletedReport.isDisplayed());
        String expectedMessage = "×\n" +
                "Successfully deleted selected queries";
        String actualMessage = messageSuccessfulDeletedReport.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}




