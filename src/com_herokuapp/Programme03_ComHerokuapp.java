package com_herokuapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-3 - ProjectName : com-herokuapp
 * BaseUrl = http://the-internet.herokuapp.com/login
 * 1. Setup chrome browser.
 * 2. Open URL.
 * 3. Print the title of the page.
 * 4. Print the current url.
 * 5. Print the page source.
 * 6. Enter the email to email field.
 * 7. Enter the password to password field.
 * 8. Click on Login Button.
 * 9. Print the current url.
 * 10. Refresh the page.
 * 11. Close the browser.
 */
public class Programme03_ComHerokuapp {

    static WebDriver driver;
    static String browser = "Chrome";
    static String baseUrl = "http://the-internet.herokuapp.com/login";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("Edge")) {
            driver = new EdgeDriver();
        } else {
            System.out.println("Wrong browser selected");
        }
        driver.manage().window().maximize();
        System.out.println("1- Browser setup.");
        driver.get(baseUrl);
        System.out.println("2- URL opened.");
        System.out.println("3- Title of the page: " + driver.getTitle());
        System.out.println("4- Current URL of the page: " + driver.getCurrentUrl());
        System.out.println("5- Page source: " + driver.getPageSource());
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        System.out.println("6- username entered in the username field.");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        System.out.println("7- Password entered in the password field.");
        driver.findElement(By.className("radius")).click();
        System.out.println("8- User clicked on login button.");
        System.out.println("9- Current URL of the page: " + driver.getCurrentUrl());
        driver.navigate().refresh();
        System.out.println("10- Page refreshed.");
        driver.quit();
        System.out.println("11- Browser closed.");
    }
}