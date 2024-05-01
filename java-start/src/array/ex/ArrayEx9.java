package array.ex;

import java.util.Scanner;

public class ArrayEx9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxProducts = 10; //최대값을 변수로 설정으로 하는 것이 스마트한 방법!
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        System.out.println("\"1.상품 등록\", \"2.상품 목록\", \"3.종료\"");

        while(true) {
            System.out.print("메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount < maxProducts) {
                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = scanner.nextLine();
                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = scanner.nextInt();
                    scanner.nextLine();
                    productCount++;
                }
                else System.out.println("더 이상 상품을 등록할 수 없습니다.");
            } else if (menu == 2) {
                if (productCount == 0) System.out.println("등록된 상품이 없습니다.");
                else {
                    for (int row = 0; row < productCount; row++) {
                        System.out.println(productNames[row] + ": " + productPrices[row] + "원");
                    }
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else System.out.println("\"1.상품 등록\", \"2.상품 목록\", \"3.종료\" 중에 선택해주세요.");
        }
    }
}
