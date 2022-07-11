package SeleniumTestcase.SeleniumTestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Openbrowser
{
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sugumar Sivanpandi\\Desktop\\Chromedriver\\chromedriver.exe");

        ExtentSparkReporter Spark = new ExtentSparkReporter("target/Reports.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(Spark);
        extent.createTest("Whatsapp").pass("Testcase Passed");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        driver.findElement(By.id("L2AGLb")) .click();
        driver.findElement(By.name("q")).sendKeys("Whatsapp");
        driver.findElement(By.name("q")).submit();
        driver.quit();
        extent.flush();
        driver.findElement(By.name("q")).submit();
    }
}
