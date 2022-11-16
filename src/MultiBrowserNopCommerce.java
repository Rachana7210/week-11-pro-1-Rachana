import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserNopCommerce {

    static String browser  = "chrome";
    static String baseurl = "https://demo.nopcommerce.com/login?returnUrl=%2F";
    static WebDriver driver;

    public static void main(String[] args) {
        //1)setup of browser

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
            driver = new ChromeDriver();
        }
        else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdiver.gheko.driver","drivers/gehkodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdiver.msedge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        }

        //2)open url
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //3)print the title of the page
        System.out.println("Title of the page is" + driver.getTitle());

        //4)print current url
        System.out.println("current url is" + driver.getCurrentUrl());

        //5)print the page source
        System.out.println("page source is" + driver.getPageSource());

        //6)Find and enter email field
        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("feta235@gmail.com");

        //7)find and enter password field
        WebElement password = driver.findElement(By.name("Password"));
        password.sendKeys("feta235");

        //8)close the browser
        driver.quit();

    }
}
