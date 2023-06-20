package com.placeLab.amila.qamp.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverSetup {
    public static WebDriver getWebDriver(String browserName) {
        if (browserName.toLowerCase().equals("chrome")) {
            return getChromeDriver();
        } else if (browserName.toLowerCase().equals("edge")) {
            return getEdgeDriver();
        }
        throw new IllegalArgumentException("Match not found for the following browser: " + browserName);
    }

    private static WebDriver getChromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static WebDriver getEdgeDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
