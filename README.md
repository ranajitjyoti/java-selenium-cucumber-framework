# Java Selenium Cucumber Test Framework

A comprehensive test automation framework using Selenium WebDriver, Cucumber BDD, and TestNG with multiple reporting options.

## Prerequisites

- Java 21 or higher
- Maven 3.6 or higher

## Quick Start

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd java-selenium-project
   ```

2. **Run tests:**
   ```bash
   mvn clean test
   ```

3. **Generate reports:**
   ```bash
   # Generate all reports
   mvn verify
   
   # Generate and serve Allure report
   mvn allure:serve
   ```

## Project Structure

```
java-selenium-project/
├── src/
│   ├── main/java/
│   │   ├── pages/          # Page Object Model classes
│   │   └── utils/          # Utility classes
│   └── test/
│       ├── java/
│       │   ├── runners/    # Test runners
│       │   └── stepDefinitions/  # Cucumber step definitions
│       └── resources/
│           └── features/   # Cucumber feature files
├── pom.xml
└── testng.xml
```

## Reports Generated

All reports are generated in the `results/` folder:

- **Cucumber HTML**: `results/cucumber-html/`
- **Advanced HTML**: `results/cucumber-advanced-html/`
- **Allure Report**: `results/allure-report/` (or `mvn allure:serve`)
- **TestNG Report**: `results/testng-reports/`
- **JSON Reports**: `results/cucumber-json/`
- **JUnit XML**: `results/cucumber-junit/`
- **Timeline**: `results/cucumber-timeline/`

## Configuration

- **Browser**: Configured in `DriverManager.java`
- **Test Data**: Update `config.properties`
- **Test Suites**: Modify `testng.xml`

## Running Specific Tests

```bash
# Run specific feature
mvn test -Dcucumber.filter.tags="@smoke"

# Run with specific browser
mvn test -Dbrowser=chrome
```