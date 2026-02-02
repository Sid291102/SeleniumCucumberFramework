package stepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ShoppingSteps {
    
    // We use the static driver from the LoginSteps class
    WebDriver driver = LoginSteps.driver;

    @When("I add the {string} to the cart")
    public void add_item_to_cart(String itemName) throws InterruptedException {
        // Convert "Sauce Labs Backpack" to "sauce-labs-backpack" for the ID
        String formattedId = itemName.toLowerCase().replace(" ", "-");
        driver.findElement(By.id("add-to-cart-" + formattedId)).click();
        Thread.sleep(2000);
    }

    @And("I click on the shopping cart icon")
    public void go_to_cart() throws InterruptedException {
        driver.findElement(By.className("shopping_cart_link")).click();
        Thread.sleep(2000);
    }

    @And("I click on the checkout button")
    public void click_checkout() throws InterruptedException {
        driver.findElement(By.id("checkout")).click();
        Thread.sleep(2000);
    }

    @When("I enter shipping information {string}, {string}, and {string}")
    public void enter_shipping_info(String first, String last, String zip) throws InterruptedException {
        driver.findElement(By.id("first-name")).sendKeys(first);
        driver.findElement(By.id("last-name")).sendKeys(last);
        driver.findElement(By.id("postal-code")).sendKeys(zip);
        Thread.sleep(2000);
        driver.findElement(By.id("continue")).click();
    }

    @And("I finish the order")
    public void finish_order() throws InterruptedException {
        driver.findElement(By.id("finish")).click();
        Thread.sleep(2000);
    }

    @Then("I should see the order confirmation message {string}")
    public void verify_order(String expectedMessage) {
        String actualMessage = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals(actualMessage, expectedMessage);
        
        // Final quit
        driver.quit();
        LoginSteps.driver = null; 
    }
}
