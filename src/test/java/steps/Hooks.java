package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void beforeScenarios() {
        System.out.println("This method run before scenario !");
    }

    @After
    public void afterScenarios() {
        System.out.println("This method run after scenario !");
    }
}
