package view;

import view.components.*;
import javax.swing.*;
import java.awt.*;

public class ProductView extends BaseView {
    private JTable table;
    private TopPanel topPanel;

    public ProductView() {
        super();

        topPanel = new TopPanel();

        JPanel containerPanel = new JPanel(new BorderLayout());
        containerPanel.setBackground(new Color(230, 230, 230));
        containerPanel.setBorder(BorderFactory.createEmptyBorder(7, 7, 7, 7));
        containerPanel.add(topPanel, BorderLayout.NORTH);

        String[] columns = {
                "Mã SP", "Tên sản phẩm", "Số lượng tồn", "Thương hiệu",
                "Hệ điều hành", "Kích thước màn", "Chip xử lý",
                "Dung lượng pin", "Xuất xứ", "Khu vực kho"
        };
        Object[][] data = {};

        table = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel tablePanel = new JPanel(new BorderLayout());
        tablePanel.setBackground(new Color(230, 230, 230));
        tablePanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
        tablePanel.add(scrollPane, BorderLayout.CENTER);

        containerPanel.add(tablePanel, BorderLayout.CENTER);

        getMainPanel().add(containerPanel, BorderLayout.CENTER);
        table.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ProductView().setVisible(true);
        });
    }
    public JPanel getContentPanel() {
        return mainPanel;
    }

}
