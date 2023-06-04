package com.placeLab.amila.qamp.PlaceLab_Tests;

import com.placeLab.amila.qamp.PlaceLab_Pages.*;
import com.placeLab.amila.qamp.utils.WebDriverSetup;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class smokeTestSuccessfullyCreateReportDD {
    private WebDriver driver;
    private LoginPage loginPage;
    private HomePage homePage;
    private QueriesPage queriesPage;
    private CreateDuplicateDetectionReportPage createDuplicateDetectionReportPage;
    private DuplicateDetectionReportPage duplicateDetectionReportPage;

    @Parameters({"browser", "email", "password"})
    @BeforeTest
    public void setup(String browser, String email, String password) {
        driver = WebDriverSetup.getWebDriver(browser);
        driver.get(" https://demo.placelab.com/");
        System.out.println("Opened browser: " + browser);

        this.loginPage = new LoginPage(driver);
        loginPage.validateLoginPageContent();
        loginPage.enterCredentials(email, password);
        loginPage.clickLoginSubmitButton();

        this.homePage = new HomePage(driver);
        homePage.validateUserLoggedInHomePage();

        this.queriesPage = new QueriesPage(driver);
        this.createDuplicateDetectionReportPage = new CreateDuplicateDetectionReportPage(driver);
        this.duplicateDetectionReportPage = new DuplicateDetectionReportPage(driver);
    }

    @Parameters({"reportName", "rootFilePath"})
    @Test(priority = 1, description = "Verify user is able to successfully create, open and delete previously Duplicate Detection report",
            testName = "TC 01 Successful Create Duplicate Detection report using upload file option, open it, and delete it")
    public void testSuccessfulCreateDuplicateDetectionReport(String reportName, String rootFilePath) {

        queriesPage.validateQueriesPageContent();
        queriesPage.clickCreateReportToOpenDropdownMenu();
        queriesPage.clickDuplicateDetectionFromDropdownMenu();

        createDuplicateDetectionReportPage.validateCreateDuplicateDetectionReportPageContent();
        createDuplicateDetectionReportPage.clickOnSampleFile();
        createDuplicateDetectionReportPage.uploadFile(rootFilePath);
        createDuplicateDetectionReportPage.validateStatusBrowseCompleted();
        createDuplicateDetectionReportPage.verifyReportNameAutocompleted();
        createDuplicateDetectionReportPage.clickShowAdvancedOptions();
        createDuplicateDetectionReportPage.validateAllParametersSelected();
        String reportId = createDuplicateDetectionReportPage.clickCreateDDReportButton();

        queriesPage.validateReportPageContent();
        queriesPage.verifyReportName(reportId);
        queriesPage.openDuplicateDetectionReport(reportId);

        duplicateDetectionReportPage.validateDuplicateDetectionPageOpened();
        duplicateDetectionReportPage.returnToQueriesPage();

        queriesPage.deletePreviouslyCreatedDDReport(reportId);
        queriesPage.verifyMessageSuccessfulDeletedReport();
    }

    @AfterTest
    public void tearDown() {
        driver.close();
        driver.quit();
    }
}