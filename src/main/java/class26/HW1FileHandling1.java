package class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;

import java.io.IOException;

public class HW1FileHandling1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(ConfigReader.read("url_1"));
        System.out.println(ConfigReader.read("browser_1"));
        String url1=ConfigReader.read("url_1");
        String user=ConfigReader.read("userName_1");
        String pass= ConfigReader.read("password_1");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url1);
        Thread.sleep(2000);
        WebElement userNameWE=webDriver.findElement(By.xpath("//input[@id='email']"));
        WebElement passwordWE=webDriver.findElement(By.xpath("//input[@id='pass']"));
        WebElement loginWE=webDriver.findElement(By.xpath("//button[@name='login']"));
        userNameWE.sendKeys(user);
        passwordWE.sendKeys(pass);
        Thread.sleep(5000);
        loginWE.click();

    }
}
