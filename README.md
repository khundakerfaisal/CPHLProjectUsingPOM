## Web Automation on CPHL Procurement And inventory Project Using Test NG (Including regression Suite)
## Prerequisite
- Install jdk-17.0.8
- Selenium Webdriver
- TestNG Framework
- Gradle 8.5
- Install Intellij IDEA community Edition
- Allure 2.25
## About this project
This is CPHL Procurement And inventory Project Using Test NG.Here User can create purchase,receiving and consumption the product. In this project We have create regression
suite and generate test case wise report using allure report.

## How to run this project
- Clone this project:```https://github.com/khundakerfaisal/CPHLProjectUsingPOM```
- Add dependencies in build.gradle file
- Hit the following command into the terminal for regression suite: gradle clean test -Pusername="Enterusername" -Ppassword="EnterPassword" -PsuiteName="regresion.xml"
- For generating Allure Report use these commands: ```allure generate allure-results``
                                                   ```allure serve allure-results```
## Allure Report
![Allure Report with suite](https://github.com/khundakerfaisal/CPHLProjectUsingPOM/assets/44666800/a64594b1-8203-40af-b690-6b03588d7cc1)
![allure graph](https://github.com/khundakerfaisal/CPHLProjectUsingPOM/assets/44666800/9db6c6d4-6da4-4c75-8783-508ce3392a65)
![Allure behaviour](https://github.com/khundakerfaisal/CPHLProjectUsingPOM/assets/44666800/57182498-2fd7-4e67-8389-5bb6fe66cb3e)
