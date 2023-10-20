package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private final WebDriver driver;

    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isProductListDisplayed() {
        return driver.findElement(By.className("inventory_list")).isDisplayed();
    }
}