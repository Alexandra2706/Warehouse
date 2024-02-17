package Service;

import java.util.List;

import Model.BaseProduct;

public interface ManageWarehouse {
    void addProduct(BaseProduct product);

    void removeProduct(BaseProduct product);

    List<BaseProduct> getProductList();
}
