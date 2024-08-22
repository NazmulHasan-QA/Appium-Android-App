package Utils;
import java.util.Properties;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import javax.mail.*;


import java.time.Duration;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static Test.Base.driver;


public class ReusableMethods {


    public static void click(By path, AppiumDriver driver) {
        WebElement element = findElement(path, driver);
        element.click();
    }

    public static void jsClick(By locator, AppiumDriver driver) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = driver;
        js.executeScript("arguments[0].click();", element);
    }

    public static WebElement waitForElementVisibility(By path, AppiumDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Adjust the timeout as needed
        return wait.until(ExpectedConditions.visibilityOfElementLocated(path));
    }


    public static WebElement findElement(By path, AppiumDriver driver) {
        return driver.findElement(path);
    }

    public static boolean verifyElementsPresent(By path, AppiumDriver driver) {
        WebElement element = findElement(path, driver);
        return element.isDisplayed();
    }

    public static void sendData(By path, AppiumDriver driver, String text)
    {
        WebElement element = findElement(path, driver);
        element.sendKeys(text);
    }

    public static void selectByVisibleText(By locator, AppiumDriver driver, String visibleText) {
        WebElement dropdownElement = driver.findElement(locator);
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(visibleText);
    }

    public static boolean ButtonEnableOrNot(By path, AppiumDriver driver) {
        WebElement element = findElement(path, driver);
        return element.isEnabled();
    }

    public static void scrollIntoElementAndClick(By path, AppiumDriver driver) {
        // Scroll until the element is visible
        while (driver.findElements(path).isEmpty()) {
            scrollDown(driver);
        }

        // Wait until the element is clickable and then click it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(path));
        element.click();
    }

    public static void scrollIntoElement(By path ,AppiumDriver river)
    {
        while (driver.findElements(path).isEmpty()) {
            scrollDown(driver);
        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(path));
    }

    public static void scrollDown(AppiumDriver driver) {
        if (driver instanceof AndroidDriver) {
            AndroidDriver androidDriver = (AndroidDriver) driver;
            String scrollCommand = "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()";
            androidDriver.findElement(AppiumBy.androidUIAutomator(scrollCommand));
        } else {
            throw new UnsupportedOperationException("Scrolling is only implemented for AndroidDriver.");
        }
    }

    public static String generateRandomGmail() {
        String[] domains = {"@gmail.com"};
        String[] prefixes = {"random", "user", "test", "example", "demo", "temp"};

        Random random = new Random();
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String domain = domains[random.nextInt(domains.length)];

        // Generating a random number between 1000 and 9999 for variation
        int randomNumber = 1000 + random.nextInt(9000);

        // Concatenating the prefix, random number, and domain to form the email address
        String emailAddress = prefix + randomNumber + domain;

        return emailAddress;
    }

    public static void waitUntilPerformClickAction(By path, AppiumDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(path));

        // Perform an action on the element
        element.click(); // Example action
    }

    public static boolean waitUntilPerformIsDisplayAction(By path, AppiumDriver driver) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(path));

        // Perform an action on the element
        return element.isDisplayed(); // Example action
    }

    public static void waitUntilPerformDataSendAction(By path, AppiumDriver driver, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(path));

        // Perform an action on the element
        element.sendKeys(text); // Example action
    }

    public static boolean waitUntilPerformIsEnableAction(By path, AppiumDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(path));

        // Perform an action on the element
        return element.isEnabled(); // Example action
    }


    private static final String COUNTRY_CODE = "017";
    private static final String[] CARRIER_CODES = {"13", "14", "15", "16", "17", "18", "19"};  // Common carrier codes in Bangladesh

    public static String generatePhoneNumber() {
        Random random = new Random();
        String carrierCode = CARRIER_CODES[random.nextInt(CARRIER_CODES.length)];
        StringBuilder phoneNumber = new StringBuilder(COUNTRY_CODE);
        phoneNumber.append("1").append(carrierCode);

        for (int i = 0; i < 5; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        return phoneNumber.toString();
    }

    public static void Clear(By path, AppiumDriver driver) {
        WebElement element = findElement(path, driver);
        element.clear();
    }

    public static String getText(By path, AppiumDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(path));

        // Get the text of the element
        return element.getText();
    }
    public static String getOTPFromEmail(String host, String storeType,String user, String password) {
        // Retrieve environment variables
       //  user = System.getenv("EMAIL_USER");
        // password = System.getenv("EMAIL_PASSWORD");
        if (user == null || user.isEmpty()) {
            user = System.getenv("EMAIL_USER");
        }
        if (password == null || password.isEmpty()) {
            password = System.getenv("EMAIL_PASSWORD");
        }

        try {
            // Set properties
            String username = System.getenv("MAIL_USERNAME");
            String appPassword = System.getenv("MAIL_PASSWORD");

            Properties properties = new Properties();
            properties.put("mail.store.protocol", "imaps");
            properties.put("mail.imap.host", "imap.gmail.com");
            properties.put("mail.imap.port", "993");
            properties.put("mail.imap.ssl.enable", "true");
            properties.put("mail.imap.ssl.protocols", "TLSv1.2");
            properties.put("mail.debug", "true"); // Enable debugging


            // Get the session object
            Session emailSession = Session.getInstance(properties);
            Store store = emailSession.getStore(storeType);
            store.connect(host, user, password);

            // Open the inbox folder
            Folder inbox = store.getFolder("INBOX");
            inbox.open(Folder.READ_ONLY);

            // Get the latest email
            Message[] messages = inbox.getMessages();
            if (messages.length == 0) {
                return null; // No emails found
            }
            Message message = messages[messages.length - 1];

            String content = message.getContent().toString();

            // Extract OTP
            String otp = extractOTP(content);

            // Close the folder and store
            inbox.close(false);
            store.close();

            return otp;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String extractOTP(String content) {
        // Define regex pattern for 6-digit OTP
        String otpPattern = "\\b\\d{4}\\b"; // Example pattern for 6-digit OTP
        Pattern pattern = Pattern.compile(otpPattern);
        Matcher matcher = pattern.matcher(content);

        // Find and return the OTP
        if (matcher.find()) {
            return matcher.group();
        }

        return null; // OTP not found
    }
    public static String getTextFromMobileElements(By path, AppiumDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(path));

        // First, try to get the text using getText()
        String text = element.getText();

        // If getText() returns an empty string or null, try to get the content-desc attribute
        if (text == null || text.isEmpty()) {
            text = element.getAttribute("content-desc");
        }

        return text;
    }



}

