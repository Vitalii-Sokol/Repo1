package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:/test/chromedriver_win32/chromedriver.exe"); //set parameters to chromedriver

        WebDriver Browsedriver = new ChromeDriver();  //open chrome browser
        Browsedriver.manage().window().maximize();  //expand to full window

        Browsedriver.get("https://www.google.com"); //open google link

       // Thread.sleep(5000); //close browser//Next step - Add exception to Method Signature (throws InterruptedException)

        System.out.println(Browsedriver.getTitle());
       // Browsedriver.quit(); //close browser

        WebElement s = By.name("q").findElement(Browsedriver);

        s.sendKeys("QA Factory");
        s.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        WebElement rso = Browsedriver.findElement(By.id("rso"));
        WebElement f = rso.findElement(By.tagName("a"));
        System.out.println(f.getText());

        List<WebElement> as = rso.findElements(By.tagName("a"));

        for (int i = 0; i < as.size(); i++ ){
            WebElement cur = as.get(i);
            System.out.println(cur.getText());
        }

        int j = 0;
        int els = as.size();
        while (j < els) {
            System.out.println();
            as.get(j).getText();

            j = j + 1;
        }
            s.clear();
            s.sendKeys("new 1");
            Browsedriver.findElement(By.name("btnG")).click();
             Thread.sleep(3000);
        }

        //Browsedriver.findElement(By.id("rso"));

       // Browsedriver.quit();

    }

