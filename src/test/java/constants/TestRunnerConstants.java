package constants;

import java.io.File;

public class TestRunnerConstants{

    public static String PATH(String page, String nameImage){
        return System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator + "resources" + File.separator + "images" + File.separator + page + File.separator + nameImage;
    }
}