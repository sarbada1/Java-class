package subarray;

public class MultiArray {
    public static void main(String[] args) {
        int[][] arr;
        arr = new int[][] { { 1, 3, 5 }, { 4, 2, 6 }, { 2, 8, 7 } };
        for (int[] ar : arr) {
            for (int a : ar) {
                System.out.println(a + "\t");
            }
            System.out.println();

        }

    }

}
