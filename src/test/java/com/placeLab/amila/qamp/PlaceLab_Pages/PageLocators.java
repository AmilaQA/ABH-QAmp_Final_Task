package com.placeLab.amila.qamp.PlaceLab_Pages;

import org.openqa.selenium.By;

public class PageLocators {

    //Login Page locators
    final static By LOGIN_HEADER = By.cssSelector("#login > img");
    final static By LOGIN_FORM = By.cssSelector("#login_form");
    final static By LOGIN_PAGE = By.id("login");
    final static String EXPECTED_PAGE_TITLE = "PlaceLab";
    final static By EMAIL_INPUT = By.id("email");
    final static By PASSWORD_INPUT = By.id("password");
    final static By LOGIN_SUBMIT_BTN = By.xpath("//input[@type='submit']");

    //Home Page locators
    final static By USER_ROLE = By.id("user-role");
    final static String EXPECTED_URL = "https://demo.placelab.com/dashboard/traffic";
    final static By MAIN_CONTENT = By.className("main-content");
    final static By USER_NAME = By.className("main-content");
    final static By USER_DETAILS = By.cssSelector("[data-title='Amila Gicic (QAmp2023/Group admin)']");
    final static By SIGN_OUT_BTN = By.linkText("Sign out");
    final static By SIGN_OUT_LINK = By.cssSelector("#user-name > i");

    // Create Duplicate detection report page locators
    final static By REPORT_PAGE = By.cssSelector("#action-navbar > h2");
    final static By DD_CREATE_REP_BTN_DISABLED = By.cssSelector("#selects_container > button");
    final static By HEADER_CREATE_DD_REPORT = By.cssSelector("#dd_container > div.create-report-header");
    final static By REPORT_NAME_INPUT_FIELD = By.cssSelector("#upload_query_name");
    final static By SAMPLE_FILE_BTN = By.cssSelector("#newDropzonePreview > div.dz-default.dz-message > span > label > a");
    final static By BROWSE_BTN = By.cssSelector("#newDropzonePreview > div.dz-default.dz-message > span > span.btn.fileinput-button.dropzone-browse-btn.plab-fill-btn");
    final static By SHOW_ADVANCED_OPTIONS = By.xpath("//a[contains(text(), 'Show advanced options')]");
    final static By FILE_SIZE = By.xpath("//*[@id=\"file_size\"]/label");
    final static By NO_OF_RECORDS = By.xpath("//*[@id=\"file_size_in_lines\"]");
    final static By FILE_INPUT = By.id("duplicate-browse-btn");
    final static By STATUS_UPLOAD_BAR = By.xpath("//*[@id=\"newDropzonePreview\"]/div[3]/div/div[3]/div[2]");
    final static By SELECTED_ALL_PARAMS = By.cssSelector("#options > div.relevant-columns-container.hideme > div:nth-child(1) > span.select-all-columns.selected");
    final static By NAME_FIELD = By.cssSelector("label.column-checkbox.column-checkbox-name.icheck-label");
    final static By LATITUDE_LONGITUDE = By.cssSelector("label.column-checkbox.column-checkbox-latitude-longitude.icheck-label");
    final static By COUNTRY = By.cssSelector("label.column-checkbox.column-checkbox-country.icheck-label");
    final static By CITY = By.cssSelector("label.column-checkbox.column-checkbox-city.icheck-label");
    final static By STREET = By.cssSelector("label.column-checkbox.column-checkbox-street.icheck-label");
    final static By MAX_DISTANCE = By.cssSelector("label.max-distance-epsilon.icheck-label");
    final static By INFO_MESSAGE_DISTANCE = By.xpath("//span[contains(text(), 'Distance should be set between 1 and 10,000 m.')]");
    final static By CREATE_REPORT_BTN = By.cssSelector("#selects_container > button");

    //Queries Page locators
    final static String SPS_EXPECTED_URL = "https://demo.placelab.com/dashboard/traffic";
    final static String SPS_EXPECTED_URL_1 = "https://demo.placelab.com/content_classification/duplicate_detections/new";
    final static String EXPECTED_URL_2 = "https://demo.placelab.com/queries";
    final static By SPS_DROPDOWN_MENU_CLICK = By.xpath("//*[@id=\"create-menu\"]/i");
    final static By SPS_DROPDOWN_MENU_OPEN = By.xpath("/html/body/div[2]/div[2]");
    final static By SPS_NAV_BAR = By.xpath("/html/body/div[2]");
    final static By POPUP_CONFIRM_BUTTON_DELETE = By.id("confirm-link");
    final static By TRASH_BIN_ICON = By.xpath("//*[@id=\"action-delete\"]/a/i");
    final static By CONFIRM_DELETE_LINK = By.xpath("//*[@id=\"confirm-link\"]");
    final static By VERIFY_MESSAGE_DELETE_REPORT = By.id("alert-place");
    final static By CONTENT_CLASIFICATION = By.xpath("/html/body/div[2]/div[2]/div/div[5]/h6");
    final static By DUPLICATE_DETECTION_DROP_FIELD = By.xpath("//li[@id='duplicatedetection']/a[contains(@class, 'query')]");
    final static By DUPLICATE_DETECTION_BTN = By.cssSelector("#duplicatedetection > a");
    final static String EXPECTED_URL_3 = "https://demo.placelab.com/content_classification/duplicate_detections/";

    //Duplicate detection report page locators
    final static By DD_REPORT_PAGE_HEADER = By.cssSelector("#page-title-id");
    final static By CLUSTER_MAP = By.cssSelector("#content_classification_cluster_map");
    final static By REPORT_FIELD = By.cssSelector("#queries-nav-item > a");
}
