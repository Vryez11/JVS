package collection.array;

public class MyArrayListV2Main {

    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2(2);
        System.out.println("==데이터 추가==");
        System.out.println(list);
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.add("d");
        list.add("e");
        System.out.println(list);

        //볌위 초과, capacity가 늘어나지 않으면 예외 발생
        list.add("f");
        System.out.println(list);
    }
}
