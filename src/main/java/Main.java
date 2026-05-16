import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);

    System.out.println("어서오세요👐🏻 빵집입니다👩🏻‍🍳");

        while (true) {
            System.out.println("=====🥨 메뉴판 🥨=====");
            System.out.println("[빵 🍞]");
            System.out.println("1. 소금빵 🥐 - 2500원");
            System.out.println("2. 베이글 🥯 - 3000원");
            System.out.println("[음료 🥤]");
            System.out.println("3. 커피(핫/아이스) ☕️ - 3500원");
            System.out.println("4. 아이스티 🍹- 4000원");
            System.out.println("0. 주문완료 ✅");

            System.out.print("번호를 입력하세요: ");
            String choice = scanner.nextLine();

            switch (choice){
                case "0":
                    order.print();
                    System.out.println("감사합니다 :) 좋은 하루 보내세요😊");
                    return;

                case "1":
                    order.addItem(new SaltBread());
                    break;
                case  "2":
                    order.addItem(new Bagel());
                    break;
                case "3":
                    System.out.println("1: 아이스 / 2: 핫");
                    String icedInput;
                    while (true) {
                        System.out.print("번호를 입력하세요: ");
                        icedInput = scanner.nextLine();
                        if (icedInput.equals("1") || icedInput.equals("2")) break;
                        System.out.println("1 또는 2를 입력해주세요.");
                    }
                    boolean is_iced = icedInput.equals("1");
                    order.addItem(new Coffee(is_iced));
                    break;

                case "4":
                    order.addItem(new IcedTea());
                    break;

                default:
                    System.out.println("올바른 번호를 입력해주세요.");
                    break;
            }
        }

    }
}