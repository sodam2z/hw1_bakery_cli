public class Product {
    private String name;
    private int price;

    //생성자
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    //메서드 - getter
    public String getName() {
        return this.name;
    }
    //메서드 - getter
    public int getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return name + " - " + price + "원";
    }
}
