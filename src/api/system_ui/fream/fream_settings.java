package api.system_ui.fream;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class fream_settings {

    public static void fream_butten_settings(String fream_name,String butten_name, int x_location,int y_location, int x_side, int y_side) {

        Properties pro_name = new Properties();

        try {
            pro_name.load(new FileInputStream("src/api/resources/properties/ui/kind_of_fream.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }

        String fream = pro_name.getProperty(fream_name);

    }

}
