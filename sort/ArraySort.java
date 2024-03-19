
//wap to sort an array elements

package sort;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = { 1, 9, 3, 7, 5 }; 
        int temp; 

        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


