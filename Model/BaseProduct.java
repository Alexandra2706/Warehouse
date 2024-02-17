package Model;

public class BaseProduct implements ProductInterface {
    protected String name;
    protected int quantity;
    protected double price;
    protected Category category;

    public BaseProduct(String name, int quantity, double price, Category category) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public BaseProduct() {
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Товар: Категория: " + category + "\n\tНаименование: " + name + ", Количество: " + quantity
                + ", Цена: " + price;
    }

}
