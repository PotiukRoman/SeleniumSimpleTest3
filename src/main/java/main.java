import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","c:/Users/38099/Downloads/chromedriver.exe");

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

// OLX practice
        /*
        driver.get("https://www.olx.ua/uk/");

        WebElement element = driver.findElement(By.xpath("//input[@id='submit-searchmain']"));
        element.click();

        WebElement element1 = driver.findElement(By.xpath("//a[@id='choosecat']"));
        element1.click();

        WebElement element2 = driver.findElement(By.xpath("//div/ul/li/a[@id='a-category-1532']"));
        element2.click();

        WebElement element3 = driver.findElement(By.xpath("//input[@name='q']"));
        //element3.sendKeys("жигулі");
       // element3.sendKeys("жигулі", Keys.ENTER);
        element3.sendKeys("c:/Users/arev/Downloads/price.xlsx", Keys.ENTER);
    */

// Actions

        try {
            driver.get("https://crossbrowsertesting.github.io/drag-and-drop");
            Thread.sleep(2000);
            WebElement element = driver.findElement(By.id("draggable"));
            WebElement element2 = driver.findElement(By.id("droppable"));

            Actions actions = new Actions(driver);
          //  actions.dragAndDrop(element,element2).perform();
          //  actions.dragAndDropBy(element,150,30).perform();
            actions
                    .moveToElement(element)
                    .clickAndHold()
                    .moveToElement(element2)
                    .release()
                    .build()
                    .perform();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            Thread.sleep(10000);
            driver.quit();
        }


    }
}

//c:/Users/38099/Downloads/chromedriver.exe
//c:/Users/arev/Downloads/chromedriver.exe

