import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class SelectorCss {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://telranedu.web.app/home");
        WebElement aboutBtn = driver.findElement(By.cssSelector("a[href='/about']"));
        pause(3);
        aboutBtn.click();
        pause(3);
//        WebElement divRoot = driver.findElement(By.cssSelector("div[id='root']"));
//        WebElement divRoot = driver.findElement(By.id("root"));
//        WebElement divRoot = driver.findElement(By.cssSelector("#root"));
//        WebElement divRoot = driver.findElement(By.cssSelector("*[id='root']"));
//        System.out.println(divRoot.getAttribute("class"));
//        driver.navigate().refresh();
//       driver.navigate().to("https://telranedu.web.app/login");
//        pause(5);
        driver.navigate().back();
        driver.quit();


    }
    static void pause(int time){
        try {
            Thread.sleep(time*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
