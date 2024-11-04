package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HelloWorld {
    public static void main(String[] args) {
        // Setează calea către ChromeDriver
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");

        // Configurează opțiunile pentru Opera
        ChromeOptions options = new ChromeOptions();
        options.setBinary("D:\\webdriver.=\\operadriver"); // Verifică calea către Opera GX
        options.addArguments("--remote-allow-origins=*");

        // Creează o instanță a driverului Chrome (care va utiliza Opera)
        WebDriver driver = new ChromeDriver(options);

        // Maximizează fereastra
        driver.manage().window().maximize();

        // Navighează la o pagină web
        driver.get("https://www.google.com");

        // Închide driverul după test
        driver.quit();
    }
}
