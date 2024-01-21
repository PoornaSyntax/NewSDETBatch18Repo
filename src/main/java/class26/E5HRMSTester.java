package class26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E5HRMSTester {
    public static void main(String[] args) throws IOException {
        String path ="C:\\Users\\poorn\\IdeaProjects\\NewSDETBAtch18\\Files\\HRMSTestData.xlsx";
        String sheetName="Sheet1";
        List<Map<String,String>> testData= ExcelReader.read(path,sheetName);
        System.out.println(testData);
        WebDriver webDriver=new ChromeDriver();
        String url= ConfigReader.read("url");
        String userName=ConfigReader.read("userName");
        String password=ConfigReader.read("password");

        webDriver.manage().window().maximize();
        webDriver.get(url);
        WebElement userNameWE=webDriver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordWE=webDriver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn=webDriver.findElement(By.xpath("//input[@id='btnLogin']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();
        //webDriver.close();

        testData.forEach(x->{

            webDriver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
            webDriver.findElement(By.xpath("//a[@id='menu_pim_addEmployee']")).click();
            webDriver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(x.get("FirstName"));
            webDriver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(x.get("MiddleName"));
            webDriver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(x.get("LastName"));
            webDriver.findElement(By.xpath("//input[@id='btnSave']")).click();
        });
        //
    }
}
