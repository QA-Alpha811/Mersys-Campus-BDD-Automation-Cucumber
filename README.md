# MERSYS Campus - Test Automation Framework

<div align="center">

![Java](https://img.shields.io/badge/Java-21-orange?style=flat-square&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.37.0-green?style=flat-square&logo=selenium)
![Cucumber](https://img.shields.io/badge/Cucumber-7.30.0-brightgreen?style=flat-square&logo=cucumber)
![TestNG](https://img.shields.io/badge/TestNG-7.11.0-red?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-Build-blue?style=flat-square&logo=apache-maven)

**A BDD Test Automation Framework by TEAM3**

</div>

---

## About The Project

This is an end-to-end test automation framework for the MERSYS Campus Management System. Built using Cucumber BDD and following the Page Object Model design pattern, it provides comprehensive test coverage for critical business functionalities.

**TEAM3** - Professional QA Engineering Team

---

## Tech Stack

- **Java 21** - Programming Language
- **Selenium WebDriver 4.37.0** - Browser Automation
- **Cucumber 7.30.0** - BDD Framework
- **TestNG 7.11.0** - Test Runner
- **Maven** - Dependency Management
- **ExtentReports 5.1.2** - Test Reporting
- **Apache POI 5.4.1** - Excel Data Handling

---

## Project Structure

```
MERSYS_INTERN_PROJECT/
├── src/
│   ├── main/java/
│   │   ├── pages/              # Page Object Model classes
│   │   └── pojo/               # Data objects
│   └── test/
│       ├── java/
│       │   ├── hooks/          # Test hooks
│       │   ├── runner/         # Test runners
│       │   ├── StepDefinitions/ # Cucumber steps
│       │   └── utility/        # Helper utilities
│       └── resources/
│           └── features/       # Gherkin feature files
├── pom.xml
└── README.md
```

---

## Prerequisites

- Java Development Kit (JDK) 21 or higher
- Apache Maven 3.6+
- Git

---

## Installation

```bash
# Clone the repository
git clone https://github.com/your-organization/MERSYS_INTERN_PROJECT.git

# Navigate to project directory
cd MERSYS_INTERN_PROJECT

# Install dependencies
mvn clean install
```

---

## Test Coverage

### Authentication
- **US_01** - User Login

### Home & Navigation
- **US_02_03** - Home Page
- **US_04** - Navigation

### Messaging
- **US_05** - Send Message
- **US_06** - Delete Message
- **US_07** - Trash Management (Restore/Delete)

### Finance
- **US_08, US_09, US_12** - Finance Operations

### Assignments
- **US_18, US_20, US_21, US_22** - Assignment Management

### Additional Modules
- Attendance Management
- Calendar Operations
- Profile Settings

---

## Running Tests

### Run all tests
```bash
mvn clean test
```

### Run specific test suite
```bash
mvn test -Dtest=US_07_MessagingTrashRunner
```

### Run with specific browser
```bash
mvn test -Dbrowser=chrome
```

### Run tests with tags
```bash
mvn test -Dcucumber.filter.tags="@smoke"
```

---

## Test Reports

After test execution, **ExtentReports** generates a detailed HTML report:

**Location:** `target/ExtentReports/extent-report.html`

The report includes:
- Test execution summary with pass/fail statistics
- Detailed test steps with descriptions
- Screenshots for failed scenarios
- Test execution timeline
- System and environment information

**To view the report:**
```bash
open target/ExtentReports/extent-report.html
```

---

## Best Practices

- Follow Page Object Model pattern for maintainability
- Write clear and readable Gherkin scenarios
- Use meaningful names for methods and variables
- Keep test scenarios independent
- Implement proper wait strategies
- Clean up test data after execution

---

## Contributing

1. Create a feature branch (`git checkout -b feature/US_XX_description`)
2. Commit your changes (`git commit -m 'Add US_XX test scenarios'`)
3. Push to the branch (`git push origin feature/US_XX_description`)
4. Create a Pull Request

---

## Team

**TEAM3** - QA Engineering Team

Specialized in test automation, quality assurance, and continuous testing for enterprise applications.

---

<div align="center">

**Built with excellence by TEAM3**

</div>