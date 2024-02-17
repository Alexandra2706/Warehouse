package Service;

import Model.BaseProduct;

public interface ManageQuantityProduct {

    public void increasingQuantity(int quantity, BaseProduct product);

    public void decreasingQuantity(int quantity, BaseProduct product);
}
