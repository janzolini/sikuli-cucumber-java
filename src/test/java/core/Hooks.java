package core;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import pages.BasePage;

import static constants.TestRunnerConstants.PATH;

public class Hooks extends BasePage {

    @Before
    public void before() {
        String path = "system/path";
        App.open(path);
    }

    @After
    public void after(Scenario scenario) throws FindFailed, InterruptedException {
        Thread.sleep(1500);
        click(PATH("login_page", "button_close.png"));
    }
}
