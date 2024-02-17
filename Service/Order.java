package Service;

import Model.BaseProduct;

public interface Order {
    void processOrder(BaseProduct product, int amount);
}
