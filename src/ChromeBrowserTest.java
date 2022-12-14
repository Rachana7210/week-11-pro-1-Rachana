import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //set Chrome driver path
        System.setProperty("weddriver.chrome.driver","drivers/chromedriver.exe");

        //Start chrome browser
        WebDriver driver = new ChromeDriver();

        //Open URL
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("Page Title is:" + driver.getTitle());

        //Get current url
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page Source is:" + driver.getPageSource());

        //Find and enter password in password field element
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("feta235@gmail.com");

        //Find and enter password in password field element
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("feta235");

        //Close browser
        driver.quit();
    }
}
