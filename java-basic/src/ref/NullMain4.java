package ref;

public class NullMain4 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();

        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException 이것을 주의!! NullPointerException이 발생하면 null.(dot)이 발생했다고 생각하면 쉬움!
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
