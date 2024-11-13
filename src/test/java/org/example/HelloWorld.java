package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import java.time.Duration;

public class HelloWorld {
    public static void main(String[] args) {

        // Configurare WebDriver cu WebDriverManager
        WebDriverManager.chromedriver().setup();
        ssh -T git@github.com

        WebDriver driver = null;
        try {
            System.out.println("Pornirea browserului...");
            driver = new ChromeDriver();
            System.out.println("Deschid Google Chrome pentru a accesa pagina...");

            // Deschide pagina
            driver.get("https://demoqa.com/automation-practice-form");
            System.out.println("Pagina deschisă. Aștept să se încarce...");

            // Așteaptă până când titlul paginii conține "Automation Practice Form"
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.titleContains("Automation Practice Form"));
            System.out.println("Pagina s-a încărcat complet.");

            // Execută JavaScript pentru a modifica conținutul paginii
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("document.body.innerHTML = '<h1>Hello, World!</h1>'");

            // Așteaptă până când apare un tag <h1> pentru a confirma modificarea
            wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("h1")));
            System.out.println("Mesajul a fost afișat pe pagina accesată.");

            // Așteaptă un input de la utilizator înainte de a închide browserul
            System.out.println("Apăsați Enter pentru a închide browserul...");
            new java.util.Scanner(System.in).nextLine();
        } catch (Exception e) {
            System.out.println("A apărut o eroare: " + e.getMessage());
        } finally {
            if (driver != null) {
                // Închide browserul
                driver.quit();
            }
        }
    }
}
