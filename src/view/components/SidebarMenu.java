package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class SidebarMenu extends JPanel {
    private JButton btnHome, btnProduct, btnStock, btnCustomer, btnEmployee, btnAccount, btnStatistic, btnLogout, btnImport, btnExport, btnSupplier, btnDecentralization;

    public SidebarMenu(SidebarMenu sideBarMenu) {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createMatteBorder(0, 0, 0, 1, Color.LIGHT_GRAY));
        setBackground(new Color(250, 255, 255));

        JLabel lblTitle = new JLabel("Admin");
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

        ButtonUtils.setIconButton(btnHome, "/images/iconHome.png");
        ButtonUtils.setIconButton(btnProduct, "/images/iconProduct.png");
        ButtonUtils.setIconButton(btnStock, "/images/iconStock.png");
        ButtonUtils.setIconButton(btnImport, "/images/iconImport.png");
        ButtonUtils.setIconButton(btnExport, "/images/iconExport.png");
        ButtonUtils.setIconButton(btnCustomer, "/images/iconCustomer.png");
        ButtonUtils.setIconButton(btnSupplier, "/images/iconSupplier.png");
        ButtonUtils.setIconButton(btnEmployee, "/images/iconEmployee.png");
        ButtonUtils.setIconButton(btnAccount, "/images/iconAccount.png");
        ButtonUtils.setIconButton(btnStatistic, "/images/iconStatistic.png");
        ButtonUtils.setIconButton(btnDecentralization, "/images/iconDecentralization.png");
        ButtonUtils.setIconButton(btnLogout, "/images/iconLogout.png");

        add(lblTitle);
        add(Box.createVerticalStrut(60));
        add(new JSeparator(SwingConstants.HORIZONTAL));
        add(btnHome);
        add(Box.createVerticalStrut(20));
        add(btnProduct);
        add(Box.createVerticalStrut(20));
        add(btnStock);
        add(Box.createVerticalStrut(20));
        add(btnImport);
        add(Box.createVerticalStrut(20));
        add(btnExport);
        add(Box.createVerticalStrut(20));
        add(btnCustomer);
        add(Box.createVerticalStrut(20));
        add(btnSupplier);
        add(Box.createVerticalStrut(20));
        add(btnEmployee);
        add(Box.createVerticalStrut(20));
        add(btnAccount);
        add(Box.createVerticalStrut(20));
        add(btnStatistic);
        add(Box.createVerticalStrut(20));
        add(btnDecentralization);
        add(Box.createVerticalStrut(90));
        add(btnLogout);
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


}
