package view;

import view.components.RoundedPanel;
import view.form.SidebarMenu;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.net.URL;
import view.form.BaseView;

public class MainView extends BaseView {
    private SidebarMenu sideBarMenu;
    private JPanel contentPanel, titlePanel, bodyPanel, panel1, panel2, panel3,panelExactly,panelSecurity,panelEffectiveness;

    public MainView() {


        contentPanel = new JPanel(new BorderLayout());
        titlePanel = new JPanel();
        titlePanel.setBackground(new Color(250, 255, 255));
        titlePanel.setPreferredSize(new Dimension(0, 190));


        JLabel titleLabel = new JLabel("HỆ THỐNG QUẢN LÝ KHO ĐIỆN THOẠI THEO MÃ IMEI", JLabel.CENTER);
        JLabel label = new JLabel("Quản lý hiệu quả – Thành công vững bền - Công nghệ tiên phong – Dẫn đầu xu hướng!", JLabel.CENTER);
        titleLabel.setForeground(new Color(43, 137, 143));
        label.setForeground(new Color(43, 137, 143));

        titleLabel.setFont(new Font("Arial", Font.BOLD, 34));
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(40, 0, 10, 0));

        titlePanel.add(titleLabel);
        titlePanel.add(label);

        bodyPanel = new JPanel(new GridLayout(1, 3, 70, 0));
        bodyPanel.setBackground(Color.decode("#F0F7FA"));
        bodyPanel.setBorder(BorderFactory.createEmptyBorder(60, 60, 70, 60));

        panelExactly = createPanelImage("/images/accuracy.png");
        panelSecurity =createPanelImage("/images/security.png");
        panelEffectiveness =createPanelImage("/images/effectiveness.png");

        panel1 = createPanel("TÍNH CHÍNH XÁC", "Mã IMEI là một số duy nhất được gán cho từng thiết bị điện thoại, do đó hệ thống quản lý điện thoại theo mã IMEI sẽ đảm bảo tính chính xác và độ tin cậy cao.", "/images/accuracy.png");
        panel2 = createPanel("TÍNH BẢO MẬT", "Ngăn chặn việc sử dụng các thiết bị điện thoại giả mạo hoặc bị đánh cắp. Điều này giúp tăng tính bảo mật cho các hoạt động quản lý điện thoại.", "/images/security.png");
        panel3 = createPanel("TÍNH HIỆU QUẢ", "Dễ dàng xác định được thông tin về từng thiết bị điện thoại một cách nhanh chóng và chính xác, giúp cho việc quản lý điện thoại được thực hiện một cách hiệu quả hơn.", "/images/effectiveness.png");

        bodyPanel.add(panel1);
        bodyPanel.add(panel2);
        bodyPanel.add(panel3);

        contentPanel.add(titlePanel, BorderLayout.NORTH);
        contentPanel.add(bodyPanel, BorderLayout.CENTER);


        getMainPanel().add(contentPanel, BorderLayout.CENTER);
    }



    private JPanel createPanelImage(String imagePath){
        RoundedPanel panel = new RoundedPanel(40);
        panel.setBackground(new Color(250, 255, 255));
        URL url = MainView.class.getResource(imagePath);
        if(url !=null){
            ImageIcon icon = new ImageIcon(url);
            Image img = icon.getImage().getScaledInstance(150,150,Image.SCALE_SMOOTH);
            JLabel labelImage = new JLabel(new ImageIcon(img));
            panel.add(labelImage);
        }
        else {
            System.err.println("Không tìm thấy ảnh: " + imagePath);
        }
        return panel;
    }


    private JPanel createPanel(String title, String description, String imagePath) {
        RoundedPanel panel = new RoundedPanel(40);
        panel.setBackground(new Color(250, 255, 255));
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        // Panel chứa hình ảnh
        JPanel imagePanel = createPanelImage(imagePath);
        imagePanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        imagePanel.setBorder(BorderFactory.createEmptyBorder(25, 0, 10, 0));
        panel.add(imagePanel);

        // Tiêu đề
        JLabel titleLabel = new JLabel(title, JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 25));
        titleLabel.setForeground(new Color(43, 137, 143));
        titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        panel.add(titleLabel);

        // Mô tả
        JTextPane descPane = new JTextPane();
        descPane.setForeground(new Color(109, 110, 113));
        descPane.setText(description);
        descPane.setFont(new Font("Arial", Font.PLAIN, 14));
        descPane.setOpaque(false);
        descPane.setEditable(false);
        descPane.setFocusable(false);
        descPane.setBorder(BorderFactory.createEmptyBorder(10, 30, 10, 30));

        // Căn đều văn bản
        StyledDocument doc = descPane.getStyledDocument();
        SimpleAttributeSet justify = new SimpleAttributeSet();
        StyleConstants.setAlignment(justify, StyleConstants.ALIGN_JUSTIFIED);
        doc.setParagraphAttributes(0, doc.getLength(), justify, false);

        descPane.setAlignmentX(Component.CENTER_ALIGNMENT);
        panel.add(descPane);

        return panel;
    }public JPanel getContentPanel() {
        return contentPanel;
    }







}