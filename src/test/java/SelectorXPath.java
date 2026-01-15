import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Random;

public class SelectorXPath {
    WebDriver driver = new ChromeDriver();

    @Test
    public void phoneBookTest() {
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://telranedu.web.app/home");
//        WebElement aboutBtn = driver.findElement(By.cssSelector("[href='/about']"));
        WebElement aboutBtn = driver.findElement(By.xpath("//a[@href='/about']"));
//        //*[@href='/about']
//        //*[text()='ABOUT']
//        SelectorCss.pause(3);
        pause(4);
        aboutBtn.click();
        WebElement loginBtn = driver.findElement(By.xpath("//*[text()='LOGIN']"));
        pause(4);
        loginBtn.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        pause(3);
        int i = new Random().nextInt(1000);
        emailField.sendKeys("Polly"+ i +"@gmail.com");
        WebElement passwordField = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordField.sendKeys("Pass122$#");
        WebElement regBtn = driver.findElement(By.xpath("//button[@name='registration']"));
        regBtn.click();
        pause(3);
        WebElement singOutBtn = driver.findElement(By.xpath("//*[text()='Sign Out']"));
        singOutBtn.click();
        driver.quit();
    }

    @Test
    public void iLcarroXpathTest(){
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ilcarro.web.app/search");
        WebElement logInBtn = driver.findElement(By.xpath("//a[text()=' Log in ']"));
        pause(2);
        logInBtn.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@id='email']"));
        pause(2);
        emailField.sendKeys("dornb12@mail.com");
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        pause(2);
        passwordField.sendKeys("Qwert123#1");
        WebElement yallaBtn = driver.findElement(By.xpath("//button[text()='Y’alla!']"));
        yallaBtn.click();
        WebElement okBtn = driver.findElement(By.xpath("//button[text()='Ok']"));
        okBtn.click();
        WebElement logOutBtn = driver.findElement(By.xpath("//a[text()=' Logout ']"));
        logOutBtn.click();
        driver.quit();
    }

    public static void pause(int time) {
        try {
            Thread.sleep(time* 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
