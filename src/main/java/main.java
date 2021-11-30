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

//очікування (явне і неявне)
/*
            WebElement element=(new WebDriverWait(driver, Duration.ofSeconds(2))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
*/

//властивості атрибутів тегів  різних елементів
/*
        WebElement element = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));
     // String par=element.getAttribute("offsetWidth");
        String par=element.getAttribute("href");
        System.out.println(par);
*/

//Отимання тексту getText()

        WebElement element = driver.findElement(By.cssSelector(".price-text-_WjC0.text-text-LurtD.text-size-s-BxGpL"));
        String par=element.getText();
        System.out.println(par);

    }
}
// c:/Users/38099/Downloads/chromedriver.exe