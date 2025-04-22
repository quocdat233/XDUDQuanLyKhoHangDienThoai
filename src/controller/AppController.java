package controller;

import view.CustomerView;
import view.EmployeeView;
import view.MainView;
import view.ProductView;

public class AppController {
    private MainView mainView;
    private ProductView productView;
    private CustomerView customerView;
    private EmployeeView employeeView;

    public AppController() {
        initViews();
        addViewsToMainPanel();
        initEventHandlers();
        mainView.setVisible(true);
    }

    private void initViews() {
        mainView = new MainView();
        productView = new ProductView();
        customerView = new CustomerView();
        employeeView = new EmployeeView();
    }

    private void addViewsToMainPanel() {
        mainView.getMainPanel().add(mainView.getContentPanel(), "MainView");
        mainView.getMainPanel().add(productView.getContentPanel(), "ProductView");
        mainView.getMainPanel().add(customerView.getContentPanel(), "CustomerView");
        mainView.getMainPanel().add(employeeView.getContentPanel(), "EmployeeView");
    }

    private void initEventHandlers() {
        mainView.getSidebarMenu().getBtnHome().addActionListener(e ->
                mainView.getCardLayout().show(mainView.getMainPanel(), "MainView"));

        mainView.getSidebarMenu().getBtnProduct().addActionListener(e ->
                mainView.getCardLayout().show(mainView.getMainPanel(), "ProductView"));

        mainView.getSidebarMenu().getBtnCustomer().addActionListener(e ->
                mainView.getCardLayout().show(mainView.getMainPanel(), "CustomerView"));
        mainView.getSidebarMenu().getBtnEmployee().addActionListener(e ->
                mainView.getCardLayout().show(mainView.getMainPanel(), "EmployeeView"));
    }

    public static void main(String[] args) {
        new AppController();
    }
}

