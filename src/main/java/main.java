import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:/Users/arev/Downloads/chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        WebDriver driver = new ChromeDriver(options);
      //WebDriver driver=new ChromeDriver();

     //   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));



//очікування (явне і неявне)
/*
            driver.get("https://www.avito.ru");
            WebElement element=(new WebDriverWait(driver, Duration.ofSeconds(2))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("123"))));
*/

//властивості атрибутів тегів  різних елементів
/*
        driver.get("https://www.avito.ru");
        WebElement element = driver.findElement(By.xpath("(//a[text()='Личные вещи'])[1]"));
     // String par=element.getAttribute("offsetWidth");
        String par=element.getAttribute("href");
        System.out.println(par);
*/

//Отимання тексту getText()
/*
        driver.get("https://www.avito.ru");
        WebElement element = driver.findElement(By.cssSelector(".price-text-_WjC0.text-text-LurtD.text-size-s-BxGpL"));
        String par=element.getText();
        System.out.println(par);
*/

// Автоматизація тестування верстки getCssValue
/*
        driver.get("https://dev.by/");
        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
        // String par=element.getCssValue("display");
        String par=element.getCssValue("transition");
        System.out.println(par);
*/

//Клік в браузері Click
        /*
        driver.get("https://www.olx.ua/uk/");
        WebElement element = driver.findElement(By.xpath("//a[text()='Вход']"));
        element.click();
     */

        driver.get("https://www.olx.ua/uk/");

        WebElement element = driver.findElement(By.xpath("//input[@id='submit-searchmain']"));
        element.click();

        WebElement element1 = driver.findElement(By.xpath("//a[@id='choosecat']"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//div/ul/li/a[@id='a-category-1532']"));
        element2.click();

    }
}

//c:/Users/38099/Downloads/chromedriver.exe
//c:/Users/arev/Downloads/chromedriver.exe

// //a[@id='a-category-1532']
//$$(".abs.categorySelectContainer")
//$$("ul[id='categorySelectList'] a[data-name='Авто']")

// data-icon_class="a-category-1532"
//   //div/ul/li/a[@id='a-category-1532']
