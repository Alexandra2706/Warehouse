package Controller;

import Model.BaseProduct;
import Model.Category;
import Model.Dairy;
import Model.ProductDetail;
import Service.Warehouse;
import View.ListView;
import View.ProductView;

public class Controller {
    private Warehouse warehouse;
    private ListView listView;
    private ProductView productView;

    public Controller() {
        warehouse = new Warehouse();
        listView = new ListView();
        productView = new ProductView();
    }

    public void run() {
        System.out.println("----------Добавление товара на склад----------\n");
        // Создание товаров
        ProductDetail milkDetail = new ProductDetail("Жирность", "3.2");
        Dairy milk = new Dairy("Молоко", 8, 5.0, Category.PRODUCTS, milkDetail, "01/03/2024");
        ProductDetail cheeseDetail = new ProductDetail("Жирность", "40");
        Dairy cheese = new Dairy("Сыр", 15, 23.0, Category.PRODUCTS, cheeseDetail, "05/04/2024");
        ProductDetail butterDetail = new ProductDetail("Жирность", "82.5");
        Dairy butter = new Dairy("Масло", 7, 19.0, Category.PRODUCTS, butterDetail, "23/03/2024");
        BaseProduct puzzles = new BaseProduct("Пазлы", 20, 10.0, Category.TOYS);
        BaseProduct doll = new BaseProduct("Кукла", 6, 30.0, Category.TOYS);
        // Добавление товаров на склад
        warehouse.addProduct(milk);
        warehouse.addProduct(cheese);
        warehouse.addProduct(butter);
        warehouse.addProduct(puzzles);
        warehouse.addProduct(doll);
        listView.printList(warehouse.getProductList());
        System.out.println("\n----------Удаление товара со склада----------\n");
        // Удаление товара со склада
        warehouse.removeProduct(doll);
        listView.printList(warehouse.getProductList());
        System.out.println("\n----------Изменение количества товара----------\n");
        // Изменение количества товара
        warehouse.increasingQuantity(20, milk);
        productView.printProduct(milk);
        warehouse.decreasingQuantity(2, puzzles);
        productView.printProduct(puzzles);
        System.out.println("\n---------Обработка заказа----------\n");
        warehouse.processOrder(cheese, 10);
        warehouse.processOrder(butter, 10);
        System.out.println("\n---------Остаток на складе----------\n");
        listView.printList(warehouse.getProductList());

    }
}