package View;

import java.util.List;

import Model.BaseProduct;

public class ListView {
    public void printList(List<? extends BaseProduct> list) {
        System.out.println("Список товаров на складе:");
        for (BaseProduct item : list) {
            System.out.println(item);
        }
    }
}
