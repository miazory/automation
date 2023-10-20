package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
public class StepDefinitions {
    private WebDriver driver;

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }

    // Implement other step definitions for scenarios in Login.feature and Shopping.feature
}
