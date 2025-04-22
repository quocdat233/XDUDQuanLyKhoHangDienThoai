package view.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class AddProductForm extends JDialog {
    private JTextField txtProductName, txtOrigin, txtChip, txtBattery, txtScreenSize, txtRearCamera, txtFrontCamera;
    private JTextField txtOS, txtVersion, txtWarranty, txtBrand, txtWarehouse, txtROM, txtRAM, txtColor, txtImportPrice, txtExportPrice;
    private JLabel lblImagePreview;
    private JPanel panelTop, panelBottom;
    private JPanel panelContainer, panelImage, panelContent;
    private JButton btnSave, btnCancel;

    public AddProductForm() {
        setTitle("Thêm sản phẩm");
        setSize(1100, 500);
        setLocationRelativeTo(null);
        setModal(true);
        setLayout(new BorderLayout());

        btnSave = new JButton("Lưu thông tin");
        btnCancel = new JButton("Hủy");


        // Panel Top
        panelTop = new JPanel(new BorderLayout());
        JLabel lblTitle = new JLabel("THÊM SẢN PHẨM");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setVerticalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 20));
        lblTitle.setForeground(Color.WHITE);
        panelTop.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0));
        panelTop.setBackground(Color.decode("#187AC3"));
        panelTop.add(lblTitle, BorderLayout.CENTER);

        // Panel Image
        panelImage = new JPanel();
        lblImagePreview = new JLabel("Click để chọn ảnh", SwingConstants.CENTER);
        lblImagePreview.setPreferredSize(new Dimension(250, 330));
        panelImage.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
        lblImagePreview.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        panelImage.add(lblImagePreview);

        // Panel Content
        panelContent = new JPanel(new GridLayout(8, 4, 17, 0));
        panelContent.setBorder(BorderFactory.createEmptyBorder(15, 23, 20, 20));

        panelContent.add(new JLabel("Tên sản phẩm:"));
        panelContent.add(new JLabel("Xuất xứ"));
        panelContent.add(new JLabel("Chip"));
        panelContent.add(new JLabel("Dung lượng pin"));

        txtProductName = new JTextField();
        panelContent.add(txtProductName);

        txtOrigin = new JTextField();
        panelContent.add(txtOrigin);

        txtChip = new JTextField();
        panelContent.add(txtChip);

        txtBattery = new JTextField();
        panelContent.add(txtBattery);

        panelContent.add(new JLabel("Kích thước màn hình"));
        panelContent.add(new JLabel("Camera sau"));
        panelContent.add(new JLabel("Camera trước"));
        panelContent.add(new JLabel("Hệ điều hành"));

        txtScreenSize = new JTextField();
        panelContent.add(txtScreenSize);

        txtRearCamera = new JTextField();
        panelContent.add(txtRearCamera);

        txtFrontCamera = new JTextField();
        panelContent.add(txtFrontCamera);

        txtOS = new JTextField();
        panelContent.add(txtOS);

        panelContent.add(new JLabel("Màu sắc"));
        panelContent.add(new JLabel("Thời gian bảo hành"));
        panelContent.add(new JLabel("Thương hiệu"));
        panelContent.add(new JLabel("Khu vực kho"));

        txtColor = new JTextField();
        panelContent.add(txtColor);

        txtWarranty = new JTextField();
        panelContent.add(txtWarranty);

        txtBrand = new JTextField();
        panelContent.add(txtBrand);

        txtWarehouse = new JTextField();
        panelContent.add(txtWarehouse);

        panelContent.add(new JLabel("ROM"));
        panelContent.add(new JLabel("RAM"));
        panelContent.add(new JLabel("Giá nhập"));
        panelContent.add(new JLabel("Giá xuất"));

        txtROM = new JTextField();
        panelContent.add(txtROM);

        txtRAM = new JTextField();
        panelContent.add(txtRAM);

        txtImportPrice = new JTextField();
        panelContent.add(txtImportPrice);

        txtExportPrice = new JTextField();
        panelContent.add(txtExportPrice);

        // Panel Container
        panelContainer = new JPanel(new BorderLayout());
        panelContainer.add(panelImage, BorderLayout.WEST);
        panelContainer.add(panelContent, BorderLayout.CENTER);

        add(panelTop, BorderLayout.NORTH);
        add(panelContainer, BorderLayout.CENTER);

        // Buttons
        JPanel buttonPanel = new JPanel();
         btnSave = new JButton("Lưu thông tin");
         btnCancel = new JButton("Hủy");
        buttonPanel.add(btnSave);
        buttonPanel.add(btnCancel);
        add(buttonPanel, BorderLayout.SOUTH);

        // Image click event — click vào label để chọn ảnh
        lblImagePreview.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Image files", "jpg", "png", "gif"));

                int result = fileChooser.showOpenDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();
                    ImageIcon imageIcon = new ImageIcon(selectedFile.getAbsolutePath());
                    Image image = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    lblImagePreview.setIcon(new ImageIcon(image));
                    lblImagePreview.setText("");
                }
            }
        });



    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public static void main(String[] args) {
        new AddProductForm().setVisible(true);
    }

}
