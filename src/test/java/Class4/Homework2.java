package Class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework2 {

    /**
     * 1. Launch facebook.com
     * 2. Click on Messenger link
     * 3. Verify "Log in" button is enabled
     * 4. Verify "Keep me signed in" checkbox is NOT selected
     * 5. Click on "log in" button
     * 6. Verify "Forgotten your password?" heading is displayed
     * 7. Click on X
     * 8. Verify "Forgotten your password?" heading is NOT displayed
     */
    @Test
    public void verifyMessengerButtons() throws InterruptedException {
        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        //2. Click on Messenger Link
        By messengerLinkLocator = By.partialLinkText("Mess");
        WebElement messengerLink = driver.findElement(messengerLinkLocator);
        messengerLink.click();
        Thread.sleep(5000);

        // 3. Verify Log in button is enabled
        By loginBtnLocator = By.name("login");
        WebElement loginBtn = driver.findElement(loginBtnLocator);
        boolean isloginBtnEnabled = loginBtn.isEnabled();
        Assert.assertTrue(isloginBtnEnabled, "Sign up button is NOT enabled");

        // 4. Verify "Keep me signed in" checkbox is NOT selected
        By keepSignedInLocator = By.name("persistent");
        WebElement keepSignedIn = driver.findElement(keepSignedInLocator);
        boolean isKeepSignedInEnabled = keepSignedIn.isSelected();
        Assert.assertFalse(isKeepSignedInEnabled, "Keep me signed in checkbox is selected");

        // 5. Click on "log in" button
        By messengerLogInLocator = By.id("loginbutton");
        WebElement messengerLogIn = driver.findElement(messengerLogInLocator);
        messengerLogIn.click();
        Thread.sleep(5000);

        // 6. Verify "Forgotten your password?" heading is displayed
        By forgotPassLocator = By.xpath("//span[@class='x1lliihq x1plvlek xryxfnj x1n2onr6 x1ji0vk5 x18bv5gf x193iq5w xeuugli x13faqbe x1vvkbs x1s928wv xhkezso x1gmr53x x1cpjm7i x1fgarty x1943h6x x1xmvt09 x6prxxf x1s688f x1fey0fg xudqn12 x3x7a5m xq9mrsl']");
        WebElement forgotPass = driver.findElement(forgotPassLocator);
        forgotPass.click();
        By forgotErrorMsgLocator = By.xpath("//span[contains(text() , 'Forgotten your password?')]");
        WebElement forgotErrorMsg = driver.findElement(forgotErrorMsgLocator);
        boolean isForgotErrorMsg = forgotErrorMsg.isDisplayed();
        Assert.assertTrue(isForgotErrorMsg, "forgot message is NOT displayed");
        Thread.sleep(5000);

        // 7. Click on X
        By clickOnXLocator = By.xpath("//div[@aria-label='Close']");
        WebElement clickOnX = driver.findElement(clickOnXLocator);
        clickOnX.click();


        // 8. Verify "Forgotten your password?" heading is NOT displayed
        driver.quit();
    }

    /**
         * 1. Launch facebook.com
         * 2. Click Create new account button
         * 3. Select Jul in month dropdown
         * 4. Select 10 in date dropdown
         * 5. Select 2000 in year dropdown
         */
        @Test
        // 1. Launch facebook.com
        public void verifyNewFacebookAcc () throws InterruptedException {

            // 1. Launch facebook.com
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url = "https://www.facebook.com/";
            driver.get(url);
            Thread.sleep(5000);

            // 2. Click on Create new account button
            By createNewAccountBtnLocator = By.xpath("//form[@data-testid='royal_login_form']//a[contains(@data-testid,'registration')]");
            WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
            createNewAccountBtn.click();
            Thread.sleep(5000);


            //3. Select Jul in month dropdown
            By monthDropdownLocator = By.id("month");
            WebElement monthDropdownElement = driver.findElement(monthDropdownLocator);
            Select monthDropdown = new Select(monthDropdownElement);
            monthDropdown.selectByVisibleText("Jul");

             //4. Select 10 in date dropdown
            By dayDropdownLocator = By.id("day");
            WebElement dayDropdownElement = driver.findElement(dayDropdownLocator);
            Select dayDropdown = new Select(dayDropdownElement);
            dayDropdown.selectByVisibleText("10");

            //5. Select 2000 in year dropdown
            By yearDropdownLocator = By.id("year");
            WebElement yearDropdownElement = driver.findElement(yearDropdownLocator);
            Select yearDropdown = new Select(yearDropdownElement);
            yearDropdown.selectByVisibleText("2000");

            driver.quit();
        }
    /**
     * 1. Launch facebook.com
     * 2. Click on Create new account button
     * 3. Verify Female radio-button is NOT selected
     * 4. Verify Male radio-button is NOT selected
     * 5. Verify Not Specified radio-button is NOT selected
     */
    @Test
    // 1. Launch facebook.com
    public void verifyRadioBtn () throws InterruptedException {

        // 1. Launch facebook.com
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.facebook.com/";
        driver.get(url);
        Thread.sleep(5000);

        // 2. Click on Create new account button
        By createNewAccountBtnLocator = By.xpath("//form[@data-testid='royal_login_form']//a[contains(@data-testid,'registration')]");
        WebElement createNewAccountBtn = driver.findElement(createNewAccountBtnLocator);
        createNewAccountBtn.click();
        Thread.sleep(5000);

        //3. Verify Female radio-button
        By femaleRadioBtnLocator = By.xpath("//label[normalize-space()='Female']//input[@id='sex']");
        WebElement femaleRadioBtn = driver.findElement(femaleRadioBtnLocator);
        boolean isFemaleRadioBtn = femaleRadioBtn.isSelected();
        Assert.assertFalse(isFemaleRadioBtn, "Female Radio Button is selected");

        // 4. Verify Male radio-button is NOT selected
        By maleRadioBtnLocator = By.xpath("//label[normalize-space()='Male']//input[@id='sex']");
        WebElement maleRadioBtn = driver.findElement(maleRadioBtnLocator);
        boolean isMaleRadioBtn = maleRadioBtn.isSelected();
        Assert.assertFalse(isMaleRadioBtn, "Male Radio Button is selected");

        // 5. Verify Not Specified radio-button is NOT selected
        By customRadioBtnLocator = By.xpath("//label[normalize-space()='Custom']//input[@id='sex']");
        WebElement customRadioBtn = driver.findElement(customRadioBtnLocator);
        boolean isCustomRadioBtn = customRadioBtn.isSelected();
        Assert.assertFalse(isCustomRadioBtn, "Custom Radio Button is selected");
        driver.quit();
    }
        /**
         * 1. Launch google.com
         * 2. Search tesla
         * 3. Click on Wikipedia link of Tesla
         * 4. Verify heading "Tesla, Inc." is displayed
         * 5. Verify "96 languages" text is displayed on language dropdown (this is NOT a dropdown)
         */
        @Test
        // 1. Launch facebook.com
        public void verifyGoogleSearch () throws InterruptedException {

            // 1. Launch google.com
            System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            String url = "https://www.google.com/";
            driver.get(url);
            Thread.sleep(5000);
            // 2.Search tesla
            // //form[@data-testid='royal_login_form']//a[contains(@data-testid,'registration')]
            By searchTextBoxLocator = By.xpath("//textarea[@id='APjFqb']");
            WebElement searchTextBox = driver.findElement(searchTextBoxLocator);
            searchTextBox.clear();
            searchTextBox.sendKeys("tesla");
            searchTextBox.sendKeys("\n\n");
            Thread.sleep(5000);

            // 3. Click on Wikipedia link of Tesla
            // I was not able to get past this step. I got a message saying I'm not a robot recaptcha


            //4. Verify heading "Tesla, Inc." is displayed


            //5. Verify "96 languages" text is displayed on language dropdown (this is NOT a dropdown)

            driver.quit();
        }
}