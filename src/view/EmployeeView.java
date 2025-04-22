package view;

import view.form.BaseView;
import view.form.TopPanel;

import javax.swing.*;
import java.awt.*;

public class EmployeeView extends BaseView{


        private JTable table;
        private TopPanel topPanel;
        public EmployeeView(){
            super();
            topPanel = new TopPanel();

            JPanel container = new JPanel(new BorderLayout());
            container.setBackground(new Color(230, 230, 230));
            container.setBorder(BorderFactory.createEmptyBorder(7,7,7,7));
            container.add(topPanel,BorderLayout.NORTH);



            String[] colums = {"Mã nhân viên","Họ tên","Giới tính","Số điện thoại","Ngày sinh","Email"};

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
                new view.CustomerView().setVisible(true);
            });
        }
        public JPanel getContentPanel() {

            return mainPanel;
        }
        public TopPanel getTopPanel() {
            return topPanel;
        }


    }




