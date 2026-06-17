# 🏫 MERSYS Campus Management System - Test Automation Framework

<div align="center">

![Java](https://img.shields.io/badge/Java-21-orange?style=for-the-badge&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.37.0-green?style=for-the-badge&logo=selenium)
![Cucumber](https://img.shields.io/badge/Cucumber-7.30.0-emerald?style=for-the-badge&logo=cucumber)
![TestNG](https://img.shields.io/badge/TestNG-7.11.0-red?style=for-the-badge&logo=testng)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=for-the-badge&logo=apache-maven)

**Enterprise BDD Test Automation Architecture for School & Campus Management Framework**

</div>

---

## 📋 About The Project

This repository houses an enterprise-level end-to-end UI test automation framework developed for the **MERSYS Campus Management System** during the intensive industry intern program. Engineered by **TEAM3**, the framework employs a distributed Behavior-Driven Development (BDD) approach using Cucumber and Selenium WebDriver under the Page Object Model (POM) architectural pattern. It delivers comprehensive cross-browser test coverage across vital institutional modules ranging from administrative configurations to monetary transactions, dynamic scheduling, and grading verification.

### ✨ Key Features

- ✅ **Distributed POM Architecture:** Clean structural separation where locators reside inside `main/java/pages`, decoupled from the test verification suites.
- ✅ **Multi-Module Coverage:** Full end-to-end automation pipelines validating Messaging, Finance, Assignment Control, and Student Attendance tracks.
- ✅ **Dynamic Data Parameterization:** Integrated with **Apache POI** for data-driven testing pipelines using external Excel matrix logs.
- ✅ **Rich Execution Analytics:** Configured with **ExtentReports** to dynamically capture execution timelines and embedded failure screenshots.

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|:-----------|:--------|:--------|
| **Java** | 21 | Core Development Language |
| **Selenium WebDriver** | 4.37.0 | Web Browser Automation Mechanics |
| **Cucumber JVM** | 7.30.0 | Behavior-Driven Development (BDD) Framework |
| **TestNG** | 7.11.0 | Test Execution Engine and Suite Controller |
| **ExtentReports** | 5.1.2 | Advanced HTML HTML Test Reporting & Analytics |
| **Apache POI** | 5.4.1 | External Data-Driven Excel Integration Management |
| **Maven** | 3.x | Build Lifecycle and Dependency Orchestration |

## 📝 Automated Modules & Functional Coverage

The framework targets complex, cross-functional business workflows divided across specific technical User Stories mapped to the core system packages:

| Module Track | Test Boundaries (User Stories) | Functional Verification Scope |
|:-------------|:-------------------------------|:------------------------------|
| 🔐 **Authentication** | `US_01` | **Secure Gateway Validation:** Asserts authorization flows, session persistence, and error handling for invalid identity claims. |
| 🏡 **Home & Navigation** | `US_02_03`, `US_04` | **Dashboard & Path Routing:** Controls home page widget loaders, dynamic broken links, global navigation trees, and menu mapping. |
| ✉️ **Messaging System** | `US_05`, `US_06`, `US_07` | **Internal Communications:** Validates full message production, attachment handling, secure removal (Delete), and trash canvas recovery (Restore) triggers. |
| 💰 **Finance Operations** | `US_08`, `US_09`, `US_12` | **Monetary Transactions:** Automates fee listings, student tuition balance logs, payment portal processing, and transactional verification logs. |
| 📝 **Assignment Controls** | `US_18`, `US_20`, `US_21`, `US_22` | **Academic Progress Management:** Handles student assignment uploads, deadline counters, teacher review routing, and asset status updates. |
| 📊 **Core Campus Modules** | Attendance, Calendar, Profile | **Institutional Operations:** Exercises automated synchronization for class attendance registers, calendar schedules, and personal profile modifications. |

## 📁 Project Structure

The codebase directory maps logically into a standardized Maven project blueprint:

```text
MERSYS_INTERN_PROJECT/
├── pom.xml                               # Maven build dependencies and test suite plugins
├── README.md                             # Comprehensive technical documentation
└── src/
    ├── main/
    │   └── java/
    │       ├── pages/                    # Encapsulated POM Locators & Component Actions
    │       └── pojo/                     # Structured Plain Old Java Objects for Data Parsing
    │
    └── test/
        └── java/
            ├── hooks/                    # Dynamic Execution Setup & Teardown Blocks
            ├── runner/                   # Specialized Feature Testing Suites & Parallel Launchers
            ├── StepDefinitions/          # Gherkin-to-Java Structural Translation Layer
            └── utility/                  # Core Driver Engine & Explicit Synchronization Components
        └── resources/
            └── features/                 # Executable Gherkin Behavior Definitions (.feature)
```
🚀 Execution Configurations
The automated test pipelines can be executed via terminal interfaces using versatile Maven parameters:

Trigger Complete Test Execution Suite
```text
mvn clean test
```
Execute a Specific Functional Suite Runner
```text
mvn test -Dtest=US_07_MessagingTrashRunner
```
Run Tests Across Explicit Browsers
```text
mvn test -Dbrowser=firefox
```
Execute Tagged Smoke or Regression Pipelines
```text
mvn test -Dcucumber.filter.tags="@smoke"
```
📊 Automated Test Reporting
Upon complete test pipeline processing, ExtentReports produces high-fidelity, standalone HTML documents capturing execution behaviors:

Reports Location: target/ExtentReports/extent-report.html

The analytics dashboard provides instant visual feedback containing:

Consolidated Pass/Fail ratios with comprehensive metadata.

Step-by-step description breakdowns for every executed user journey.

Automatic runtime screen capture bindings triggered on scenario failures.

System metrics including baseline environmental tracking.

To open the generated report natively via CLI:

```text
open target/ExtentReports/extent-report.html
```

🏆 Engineering Best Practices
Strict DOM Isolation: Keep test scripts immune to interface structure changes by containing all web element pointers within the pages/ layer.

Atomic Gherkin Steps: Build reusable, decoupled step declarations to maximize script script maintainability.

Asynchronous Synchronization: Enforce explicit webdriver waiting strategies over hardcoded thread breaks to eliminate pipeline flakiness.

State Cleanliness: Isolate test execution data pipelines, ensuring proper context resets after every lifecycle hook completion.

Engineered with precision and excellence by TEAM3
