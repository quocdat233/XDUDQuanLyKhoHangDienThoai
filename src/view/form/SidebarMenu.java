package view.form;

import view.components.ButtonUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;

public class SidebarMenu extends JPanel {
    private JButton btnHome, btnProduct, btnStock, btnCustomer, btnEmployee, btnAccount, btnStatistic, btnLogout, btnImport, btnExport, btnSupplier, btnDecentralization;

    public SidebarMenu(SidebarMenu sideBarMenu) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.LIGHT_GRAY));
        setBackground(new Color(250, 255, 255));

        URL url = ButtonUtils.class.getResource("/images/admin.png");
        ImageIcon icon = new ImageIcon(url);
        Image img = icon.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        JLabel lblTitle = new JLabel(" admin");
        lblTitle.setBorder(BorderFactory.createEmptyBorder(10, 5, 0, 20));
        lblTitle.setIcon(new ImageIcon(img));
        lblTitle.setFont(new Font("Arial", Font.BOLD, 25));

        btnHome = createSidebarButton("  Trang chủ");
        btnProduct = createSidebarButton("  Sản phẩm");
        btnStock = createSidebarButton("  Khu vực kho");
        btnImport = createSidebarButton("  Phiếu nhập");
        btnExport = createSidebarButton("  Phiếu xuất");
        btnCustomer = createSidebarButton("  Khách hàng");
        btnSupplier = createSidebarButton("  Tin nhắn");
        btnEmployee = createSidebarButton("  Nhân viên");
        btnAccount = createSidebarButton("  Tài khoản");
        btnStatistic = createSidebarButton("  Thống kê");
        btnDecentralization = createSidebarButton("  Phân quyền");
        btnLogout = createSidebarButton("  Đăng xuất");

        ButtonUtils.setIconButton(btnHome, "/images/iconHome.png",27,27);
        ButtonUtils.setIconButton(btnProduct, "/images/iconProduct.png",27,27);
        ButtonUtils.setIconButton(btnStock, "/images/iconStock.png",27,27);
        ButtonUtils.setIconButton(btnImport, "/images/iconImport.png",27,27);
        ButtonUtils.setIconButton(btnExport, "/images/iconExport.png",27,27);
        ButtonUtils.setIconButton(btnCustomer, "/images/iconCustomer.png",27,27);
        ButtonUtils.setIconButton(btnSupplier, "/images/message.png",27,27);
        ButtonUtils.setIconButton(btnEmployee, "/images/iconEmployee.png",27,27);
        ButtonUtils.setIconButton(btnAccount, "/images/iconAccount.png",27,27);
        ButtonUtils.setIconButton(btnStatistic, "/images/iconStatistic.png",27,27);
        ButtonUtils.setIconButton(btnDecentralization, "/images/iconDecentralization.png",27,27);
        ButtonUtils.setIconButton(btnLogout, "/images/iconLogout.png",27,27);

        add(lblTitle);
        add(Box.createVerticalStrut(25));
        add(new JSeparator(SwingConstants.HORIZONTAL));
        add(btnHome);
        add(Box.createVerticalStrut(23));
        add(btnProduct);
        add(Box.createVerticalStrut(23));
        add(btnStock);
        add(Box.createVerticalStrut(23));
        add(btnImport);
        add(Box.createVerticalStrut(23));
        add(btnExport);
        add(Box.createVerticalStrut(23));
        add(btnCustomer);
        add(Box.createVerticalStrut(23));
        add(btnSupplier);
        add(Box.createVerticalStrut(23));
        add(btnEmployee);
        add(Box.createVerticalStrut(23));
        add(btnAccount);
        add(Box.createVerticalStrut(23));
        add(btnStatistic);
        add(Box.createVerticalStrut(23));
        add(btnDecentralization);
        add(Box.createVerticalStrut(75));
        add(btnLogout);
    }

    private JButton createSidebarButton(String text) {
        JButton button = new JButton(text);
        button.setFont(new Font("Arial", Font.PLAIN, 17));

        button.setBorderPainted(false);
        button.setBackground(Color.WHITE);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(Color.decode("#BBDEFA"));
            }
            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(Color.WHITE);
            }
        });
        return button;
    }
    public JButton getBtnHome() {
        return btnHome;
    }

    public JButton getBtnProduct() {
        return btnProduct;
    }
    public JButton getBtnCustomer(){
        return btnCustomer;
    }
    public JButton getBtnEmployee(){
        return btnEmployee;
    }



}
