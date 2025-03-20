******Monefy App - Test Automation project using Appium and Page Object Model******

This project utilizes the Page Object Model (POM) design pattern to develop and automate the functionalities of the Monefy app. The goal is to ensure efficient and maintainable test automation for the app's features.

****Tools and Dependencies****

Appium: For mobile application testing.
Selenium: For web automation.
Maven: For project management and build automation.
TestNG: For testing framework.
ExtentReports: For generating test reports.

**Programming language:**
Java 

****Test Instruction:****
- **Clone repositry:** Use the following command to clone the repository: `https://github.com/alam5/monefy-appium-automated-tests.git`
- **Build project:** Go to file to the project directory Pom.xml and build the project using Maven: `mvn clean install`
-  **Update device.properties file:** Open the `device.properties` file and enter your device properties information.
- **Run Appium:** Ensure that the Appium server installed and running. You can start it using the following command: `appium`
- **Execute Tests:** Open the `test-execution.xml` file and run the project. You can do this from your IDE or using the command line.
- Test result can also be seen the `MonefyTestresultReport.html` extent report in the project.

**Below Smoke and Regression tests were selected for automation:**

**Smoke Test Cases:**
1. Verify that income is added and saved.
2. Verify that an expense is added and saved.
   
**Regression Test Cases:**
1. Verify that adding a new account in the Monefy app functions as expected.
2. Verify that an account can be deleted successfully.

**Why above case ?**
These test cases were selected because adding income, adding expenses, and creating accounts are critical functionalities of the app. Ensuring these features work correctly is essential for maintaining the overall integrity of the application.







 
