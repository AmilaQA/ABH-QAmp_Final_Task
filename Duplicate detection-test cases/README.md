
QAMP - Final Task

Assignment 2

2. Test specified module (Duplicate detection) and create Regression Test Suite
3. Create a report for any bugs/improvements found

Manual functional testing involves testers interacting with the software as end-users to validate its behavior. Functional testing involves testing the individual functions and features of the software to ensure that they work correctly and meet the intended functionality.

The goal of functional testing is to validate whether the software behaves as expected and delivers the desired functionality to the end-users. 

While testing this Duplicate Detection functionality different types of testing were performed:

Exploratory testing - encourages testers to explore the software, make real-time decisions, and adapt their testing approach based on their findings. Testers have the freedom to decide what to test, how to test, and when to stop testing. The insights gained from exploratory testing can provide valuable feedback to developers, enhance test coverage, and improve the overall quality of the software.

User Interface Testing: Functional testing also includes validating the user interface (UI) components and interactions. It ensures that the UI elements, such as buttons, forms, menus, and navigation, work correctly and provide a seamless user experience.

In this case new functionality has been added - Creating Duplicate detection report.
These test cases are included and executed:
1. Verify Basic Functionality - the module for Content Classification - Duplicate Detection is accessible and visible on the page.
2. Validate page content on Create Duplicate Detection report page
3. Verify is user able to create Duplicate Detection report if  Report name field leaves empty
4. Verify whether the user can use, in addition to letters, some other characters, numbers, etc., to fill in the Report name field.
5. Verify is user is able to create new Duplicate detection report if leaves all parameters in "Show advanced options" dropdown menu unchecked.
6. Verify user is not able to create new Duplicate detection report if changes Max. distance between two points: to 10001m.

All test cases and enhancement tickets are written in Excell.
After testing all previously mentioned Test cases PlaceLab modul (Duplicate detection) worked properly and stable.
There were created 3 enhencement tickets for Duplicate detection with Minor severity (in excell file "Test cases - Duplicate detection").