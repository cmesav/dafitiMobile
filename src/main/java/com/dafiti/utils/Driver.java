package com.dafiti.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Driver {

    private Driver() {
    }

    public static WebDriver dafiti(){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","ZY32BS2SD8");
        capabilities.setCapability("platformName","android");
        capabilities.setCapability("platformVersion","11");
        capabilities.setCapability("appPackage","br.com.dafiti");
        capabilities.setCapability("appActivity","br.com.dafiti.activity.SplashSelectCountry_");

        try {
            return new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}

