import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowserTest {
    public static void main(String[] args) {
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";

        //set firefox driver path
        System.setProperty("webdriver.gheko.driver", "drivers/gehkodriver.exe");

        //start firefox browser
        WebDriver driver = new FirefoxDriver();

        //open url
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get title of loaded page
        System.out.println("page title is:" + driver.getTitle());

        //Get current URL
        System.out.println("Current URL is:" + driver.getCurrentUrl());

        //Get web elements or page source
        System.out.println("Page source is:" + driver.getPageSource());

        //Find and enter email in email field element
        WebElement emailfield = driver.findElement(By.id("Email"));
        emailfield.sendKeys("feta235@gmail.com");

        //Find and enter password in password field element
        WebElement passwordfield = driver.findElement(By.name("Email"));
        passwordfield.sendKeys("feta235");

        //close browser
         driver.quit();
    }

}
