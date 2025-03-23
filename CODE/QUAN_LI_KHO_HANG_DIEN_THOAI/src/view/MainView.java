package view;

import view.components.RoundedPanel;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class MainView extends JFrame {
    private JPanel sidebarPanel, contentPanel, titlePanel, bodyPanel, panel1, panel2, panel3;
    private JButton btnHome, btnProduct, btnStock, btnCustomer, btnEmployee, btnAccount, btnStatistic, btnLogout,btnImport,btnExport,btnSupplier,btnDecentralization;
    private JLabel lblTitle;
    private ImageIcon icon;




    public MainView() {
        setTitle("Hệ Thống Quản Lý Kho Hàng");
        setSize(1300, 870);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        sidebarPanel = new JPanel();
        sidebarPanel.setLayout(new BoxLayout(sidebarPanel, BoxLayout.Y_AXIS));
        sidebarPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.LIGHT_GRAY));
        sidebarPanel.setBackground(new Color(250, 255, 255));

        lblTitle = new JLabel("Admin");
//        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));

        btnHome = createSidebarButton("Trang chủ");
        btnProduct = createSidebarButton("Sản phẩm");
        btnStock = createSidebarButton("Khu vực kho");
        btnImport = createSidebarButton("Phiếu nhập");
        btnExport = createSidebarButton("Phiếu xuất");
        btnCustomer = createSidebarButton("Khách hàng");
        btnSupplier = createSidebarButton("Nhà cung cấp");
        btnEmployee = createSidebarButton("Nhân viên");
        btnAccount = createSidebarButton("Tài khoản");
        btnStatistic = createSidebarButton("Thống kê");
        btnDecentralization = createSidebarButton("Phân quyền");
        btnLogout = createSidebarButton("Đăng xuất");

        createIconButton(btnHome, "/images/iconHome.png");
        createIconButton(btnProduct, "/images/iconProduct.png");
        createIconButton(btnStock, "/images/iconStock.png");
        createIconButton(btnImport, "/images/iconImport.png");
        createIconButton(btnExport, "/images/iconExport.png");
        createIconButton(btnCustomer, "/images/iconCustomer.png");
        createIconButton(btnSupplier, "/images/iconSupplier.png");
        createIconButton(btnEmployee, "/images/iconEmployee.png");
        createIconButton(btnAccount, "/images/iconAccount.png");
        createIconButton(btnStatistic, "/images/iconStatistic.png");
        createIconButton(btnDecentralization, "/images/iconDecentralization.png");
        createIconButton(btnLogout, "/images/iconLogout.png");

        sidebarPanel.add(lblTitle);
        sidebarPanel.add(Box.createVerticalStrut(60));
        JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
        separator.setMaximumSize(new Dimension(Integer.MAX_VALUE, 1));
        sidebarPanel.add(separator);
        sidebarPanel.add(btnHome);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnProduct);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnStock);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnImport);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnExport);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnCustomer);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnSupplier);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnEmployee);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnAccount);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnStatistic);
        sidebarPanel.add(Box.createVerticalStrut(23));
        sidebarPanel.add(btnDecentralization);
        sidebarPanel.add(Box.createVerticalStrut(90));
        sidebarPanel.add(btnLogout);

        contentPanel = new JPanel(new BorderLayout());
        titlePanel = new JPanel();
        titlePanel.setBackground(new Color(250, 255, 255));
        titlePanel.setPreferredSize(new Dimension(0, 200));
        JLabel titleLabel = new JLabel("HỆ THỐNG QUẢN LÝ KHO ĐIỆN THOẠI THEO MÃ IMEI", JLabel.CENTER);
        JLabel label=new JLabel("Quản lý hiệu quả – Thành công vững bền - Công nghệ tiên phong – Dẫn đầu xu hướng!",JLabel.CENTER);
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

        panel1 = createPanel("TÍNH CHÍNH XÁC","Mã IMEl là một số duy nhất được gán cho từng thiết bị điện thoai," +
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

        sidebarPanel.setPreferredSize(new Dimension(200, getHeight())); // 250px rộng hơn
        add(sidebarPanel, BorderLayout.WEST);
        add(contentPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private JButton createSidebarButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 17));
        button.setBorderPainted(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setForeground(Color.BLUE);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                button.setForeground(Color.BLACK);
            }
        });
        return button;
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

    private void createIconButton(JButton button, String imagePath) {
        URL url = getClass().getResource(imagePath);
        if (url != null) {
            ImageIcon icon = new ImageIcon(url);
            Image img = icon.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH); // Resize ảnh
            button.setIcon(new ImageIcon(img));
        } else {
            System.err.println("Không tìm thấy ảnh: " + imagePath);
        }
    }

}
