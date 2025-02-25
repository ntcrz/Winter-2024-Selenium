package Misc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SauceDemoLogin {
    @Test
    public void enterLoginCredentials() throws InterruptedException {
        // 1. Launch saucedemo.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.saucedemo.com";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Type "abcd@test.com" in login-email field
        By loginUsernameLocator = By.id("user-name");
        WebElement userIdField = driver.findElement(loginUsernameLocator);
        userIdField.sendKeys("standard_user");
        Thread.sleep(5000);

        // 3. Type "myPassword@123" in password field
        By loginPwdLocator = By.id("password");
        WebElement loginPwdField = driver.findElement(loginPwdLocator);
        loginPwdField.sendKeys("secret_sauce");

        //4. click login button
        By loginButtonLocator = By.id("login-button");
        WebElement loginButton = driver.findElement(loginButtonLocator);
        loginButton.click();

        // 5. Close webpages
        driver.quit();

    }

}
