package pages;

import org.junit.Assert;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import static constants.TestRunnerConstants.PATH;

public class DemoPage extends BasePage {

    private final Screen screen = new Screen();

    public void realizar_login(String user, String password) throws FindFailed {
        send_keys(PATH("login_page", "input_usuario.png") , user);
        send_keys(PATH("login_page","input_senha.png") , password);
        screen.click(PATH("login_page", "button_entrar.png"));
    }

    public void validar_login_efetuado() throws FindFailed {
        screen.wait(PATH("login_page", "icon_isodonto.png"), 10);
        Assert.assertTrue(is_present(PATH("login_page", "icon_isodonto.png")));
    }
}
