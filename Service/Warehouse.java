package Service;

import java.util.ArrayList;
import java.util.List;

import Model.BaseProduct;

public class Warehouse implements ManageWarehouse, ManageQuantityProduct, Order {
    private List<BaseProduct> products;

    public Warehouse() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(BaseProduct product) {
        for (BaseProduct item : products) {
            if (item.getName().equals(product.getName())) {
                System.out.println("Такой продукт существует");
                return;
            }
        }
        products.add(product);
    }

    @Override
    public void removeProduct(BaseProduct product) {
        for (BaseProduct item : products) {
            if (item.getName().equals(product.getName())) {
                products.remove(item);
                return;
            }
        }
    }

    @Override
    public void increasingQuantity(int quantity, BaseProduct product) {
        for (BaseProduct item : products) {
            if (item.getName().equals(product.getName())) {
                item.setQuantity(item.getQuantity() + quantity);
            }
        }

    }

    @Override
    public void decreasingQuantity(int quantity, BaseProduct product) {
        for (BaseProduct item : products) {
            if (item.getName().equals(product.getName())) {
                if (item.getQuantity() >= quantity) {
                    item.setQuantity(item.getQuantity() - quantity);
                } else {
                    System.out.println("Товара недостаточно на складе");
                }
            }
        }
    }

    @Override
    public List<BaseProduct> getProductList() {
        return products;
    }

    public void printList() {
        for (BaseProduct item : products) {
            System.out.println(item);
        }
    }

    @Override
    public void processOrder(BaseProduct product, int amount) {
        for (BaseProduct item : products) {
            if (item.getName().equals(product.getName())) {
                if (item.getQuantity() >= amount) {
                    item.setQuantity(item.getQuantity() - amount);
                    System.out.println("Товар " + item.getName() + " отгружен в количестве " + amount);
                } else {
                    System.out.println("Товара " + item.getName() + " недостаточно на складе, можно отгрузить только "
                            + item.getQuantity());
                }
            }
        }
    }

}
