package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2X3 2차원 배열을 만든다.
        int[][] arr = new int[4][4];

        int i = 10;
        for (int row = 0; row < arr.length; row++){
            for (int column = 0; column < arr[row].length; column++){
                arr[row][column] = i++;
            }
        }

        for (int row = 0; row  < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) { //arr[row].lengh를 해야됨 : 각 행에 열이 매번 같지 않을 수 있기 때문에!
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
