package controller;

import view.ProductView;
import view.components.AddProductForm;

public class ProductViewController {
    private ProductView view;

    public ProductViewController(ProductView view) {
        this.view = view;
        initController();
    }

    private void initController() {
        view.getTopPanel().getBtnAdd().addActionListener(e -> openAddProductForm());
    }

    private void openAddProductForm() {

        AddProductForm form = new AddProductForm();
        form.setVisible(true);
    }

}
