package view;

import view.components.RoundedPanel;
import view.components.SidebarMenu;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;

public class MainView extends JFrame {
    private SidebarMenu sideBarMenu;
    private JPanel contentPanel, titlePanel, bodyPanel, panel1, panel2, panel3;

    public MainView() {
        setTitle("Hệ Thống Quản Lý Kho Hàng");
        setSize(1300, 870);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        contentPanel = new JPanel(new BorderLayout());
        titlePanel = new JPanel();
        titlePanel.setBackground(new Color(250, 255, 255));
        titlePanel.setPreferredSize(new Dimension(0, 200));
        JLabel titleLabel = new JLabel("HỆ THỐNG QUẢN LÝ KHO ĐIỆN THOẠI THEO MÃ IMEI", JLabel.CENTER);
        JLabel label = new JLabel("Quản lý hiệu quả – Thành công vững bền - Công nghệ tiên phong – Dẫn đầu xu hướng!", JLabel.CENTER);
        titleLabel.setForeground(new Color(43, 137, 143));
        label.setForeground(new Color(43, 137, 143));

        titleLabel.setBorder(BorderFactory.createEmptyBorder(90, 0, 0, 0)); // 30px trên, 10px dưới
        titleLabel.setFont(new Font("Arial", Font.BOLD, 30));
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0)); // 30px trên, 10px dưới

        titlePanel.add(titleLabel);
        titlePanel.add(label);

        bodyPanel = new JPanel(new GridLayout(1, 3, 70, 0)); // Giảm khoảng cách từ 40 xuống 20
        bodyPanel.setBackground(Color.decode("#F0F7FA"));
        bodyPanel.setBorder(BorderFactory.createEmptyBorder(60, 60, 70, 60)); // Giảm padding 2 bên và trên dưới

        panel1 = createPanel("TÍNH CHÍNH XÁC", "Mã IMEl là một số duy nhất được gán cho từng thiết bị điện thoai," +
                " do đó hệ thống quản lý điện thoại theo mã IMEI sẽ đảm bảo tính chính xác và độ tin cậy cao.");

        panel2 = createPanel("TÍNH BẢO MẬT", "Ngăn chặn việc sử dụng các thiết bị điện thoại giả mạo hoặc bị đánh cắp." +
                "Điều này giúp tăng tính bảo mật cho các hoạt động quản lý điện thoại.");
        panel3 = createPanel("TÍNH HIỆU QUẢ", "Dễ dàng xác định được thông tin về từng thiết bị điện thoại một cách nhanh " +
                "chóng và chính xác, giúp cho việc quản lý điện thoại được thực hiện một cách hiệu quả hơn");

        bodyPanel.add(panel1);
        bodyPanel.add(panel2);
        bodyPanel.add(panel3);

        contentPanel.add(titlePanel, BorderLayout.NORTH);
        contentPanel.add(bodyPanel, BorderLayout.CENTER);

        sideBarMenu = new SidebarMenu(sideBarMenu);
        add(sideBarMenu, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);
        setVisible(true);
    }


    private JPanel createPanel(String title, String description) {
        RoundedPanel panel = new RoundedPanel(40);
        panel.setBackground(new Color(250, 255, 255));
        panel.setLayout(new BorderLayout());
        panel.setPreferredSize(new Dimension(250, 0));

        JLabel titleLabel = new JLabel(title, JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(43, 137, 143));
        titleLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JTextPane descPane = new JTextPane();
        descPane.setText(description);
        descPane.setFont(new Font("Arial", Font.PLAIN, 14));
        descPane.setOpaque(false);
        descPane.setEditable(false);
        descPane.setFocusable(false);

        StyledDocument doc = descPane.getStyledDocument();
        SimpleAttributeSet justify = new SimpleAttributeSet();
        StyleConstants.setAlignment(justify, StyleConstants.ALIGN_JUSTIFIED);
        doc.setParagraphAttributes(0, doc.getLength(), justify, false);

        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(descPane, BorderLayout.CENTER);

        return panel;
    }
}