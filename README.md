
QAMP - Final Task

Documentation about how Automation was performed and how to run Automation tests

First was done manual smoke test and created test cases to verify if user can successfully create, open and delete Duplicate detection report. After that, automation of those test cases (excell file "Smoke test DDR report - manual" in folder "Smoke test - manual Duplicate detection) was performed. 

Automation testing is the process of using software tools to execute tests automatically, reducing manual effort and increasing test efficiency. In this project, we have automated the test cases for the Duplicate Detection Report feature of the PlaceLab application.

The Automation tests are implemented using:
- Java as programming language that is used for writing test scripts and interacting with testing frameworks and tools. Java offers a rich set of libraries and frameworks that simplify automation testing tasks;
- IntelliJ as Environment - IntelliJ IDEA is an Integrated Development Environment (IDE) specifically designed for Java development.IntelliJ offers advanced support for automation testing frameworks like TestNG and Selenium;
- Selenium and TestNG as automation testing frameworks:
    - TestNG provides annotations and assertions to define test cases and expected results,
    - Selenium popular open-source framework used for automating web browsers. It provides a set of tools and libraries that enable     software testers and developers to automate browser interactions and perform functional testing of web applications.
- Maven as build automation and project management tool for Java-based projects. It simplifies the project setup, dependency management, and build processes. 

Before running the automated tests, ensure that you have all previously mentioned prerequisites installed on your system.

To set up the project and install the required dependencies these steps should be executed:
1. Clone repository (git clone https://github.com/AmilaQA/ABH-QAmp_Final_Task.git);
2. Open the project in IntelliJ IDEA
3. Import the project as Maven project;
4. Maven will automatically download the required dependencies in the "pom.xml" file.

Parameters like email, password, browser, rootFilePath and report name that were used thrue automation testing are forwarded via testNg parameters (Edit configuration - parameters). User needs to make configuration for testNG parameters previously mentioned. The steps for doing this are:

1. On customize bar click on testNG icon to open dropdown menu;
2. Click on "Edit configuration" to open "Run/Debug Configurations" window;
3. Click on "+" to open dropdown menu with all automation testing frameworks and select testNG to open testNG configurations window;
3. Click on "..." after "Class" to add "com.placeLab.amila.qamp.PlaceLab_Tests.smokeTestSuccessfullyCreateReportDD";
4. In name field enter the name for test that is going to be runned;
5. Click on parameters to open Parameters input fields;
6. Enter all names and values previously mentioned parameters.
7. Click on "OK" button.


These are the steps to run the automated tests:
1. Navigate to test case for smoke testing in "package com.placeLab.amila.qamp.PlaceLab_Tests" path to find test case "testSuccessfulCreateDuplicateDetectionReport";
2. Right-click on the class select "Run" to execute the tests.
3. The test execution results will be displayed in the test runner window, indicating the success or failure of each test case.

Important to know that user needs to wait aproximately 11-17 minutes so this test would be finished and report should be successfully created, opened and deleted. Opening and deletion of previously created report is done by useing reportID that is unique for every created report.