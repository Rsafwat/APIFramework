# REST API Testing Framework

This project is a Java Maven project that utilizes Cucumber and Rest Assured for automating REST API testing.

## Table of Contents

- [Introduction](#introduction)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Generating Reports](#generating-reports)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This repository contains a Java-based REST API testing framework built with Maven. It leverages Cucumber for behavior-driven development (BDD) and Rest Assured for API testing.

## Prerequisites

Before you begin, ensure you have the following installed:

- Java JDK (version X.X)
- Maven (version X.X)
- Git
-eclipse or IntelliJ IDEA

## Getting Started

1. Clone the repository:

    ```bash
    git clone git@github.com:Rsafwat/APIFramework.git
    cd your-repo
    ```

2. Install dependencies:

    ```bash
    mvn clean install
    ```

3. Run the sample tests:

    ```bash
    mvn test
    ```

## Project Structure

The project structure follows a standard Maven layout. Here is an overview of key directories:

- `src/test/java`: Contains test-related Java code, including Cucumber step definitions and test runners.
- `src/test/resources`: Contains feature files for Cucumber scenarios.
- `src/main/java`: Contains utility classes, data models, and any additional code needed for testing.
- `src/main/resources`: Contains configuration files, such as property files.

## Usage

This framework allows you to write and execute BDD-style API tests using Cucumber. To create new tests, add feature files in the `src/test/resources` directory and implement step definitions in `src/test/java`.

### Running Tests

Execute the tests using Maven:

```bash
mvn test
```
## Generating Reports
The framework uses the Cucumber Report plugin to generate reports. Run the following command to generate reports:

```bash
mvn  verify
```