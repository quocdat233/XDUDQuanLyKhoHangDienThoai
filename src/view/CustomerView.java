package view;

import view.form.BaseView;
import view.form.TopPanel;

import javax.swing.*;
import java.awt.*;

public class CustomerView extends BaseView {

        private JTable table;
        private TopPanel topPanel;
        public CustomerView(){
            super();
            topPanel = new TopPanel();

            JPanel container = new JPanel(new BorderLayout());
            container.setBackground(new Color(230, 230, 230));
            container.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
            container.add(topPanel,BorderLayout.NORTH);



            String[] colums = {"Mã khách hàng","Tên khách hàng","Địa chỉ","Số điện thoại","Ngày tham gia"};

            Object[][] data = {};

            table = new JTable(data,colums);
            JScrollPane scrollPane = new JScrollPane(table);
            JPanel tablePanal = new JPanel(new BorderLayout());
            tablePanal.setBackground(new Color(230, 230, 230));
            tablePanal.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 0));
            tablePanal.add(scrollPane,BorderLayout.CENTER);

            container.add(tablePanal,BorderLayout.CENTER);
            getMainPanel().add(container,BorderLayout.CENTER);
            table.setBackground(Color.WHITE);

        }
        public static void main(String[] args) {
            SwingUtilities.invokeLater(() -> {
                new CustomerView().setVisible(true);
            });
        }
        public JPanel getContentPanel() {

            return mainPanel;
        }
        public TopPanel getTopPanel() {
            return topPanel;
        }


    }


