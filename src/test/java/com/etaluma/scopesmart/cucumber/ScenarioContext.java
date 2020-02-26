package com.etaluma.scopesmart.cucumber;

import org.openqa.selenium.chrome.ChromeDriver;

public class ScenarioContext {

    private ChromeDriver driver;


    public ChromeDriver getDriver() {
        return driver;
    }

    public void setDriver(ChromeDriver driver) {
        this.driver = driver;
    }
}