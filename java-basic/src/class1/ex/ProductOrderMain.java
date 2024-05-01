package class1.ex;

import java.util.Scanner;

public class ProductOrderMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ProductOrder[] productOrders = new ProductOrder[2];

        for(int i = 0; i < productOrders.length; i++) {
            productOrders[i] = new ProductOrder();
            System.out.print("상품의 이름을 적어주세요: " );
            productOrders[i].productName = scanner.nextLine();
            System.out.print("상품의 가격을 적어주세요: " );
            productOrders[i].price = scanner.nextInt();
            System.out.print("상품의 수량을 적어주세요: " );
            productOrders[i].quantity = scanner.nextInt();
            scanner.nextLine();
        }

        for (ProductOrder p : productOrders) {
        System.out.println("상품의 이름: " + p.productName + ", 상품의 가격: " + p.price + ", 상품의 수량: " + p.quantity + ", 총 가격: " + p.price*p.quantity + "원");
        }
    }
}
