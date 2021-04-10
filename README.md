# PlanitAutoTest
Prerequisites:
-	JDK8 should be installed and also used Eclipse version 3 used with selenium version3

Project Title:
Created Automation framework for Jupiter toys website with few scenarios

Motivation:
Created test cases and automation scripts for shop page and contact page and also verified whether items are added to the basket after clicking the buy button.

Code Style:
Here I used standard code style and I used java language and added comments on the complicated steps only.

Technology/Framework Used
Technology Used: Java, Selenium, Maven, Cucumber, Junit4
Framework Used: Page Object Model

Features:
In this added 3 scenarios for contact page feature and 1 scenario for shop page feature.

Tests & How to run:
My project name is PlanitAutoTest
*** 1.First I created feature file in src/test/resources and also I kept the driver in the project level in the same folder ie src/test/resources. Also I added pom.xml features as well.
*** 2.Also stepDefinition classes, page classes, action classes, constants and runner class in the src/test/java folder and the hooks are in the com.stepDefinition package so it will run before and after during the test run
****Before run the test, please change the driver path according to your system location,which is in the Hooks class located on the src/test/java com.stepDefinitions  Hooks @Before section.
****Run the scripts from CucumberFullPack Runner class in src/test/java  com.runner  CucumberFullPackRunner Class

Test Running Status:
4 Scenarios (_[32m4 passed_[0m)
17 Steps (_[32m17 passed_[0m)
0m26.927s
