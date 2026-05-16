import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> items = new ArrayList<>();

    //상품 담기
    public void addItem(Product product) {
        items.add(product);
    }

    //총액 계산
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product product : items) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    //영수증 출력
    public void print() {
        for (Product product : items) {
            System.out.println(product);
        }
        System.out.println("🧾합계 🟰 " + getTotalPrice() + "원");
    }
}