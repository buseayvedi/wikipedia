package com.wikipedia.utilities;

import org.junit.Assert;

import java.time.Duration;

public class BrowserUtils {

    public static void sleep(int seconds){

        seconds *= 1000;

        try{
        Thread.sleep(seconds);
        }catch (InterruptedException e){
        }
    }

    public static void titleVerificationContains(String str){
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }
}
