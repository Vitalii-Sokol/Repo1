package com.company;

import org.junit.After;
import org.junit.Test;

/**
 * Created by Admin on 29.04.15.
 */
public class Translate_Tests {
    public static String field;

    @Test
    public void Translate_Path() throws InterruptedException {
        Translate_functions.openBrowser();
        Translate_Path.sendKeys = "Hello";
        Translate_functions.sendKeys(Translate_Path.sendKeys);
    }


    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(3000);
        //Translate_Path.driver.quit();
    }
}

