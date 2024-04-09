package newproject1.usethisone;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Test1 {
    public static void main(String[] args) {
        // Set path to chromedriver.exe
        System.setProperty("webdriver.chrome.driver", "/Users/rolandolabrador/IdeaProjects/chromedriver-mac-arm64/chromedriver");

        // Initialize Chrome driver
        WebDriver driver = new ChromeDriver();

        // Open Google.com
        driver.get("https://nextjs-ecommerce-eta-sandy.vercel.app/");

        // Find the search box using XPath
        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/main/main/div[1]/div[1]/div/form/div/input"));


        // Perform actions with the search box (e.g., typing)
        searchBox.sendKeys("porche");
        WebElement button = driver.findElement(By.xpath("/html/body/div[1]/main/main/div[1]/div[1]/div/form/div/button"));

        // Click on the button
        button.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement item2=driver.findElement(By.xpath("/html/body/div[1]/main/div/a[2]"));
        item2.click();

        // Close the browser
        //driver.quit();
    }
}


