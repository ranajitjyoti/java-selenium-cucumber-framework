package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {

    @Before
    public void setUp() {
        System.out.println("Test execution started");
    }

    @After
    public void tearDown() {
        DriverManager.quitDriver();
        System.out.println("Test execution completed");
    }
}


