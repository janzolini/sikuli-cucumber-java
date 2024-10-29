package pages;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class BasePage {
    private final Screen screen = new Screen();

    public void send_keys(String path, String value) throws FindFailed {
        screen.wait(path, 10);
        screen.click(path);
        screen.type(value);
    }

    public void click(String path) throws FindFailed {
        screen.wait(path, 10);
        screen.click(path);
    }

    public void doubleClick(String path) throws FindFailed {
        screen.wait(path, 10);
        screen.doubleClick(path);
    }

    public boolean is_present(String path){
        return screen.exists(path) != null;
    }
}
