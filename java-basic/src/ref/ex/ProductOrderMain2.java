package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[2];

        orders[0] = createOrder("Java", 20000, 2);
        orders[1] = createOrder("Spring", 10000, 1);

        printOrders(orders);

        int totalAmount = getTotalAmount(orders);

        System.out.println("전체 가격: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();

        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (int i = 0; i < orders.length; i++) { //향상된 for문 사용가능!
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;

        for (int i = 0; i < orders.length; i++) { //향상된 for문 사용가능!
            total += orders[i].price * orders[i].quantity;
        }
        return total;
    }
}
