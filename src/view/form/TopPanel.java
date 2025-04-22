package view.form;

import view.components.ButtonUtils;
import view.components.RoundedPanel;
import view.components.TextFieldUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TopPanel extends RoundedPanel {
    public JButton btnAdd, btnEdit, btnDelete, btnDetail, btnExport, btnReload;
    public JTextField txtSearch;
    public JComboBox<String> cbFilter;
    private JPanel leftPanel, rightPanel;

    public TopPanel() {
        super(20);
        this.setLayout(new BorderLayout());
        this.setBackground(Color.WHITE);
        this.setBorder(BorderFactory.createEmptyBorder(0, 6, -1, 6));

        leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        leftPanel.setBackground(Color.WHITE);

        btnAdd = createButton("Thêm", "/images/plus.png");
        btnEdit = createButton("Sửa", "/images/maintenance.png");
        btnDelete = createButton("Xóa", "/images/trash.png");
        btnDetail = createButton("Chi tiết", "/images/info.png");
        btnExport = createButton("Xuất Excel", "/images/xls.png");

        leftPanel.add(btnAdd);
        leftPanel.add(btnEdit);
        leftPanel.add(btnDelete);
        leftPanel.add(btnDetail);
        leftPanel.add(btnExport);

        // Right panel chứa combobox, search và reload
        rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 13, 25));
        rightPanel.setBackground(Color.WHITE);
        rightPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 2));

        cbFilter = new JComboBox<>(new String[]{"Tất cả", "Samsung", "Apple", "Vivo", "Realme"});
        cbFilter.setPreferredSize(new Dimension(120, 30));
        cbFilter.setBackground(Color.WHITE);
        cbFilter.setFocusable(false);

        txtSearch = new JTextField();
        txtSearch.setPreferredSize(new Dimension(190, 31));
        TextFieldUtils.setPlaceholder(txtSearch, "Nhập nội dung tìm kiếm..");

        btnReload = new JButton("Làm mới");
        btnReload.setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        btnReload.setBackground(Color.WHITE);
        btnReload.setPreferredSize(new Dimension(100, 29));
        btnReload.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnReload.setFocusPainted(false);
        btnReload.setFont(new Font("Arial", Font.BOLD, 13));

        rightPanel.add(cbFilter);
        rightPanel.add(txtSearch);
        rightPanel.add(btnReload);

        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.EAST);
    }

    private JButton createButton(String text, String iconPath) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(110, 80));
        button.setFont(new Font("Arial", Font.BOLD, 14));
        button.setBorderPainted(false);
        button.setBackground(Color.WHITE);
        button.setFocusPainted(false);
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));

        ButtonUtils.setIconButton(button, iconPath, 38, 38);

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

        button.setHorizontalTextPosition(SwingConstants.CENTER);
        button.setVerticalTextPosition(SwingConstants.BOTTOM);

        return button;
    }
    public JButton getBtnAdd(){
        return btnAdd;
    }
}
