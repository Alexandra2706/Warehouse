package Model;

public class Dairy extends BaseProduct {
    private ProductDetail productDetail;
    private String expirationDate;

    public Dairy(String name, int quantity, double price, Category category, ProductDetail productDetail,
            String expirationDate) {
        super(name, quantity, price, category);
        this.productDetail = productDetail;
        this.expirationDate = expirationDate;
    }

    public Dairy() {
    }

    @Override
    public String toString() {
        return "Товар: Категория: " + category + "\n\tМолочная продукция: " + name + ", Количество: " + quantity
                + ", цена: "
                + price + "\n\tХарактеристики товара: " + productDetail.getDetail() + "\n\tCрок годности: "
                + expirationDate;
    }

}
