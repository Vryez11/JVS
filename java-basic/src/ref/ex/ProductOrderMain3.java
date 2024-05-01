package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("상품 갯수를 입력해주세요: ");
        int num = input.nextInt();
        int count = 0;

        ProductOrder[] orders = new ProductOrder[num];

        while(true){
            System.out.println();
            System.out.println("============================================");
            System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 총 합계 | 4. 종료");
            System.out.println("============================================");

            System.out.print("메뉴를 입력하세요: ");
            int menu = input.nextInt();
            input.nextLine();

            if (menu == 1) {
                if (count < orders.length) {
                    System.out.println((count+1) + "번 째 상품을 입력하세요.");
                    System.out.print("상품 이름: ");
                    String productName = input.nextLine();
                    System.out.print("상품 가격: ");
                    int price = input.nextInt();
                    System.out.print("상품 수량: ");
                    int quantity = input.nextInt();
                    input.nextLine();

                    orders[count] = createOrder(productName, price, quantity);
                    count++;
                } else {
                    System.out.println("상품의 갯수를 초과하였습니다.");
                    continue;
                }
            } else if (menu == 2) {
                printOrders(orders);
            } else if (menu == 3) {
                int total = getTotalAmount(orders);
                System.out.println("총 합계: " + total);
            } else if (menu == 4) {
                break;
            } else {
                System.out.println("올바른 메뉴를 입력하세요.");
            }
        }
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();

        order.productName = productName;
        order.price = price;
        order.quantity = quantity;

        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        int i = 0;

        while(orders[i] != null) {
            System.out.println("상품명: " + orders[i].productName + ", 가격: " + orders[i].price + ", 수량: " + orders[i].quantity);
            i++;
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int total = 0;
        int i = 0;

        while(orders[i] != null){
            total += orders[i].price * orders[i].quantity;
            i++;
        }
        return total;
    }
}
