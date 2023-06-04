
QAMP - Final Task

Assignment Definition:

App Under Test: https://demo.placelab.com/

API Testing:

1. Define an API Smoke Test for specified module using Postman

Postman is an API development and testing tool that provides a user-friendly interface for making HTTP requests to APIs and testing their responses. 

SMOKE TEST for PlaceLab module Content Classification - Duplicate Detection

1. To start smoke API test first user needs to obtain authentication token by running POST request to specified API endpoint from documentation provided on next url link https://demo.placelab.com/help/content_classification#duplicate_detection_creating_report_via_api.
2. Url for Duplicate Detection page is accessible;
3. Create new Duplicate Detection report;
4. Retrieve status code for previously created Duplicate Detection report;
5. Download previously created Duplicate Detection report;
6. Download some old Duplicate Detection report (By report ID);

Given:

An API endpoint for PlaceLab Duplicate Detection is available.

Postman collection and environment are created.

When:

1. Send a request to the PlaceLab API to retrieve valid token that is going to be used for further actions - POST request (user needs to obtain in request body variable for valid email and password that are added in Placelab environment).
2. Send a request to create a new Duplicate Detection in the PlaceLab API - POST request (user needs to provide in body request form-data: key (File) and value (upload - duplicate_detection_sample.txt)).
3. Send a request to download previously created Duplicate Detection report - GET request (by providing variable Report ID from Placelab environment).
4. Send a request to download a specific Duplicate Detection report (some old report) that was already created - GET request (by providing specific Report ID from Placelab Queries page).

Then:

Verify that the response for token is successful (200 status code).
Verify that the response for creating a new Duplicate Detection report is successful (201 status code) and the response has state CREATED.
Verify that the response for retrieving status code is successful (200 status code) and the response has property state vith value RUNING (Report is beeing processed by Placelab).
Verify status code 409 for download report that was just created in POST request because it can not be downloaded while creating Duplicate Detection report is not finished, it takes cca 11 min and after that it can be downloaded.
Verify status code 200 for successfully downloaded Duplicate Detection report (download by Report ID) that was already created. Validate response body is not empty and it contains text from downloaded Duplicate Detection report.

Important to know is that in this repo foder is Postman collection for API smoke test Duplicate detection, Postman Environment with all variables that are going to be used for executing the tests, report with results after test were runned in three iterations thrue Postman and picture of duration and average response time. 
Data for email and password were deleted from the environment collection in order to protect the data, so it is necessary to enter the same later so that tests could be executed.