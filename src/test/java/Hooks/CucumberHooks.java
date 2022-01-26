package Hooks;

import cucumber.api.java.After;
import cucumber.api.java.AfterStep;
import cucumber.api.java.Before;
import cucumber.api.java.BeforeStep;

public class CucumberHooks {
    @Before
    public void setUp(){
        System.out.println("---Before Hook---");
    }
    @After
    public void tedDown(){
        System.out.println("----After hook---");
    }
    @BeforeStep
    public void setUpStep(){
        System.out.println("---Before Step---");
    }
    @AfterStep
    public void tedDownStep(){
        System.out.println("----After Step---");
    }

}
