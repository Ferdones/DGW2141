package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;

public class HelloWorld {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.setBinary("C:\\Users\\ferdo\\AppData\\Local\\Programs\\Opera GX\\opera.exe"); // calea către Opera GX

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.example.com");
        System.out.println("Titlul paginii este: " + driver.getTitle());

        driver.quit();
    }
}
