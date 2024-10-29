package steps;

import io.cucumber.java.pt.Dado;
import org.sikuli.script.FindFailed;
import pages.DemoPage;

public class DemoSteps {
    DemoPage demoPage = new DemoPage();

    @Dado("que realize login")
    public void que_realize_login() throws FindFailed {
        demoPage.realizar_login("user", "password");
        demoPage.validar_login_efetuado();
    }
}
