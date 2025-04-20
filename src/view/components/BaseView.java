package view.components;

import javax.swing.*;
import java.awt.*;
public class BaseView extends JFrame {
    protected JPanel mainPanel;
    protected CardLayout cardLayout;
    private SidebarMenu sidebarMenu;

    public BaseView() {
        setTitle("Hệ Thống Quản Lý Kho Hàng");
        setSize(1300, 870);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        sidebarMenu = new SidebarMenu(sidebarMenu);
        add(sidebarMenu, BorderLayout.WEST);

        // CardLayout để chuyển giữa các view
        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);
        add(mainPanel, BorderLayout.CENTER);
    }

    public SidebarMenu getSidebarMenu() {
        return sidebarMenu;
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }

    public CardLayout getCardLayout() {
        return cardLayout;
    }
}
