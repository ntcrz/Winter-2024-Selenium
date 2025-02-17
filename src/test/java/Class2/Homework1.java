package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework1 {
    /**
     * 1. Launch facebook.com
     * 2. Verify login email field is displayed
     * 3. Verify login password field is displayed
     */
    @Test
    public void verifyEmailPassword () throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

          // 2. Verify login email field is displayed

        By loginEmailFieldLocator = By.name("email");
        WebElement emailField = driver.findElement(loginEmailFieldLocator);
        boolean isEmailFieldFound = emailField.isDisplayed();
        Assert.assertTrue(isEmailFieldFound, "Email Field is not found");

        //3. Verify login password field is displayed

        By loginPasswordLocator = By.id("pass");
        WebElement passwordField = driver.findElement(loginPasswordLocator);
        boolean isPasswordFieldFound = passwordField.isDisplayed();
        Assert.assertTrue(isPasswordFieldFound, "Password field not found");



        driver.quit();
    }

}