package access.ex;

public class ShoppingCart {
    private int count;
    private Item[] items = new Item[10];

    public void addItem(Item item) {
        //검증로직
        if (count > items.length) {
            System.out.println("장바구니가 가득 찼습니다.");
            return;
        }

        //실행로직
        items[count++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품 이름: " + items[i].getProductName() + ", 합계: " + items[i].getTotalPrice());
        }
        System.out.println("전체 합계: " + calculateTotalPrice());
    }

    //메서드가 내부에서만 사용되므로 private으로 접근 제한
    private int calculateTotalPrice() {
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return  totalPrice;
    }
}
