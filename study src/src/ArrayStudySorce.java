public class ArrayStudySorce {

    public static void main(String[] args) {
        int [][] nums;
        nums = new int[2][3];

        for (int[] num : nums) {
            for (int i : num) {
                i++;
                System.out.println(i);;
            }
            System.out.println();
        }
    }
}
