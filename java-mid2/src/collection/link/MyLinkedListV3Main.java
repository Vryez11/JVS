package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();
        //마지막에 추가 //O(n)
        stringList.add("a");
        stringList.add("b");
        stringList.add("c");
        System.out.println(stringList);
        //첫 번째 항목에 추가, 삭제
        System.out.println("첫 번째 항목에 추가");
        stringList.add(0,"d"); //O(1)
        System.out.println(stringList);
        System.out.println("첫 번째 항목 삭제");
        stringList.remove(0); //remove First O(1)
        System.out.println(stringList);
        //중간 항목에 추가, 삭제
        System.out.println("중간 항목에 추가");
        stringList.add(1,"e"); //O(n)
        System.out.println(stringList);
        System.out.println("중간 항목 삭제");
        stringList.remove(1);//remove O(n)
        System.out.println(stringList);

        MyLinkedListV3<Integer> integerList = new MyLinkedListV3<>();
        integerList.add(0,1);
        integerList.add(1,2);
        integerList.add(2,3);
        integerList.add(3,4);
        System.out.println("integerList = " + integerList);
    }
}