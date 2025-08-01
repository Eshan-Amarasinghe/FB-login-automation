import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class test1 {

    @Test
            public void test() throws InterruptedException {

        //Initialize web driver
        WebDriver driver = new ChromeDriver();
        //Navigate to fb login page
        driver.get ("https://www.facebook.com/");
        // Find and fill the email
        driver.findElement(By.id("email")).sendKeys("johnmilton6464@gmail.com");
        // Find and fill the password
        driver.findElement(By.name("pass")).sendKeys("johnmarston");
        Thread.sleep(5000);
        // Find and click the login button
        driver.findElement(By.name("login")).click();
        //Display a message of success
        System.out.println("Logged in successfully!");

    }


}
