package api.system_ui.fream;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class new_fream {

    public static void new_fream(String fream_name, int fream_size_x, int fream_size_y) {

        Properties pro_name = new Properties();
        Properties pro_settings = new Properties();

        try {
            pro_name.load(new FileInputStream("src/api/resources/properties/ui/kind_of_fream.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }

        try {
            pro_settings.load(new FileInputStream("src/api/resources/properties/ui/fream_setting.properties"));
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);
        }

        // 프레임 생성
        JFrame frame_name = new JFrame(fream_name);
        // 프레임 크기 설정
        frame_name.setSize(fream_size_x, fream_size_y);

        // 프레임을 화면 가운데에 배치
        frame_name.setLocationRelativeTo(null);

        // 프레임을 닫았을 때 메모리에서 제거되도록 설정
        frame_name.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 레이아웃 설정
        frame_name.getContentPane().setLayout(null);

        frame_name.setVisible(true);

        pro_name.setProperty(fream_name,fream_name);
        pro_settings.setProperty(fream_name + "_x_side", String.valueOf(fream_size_x));
        pro_settings.setProperty(fream_name + "_y_side", String.valueOf(fream_size_y));

        try {
            pro_name.save(new FileOutputStream("src/api/resources/properties/ui/kind_of_fream.properties"),"");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);

        }

        try {
            pro_settings.save(new FileOutputStream("src/api/resources/properties/ui/fream_setting.properties"),"");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "파일 불러오기 오류 -> " + e);

        }


    }

}
