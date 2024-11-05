package browsertest;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Project-1- ProjectName: com-tricentis
 *  BaseUrl = https://demowebshop.tricentis.com/
 *  1. Set up Firefox browser.
 *  2. Open URL.
 *  3. Print the title of the page.
 *  4. Print the current URL.
 *  5. Print the page source.
 *  6. Navigate to Url.
 *  “https://demowebshop.tricentis.com/login ”
 *  7. Print the current URL.
 *  8. Navigate back to the home page.
 *  9. Navigate to the login page.
 *  10. Print the current URL.
 *  11. Refresh the page.
 *  12. Enter the email in the email field.
 *  13. Enter the password in the password field.
 *  14. Click on the Login Button.
 *  15. Close the browser.
 */

public class FireFoxBrowserTest {
        public static void main(String[] args) {
            String baseUrl = " https://demowebshop.tricentis.com/";
            //1set up Firefox browser.
            WebDriver driver = new FirefoxDriver();
            //2 open url
            driver.get(baseUrl);
            // 3print the title of the page
            String title = driver.getTitle();
            System.out.println(title);

            //4 Print the current URL.
            String  currentUrl =  driver.getCurrentUrl();
            System.out.println("The current Url" + currentUrl);

            //5. Print the page source.
            System.out.println( "The page source" + driver.getPageSource());

            //6. Navigate to Url.
            // *  “https://demowebshop.tricentis.com/login ”
            String loginUrl = "https://demowebshop.tricentis.com/login";
            driver.navigate().to(loginUrl);

            // 7. Print the current URL.
            System.out.println("Get the current Url:" + driver.getCurrentUrl());

            //8. Navigate back to the home page.
            driver.navigate().back();

            // 9. Navigate to the login page.
            driver.navigate().to(loginUrl);

            //10. Print the current URL.
            System.out.println("Current URL after navigating back to login: " + driver.getCurrentUrl());

            //11. Refresh the page.
            driver.navigate().refresh();

            //12 Enter the email in the email field.
            driver.findElement(By.id("Email")).sendKeys("mytestac20@gmail.com");

            //13.Enter the password in the password field.
            driver.findElement(By.id("Password")).sendKeys("M123"); // Replace with your password

            //14. Click on the Login Button.
            driver.findElement(By.xpath("//input[@value='Log in']")).click();

            //15.close the Browser
            driver.quit();
        }
    }


