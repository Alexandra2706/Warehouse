package Model;

public class ProductDetail implements Detail {
    private String characterName;
    private String value;

    public ProductDetail(String characterName, String value) {
        this.characterName = characterName;
        this.value = value;
    }

    public ProductDetail() {
    }

    @Override
    public String getDetail() {
        return characterName + ": " + value;
    }

    @Override
    public String toString() {
        return "Характеристики товара:\n\tНазвание характеристики: " + characterName + ", значение: " + value;
    }

}
