import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:/Users/38099/Downloads/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://www.avito.ru");
        WebElement element = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));
        // String par=element.getAttribute("offsetWidth");
        String par=element.getAttribute("href");
        System.out.println(par);
    }
}
// c:/Users/38099/Downloads/chromedriver.exe