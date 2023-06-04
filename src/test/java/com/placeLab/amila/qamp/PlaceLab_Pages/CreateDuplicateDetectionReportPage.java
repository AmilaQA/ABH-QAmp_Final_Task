package com.placeLab.amila.qamp.PlaceLab_Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class CreateDuplicateDetectionReportPage extends PageLocators {
    private WebDriver driver;

    public CreateDuplicateDetectionReportPage(final WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void validateCreateDuplicateDetectionReportPageContent() {
        Assert.assertTrue(driver.findElement(DD_CREATE_REP_BTN_DISABLED).isDisplayed(), "Verify create report button is not active");
        Assert.assertTrue(driver.findElement(HEADER_CREATE_DD_REPORT).isDisplayed(), "Verify Header - Create Duplicate Detection Report - header is visible");
        Assert.assertTrue(driver.findElement(REPORT_NAME_INPUT_FIELD).isDisplayed(), "Verify enter report name field - AUTOCOMPLETE FIELD is visible");
        Assert.assertTrue(driver.findElement(SAMPLE_FILE_BTN).isDisplayed(), "Verify sample file button is visible");
        Assert.assertTrue(driver.findElement(BROWSE_BTN).isDisplayed(), "Verify browse button is displayed");
        Assert.assertTrue(driver.findElement(SHOW_ADVANCED_OPTIONS).isDisplayed(), "Verify show advanced options field text is visible");
        Assert.assertTrue(driver.findElement(FILE_SIZE).isDisplayed(), "Verify File size is displayed");
        Assert.assertTrue(driver.findElement(NO_OF_RECORDS).isDisplayed(), "Verify number of records in circle is displayed");
    }

    public void clickOnSampleFile() {
        driver.findElement(SAMPLE_FILE_BTN).click();
    }

    public void uploadFile(String rootFilePath) {
        // driver.findElement(BROWSE_BTN).click();
        String filePath = rootFilePath + "/src/test/java/resources/duplicate_detection_sample.txt";

        // Locate the file input element
        WebElement fileInput = driver.findElement(FILE_INPUT);

        fileInput.sendKeys(filePath);
        WebDriverWait waitForAutocompleteLocation = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertTrue(driver.findElement(REPORT_NAME_INPUT_FIELD).isDisplayed(), "Verify enter report name field");
    }

    public void validateStatusBrowseCompleted() {
        String expectedText = "Completed";
        By selector = By.cssSelector("span#file-status[class='status-completed']:contains('" + expectedText + "')");
        Assert.assertTrue(driver.findElement(STATUS_UPLOAD_BAR).isDisplayed(), "Validate green status bar for upload is visible");
    }

    public void verifyReportNameAutocompleted() {
        Assert.assertTrue(driver.findElement(REPORT_NAME_INPUT_FIELD).isDisplayed(), "Verify Report name after upload file is populated by autocomplete option");
    }

    public void clickShowAdvancedOptions() {
        driver.findElement(SHOW_ADVANCED_OPTIONS).click();
    }

    public void validateAllParametersSelected() {
        Assert.assertTrue(driver.findElement(SELECTED_ALL_PARAMS).isDisplayed(), "Verify Selected all is active");

        WebElement labelElement = driver.findElement(NAME_FIELD);
        WebElement checkboxElement = labelElement.findElement(By.tagName("input"));
        Assert.assertTrue(checkboxElement.isSelected(), "Verify Name field is selected");
        Assert.assertTrue(labelElement.isDisplayed(), "Verify Name field is visible");

        WebElement labelElement2 = driver.findElement(LATITUDE_LONGITUDE);
        WebElement checkboxElement2 = labelElement.findElement(By.tagName("input"));
        Assert.assertTrue(checkboxElement2.isSelected(), "Verify Latitude/Longitude field is selected");
        Assert.assertTrue(labelElement2.isDisplayed(), "Verify Latitude/Longitude field is visible");

        WebElement labelElement3 = driver.findElement(COUNTRY);
        WebElement checkboxElement3 = labelElement.findElement(By.tagName("input"));
        Assert.assertTrue(checkboxElement3.isSelected(), "Verify Country field is checked");
        Assert.assertTrue(labelElement3.isDisplayed(), "Verify Country field is visible");

        WebElement labelElement4 = driver.findElement(CITY);
        WebElement checkboxElement4 = labelElement.findElement(By.tagName("input"));
        Assert.assertTrue(checkboxElement4.isSelected(), "Verify City field is checked");
        Assert.assertTrue(labelElement4.isDisplayed(), "Verify City field is visible");

        WebElement labelElement5 = driver.findElement(STREET);
        WebElement checkboxElement5 = labelElement.findElement(By.tagName("input"));
        Assert.assertTrue(checkboxElement5.isSelected(), "Verify Street field is checked");
        Assert.assertTrue(labelElement5.isDisplayed(), "Verify Street field is visible");

        WebElement labelElement6 = driver.findElement(MAX_DISTANCE);
        WebElement checkboxElement6 = labelElement.findElement(By.tagName("input"));
        Assert.assertTrue(checkboxElement6.isSelected(), "Verify Max. distance between two points field is checked");
        Assert.assertTrue(labelElement6.isDisplayed(), "Verify Max. distance between two points field is visible");

        Assert.assertTrue(driver.findElement(INFO_MESSAGE_DISTANCE).isDisplayed(), "Verify info message \"Distance should be set between 1 and 10,000 m.\" is displayed");
    }

    public String clickCreateDDReportButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(CREATE_REPORT_BTN).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String url = driver.getCurrentUrl();
        wait.until(ExpectedConditions.visibilityOfElementLocated(REPORT_PAGE));
        return url.substring(url.lastIndexOf('/') + 1);
    }
}