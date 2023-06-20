
QAMP - Final Task

Assignment 2

2. Test specified module (Duplicate detection report) and create Regression Test Suite

A regression test suite is a collection of test cases that are specifically designed to verify that previously developed and tested functionality still works as expected after changes have been made to the software. The purpose of a regression test suite is to identify any unintended side effects or regressions introduced by new code changes, bug fixes, or system updates.

Regression testing is important because even small changes to the software can potentially introduce new bugs or impact existing functionality. By executing a set of pre-defined test cases from the regression test suite, software testers can ensure that critical functionality remains intact and unaffected by recent changes.

A regression test suite typically includes a selection of test cases that cover various aspects of the software's functionality, including both positive and negative test scenarios, boundary cases, and typical use cases. The test cases are designed to exercise different features and interactions within the software to identify any potential issues or regressions.

Overall, a regression test suite serves as a safety net to ensure that previously validated functionality remains stable and reliable throughout the software development process. It helps in maintaining the overall quality and integrity of the software and minimizes the risk of introducing new bugs or issues during the development or maintenance phase.

In this case new functionality has been added - Creating Duplicate detection report.
In Regression test suite these test cases are included and executed:
1. Verify successful login after implemented new functionality
2. Verify user is able to see in dropdown menu all previous functionalities (Hotspot Area Analysis, Single place search, Data Extraction report, Data Validation Report, Incident Aggregated Report) before adding this new one (Duplicate Detection).
3. Verify user is able to successfully create Single place search report
4. Verify user is able to successfully create Hotspot Area Analysis Report
5. Verify user is able to create new Incident Area
6. Verify user is able to create Incident Aggregated report for previously created Incident Area
7. Verify user is able to successfully create Data Extraction report

All test cases are written in Excell ("Regression test suite").
After testing all previously mentioned Test cases PlaceLab application worked properly and stable, and new functionality added (Duplicate detection) did not have any bad influence on main PlaceLab functionalities.

Regression testing is typically performed as part of the software testing lifecycle and can be automated using testing tools and frameworks. Automated regression testing allows for efficient and consistent execution of the test suite, enabling quicker identification of any regressions or issues introduced by changes in the software.
After any new implementation, fixing bugs or applying enhancements regression test should be runned to ensure that application under test works properly.

During regression testing one bug was found (Bug_001 in excell file "Regression test suite").