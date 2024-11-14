package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ferdo\\AppData\\Local\\Programs\\Opera GX\\opera.exe");

        WebDriver driver = null;
        try {

            driver = new ChromeDriver(options);
            System.out.println("Deschid Opera GX pentru a accesa pagina...");

            driver.get("https://www.example.com");

            String expectedTitle = "Example Domain";
            String actualTitle = driver.getTitle();

            if (expectedTitle.equals(actualTitle)) {
                System.out.println("Testul a trecut: titlul este corect.");
            } else {
                System.out.println("Testul a eșuat: titlul este " + actualTitle);
            }
        } catch (Exception e) {
            System.out.println("A apărut o eroare: " + e.getMessage());
        } finally {

            if (driver != null) {
                driver.quit();
            }
        }
    }
}
