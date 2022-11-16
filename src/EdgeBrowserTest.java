import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowserTest {

    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //Set Edge driver path
        System.setProperty("webDriver.edge.driver", "drivers/msedgedriver.exe");

        //Start Edge browser
        WebDriver driver = new EdgeDriver();

        //Open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("page Title is:" + driver.getTitle());

        //Get Current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web element or page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Find and enter email in email field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("feta235@gmail.com");

        //Find and enter password in password field
        WebElement passwordField = driver.findElement(By.name("Password"));
        passwordField.sendKeys("feta235");

        //Close browser
          driver.quit();

    }


}

