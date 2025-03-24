package view.components;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ButtonUtils {
    public static void setIconButton(JButton button, String imagePath) {
        URL url = ButtonUtils.class.getResource(imagePath);
        if (url != null) {
            ImageIcon icon = new ImageIcon(url);
            Image img = icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH); // Resize ảnh
            button.setIcon(new ImageIcon(img));
        } else {
            System.err.println("Không tìm thấy ảnh: " + imagePath);
        }
    }
}
