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
Feature: SauceDemo Login

Scenario: Valid login with correct credentials
  Given User opens SauceDemo website
  When User enters valid username and password
  Then User should be redirected to homepage


