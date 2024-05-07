public class ArrayStudySorce {

    public static void main(String[] args) {
        int[] a = {10};
        System.out.println("a[0] = " + a[0]);
        changeValue(a);
        System.out.println("a[0] = " + a[0]);
    }

    static void changeValue(int[] a) {
        a[0] = 20;
    }
}
