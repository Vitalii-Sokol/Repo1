package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:/test/chromedriver_win32/chromedriver.exe"); //set parameters to chromedriver

        WebDriver Browsedriver = new ChromeDriver();  //open chrome browser
        Browsedriver.manage().window().maximize();  //expand to full window

        Browsedriver.get("https://www.google.com"); //open google link

        Thread.sleep(5000); //close browser//Next step - Add exception to Method Signature (throws InterruptedException)

        Browsedriver.quit(); //close browser

    }
}
