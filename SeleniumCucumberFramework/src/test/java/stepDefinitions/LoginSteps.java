package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class LoginSteps {
    
    static WebDriver driver;

    @Given("I am on the SauceDemo login page")
    public void open_browser() throws InterruptedException {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            
            // 1. Incognito is the best way to avoid 'Data Breach' popups
            options.addArguments("--incognito"); 
            
            // 2. These disable the other standard bubbles
            options.addArguments("--disable-save-password-bubble");
            options.addArguments("--disable-notifications");

            // 3. This tells Chrome NOT to check for compromised passwords
            java.util.Map<String, Object> prefs = new java.util.HashMap<>();
            prefs.put("credentials_enable_service", false);
            prefs.put("profile.password_manager_enabled", false);
            // This specific line often helps with that breach popup
            prefs.put("profile.password_manager_leak_detection", false); 
            
            options.setExperimentalOption("prefs", prefs);

            // IMPORTANT: You must pass 'options' here!
            driver = new ChromeDriver(options);
            driver.manage().window().maximize();
        }
        driver.get("https://www.saucedemo.com/");
        Thread.sleep(3000); 
    }

    @When("I enter username {string} and password {string}")
    public void enter_credentials(String user, String pass) throws InterruptedException {
        driver.findElement(By.id("user-name")).sendKeys(user);
        driver.findElement(By.id("password")).sendKeys(pass);
        Thread.sleep(3000); // Pause to see the typed credentials
    }

    @And("I click on the login button")
    public void click_login() throws InterruptedException {
        driver.findElement(By.id("login-button")).click();
        Thread.sleep(3000); // Pause to see the products page load
    }

    @Then("I should be redirected to the products page")
    public void verify_login() {
        boolean isPresent = driver.findElement(By.className("title")).isDisplayed();
        Assert.assertTrue(isPresent);
    }

    @When("I click on the menu button")
    public void click_menu() throws InterruptedException {
        driver.findElement(By.id("react-burger-menu-btn")).click();
        Thread.sleep(3000); // Wait for the menu to slide out
    }

    @And("I click on the logout link")
    public void click_logout() throws InterruptedException {
        driver.findElement(By.id("logout_sidebar_link")).click();
        Thread.sleep(3000); // Pause to see the logout happening
    }

    @Then("I should be redirected to the login page")
    public void verify_logout() {
        boolean loginBtn = driver.findElement(By.id("login-button")).isDisplayed();
        Assert.assertTrue(loginBtn);
        
        driver.quit();
        driver = null; 
    }
}