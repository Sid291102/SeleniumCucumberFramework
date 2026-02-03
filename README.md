# SeleniumCucumberFramework

**SeleniumCucumberFramework** is a complete **end-to-end BDD automation testing framework** developed using **Selenium WebDriver**, **Java**, **Maven**, **Cucumber**, and **TestNG**.  
This framework is designed to automate web applications using **Behavior Driven Development (BDD)** approach.

---

## 🌐 Application Under Test (AUT)

- **Website:** https://www.saucedemo.com  
- **Application Type:** E-commerce demo web application  
- **Purpose:** Used for practicing login, product listing, cart, and checkout automation scenarios.

---

## 🧪 Tech Stack

| Tool | Purpose |
|------|--------|
| Java | Programming language |
| Selenium WebDriver | Browser automation |
| Maven | Dependency & build management |
| Cucumber | BDD framework |
| TestNG | Test execution & reporting |

---


---

## 📖 Features

- BDD framework using **Cucumber & Gherkin language**
- Selenium WebDriver integration
- Test execution using **TestNG**
- Clean and modular project structure
- Easy to understand for beginners
- Scalable for real-time automation projects

---

## 🧠 Framework Workflow

1. **Feature File** – Written in Gherkin language
2. **Step Definitions** – Java implementation of steps
3. **Runner Class** – Executes scenarios using TestNG
4. **Reports** – Auto-generated after execution

---

## 📄 Sample Feature File

```gherkin
Feature:  Login.feature

Feature: Login and Logout Functionality

  Scenario: Successful logout from products page
    Given I am on the SauceDemo login page
    When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    When I click on the menu button
    And I click on the logout link
    Then I should be redirected to the login page

Feature:Checkout

Feature: Checkout Process

  Scenario: User can purchase a backpack
    Given I am on the SauceDemo login page
    When I enter username "standard_user" and password "secret_sauce"
    And I click on the login button
    When I add the "Sauce Labs Backpack" to the cart
    And I click on the shopping cart icon
    And I click on the checkout button
    When I enter shipping information "John", "Doe", and "12345"
    And I finish the order
    Then I should see the order confirmation message "Thank you for your order!"


