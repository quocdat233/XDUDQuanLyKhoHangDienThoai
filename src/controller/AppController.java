package controller;

import view.MainView;
import view.ProductView;

public class AppController {
    private MainView mainView;
    private ProductView productView;

    public AppController() {
        mainView = new MainView();
        productView = new ProductView();

        mainView.getMainPanel().add(new MainView().getContentPanel(), "MainView");
        mainView.getMainPanel().add(productView.getContentPanel(), "ProductView");

        mainView.getSidebarMenu().getBtnHome().addActionListener(e -> {
            mainView.getCardLayout().show(mainView.getMainPanel(), "MainView");
        });

        mainView.getSidebarMenu().getBtnProduct().addActionListener(e -> {
            mainView.getCardLayout().show(mainView.getMainPanel(), "ProductView");
        });

        mainView.setVisible(true);
    }

    public static void main(String[] args) {
        new AppController();
    }
}
