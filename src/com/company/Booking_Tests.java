package com.company;


import org.junit.After;
import org.junit.Test;

public class Booking_Tests
{

    @Test
    public void Booking_Path() throws InterruptedException {
        Booking_functions.openBrowser();
        Booking_Path.sendKeys = "Kyiv";
        Booking_functions.sendKeys(Booking_Path.sendKeys);
    //    Booking_Path.sendClick();
        Booking_functions.sendClick(Booking_Path.sendClick);
    }


    @After
    public void driverQuit() throws InterruptedException
    {
        Thread.sleep(3000);
        //Booking_Path.driver.quit();
    }
}