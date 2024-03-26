//wap to find whether the array is sub array or not

package subarray;

import java.util.Arrays;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 8};
        int[] subarr = {5, 3};

        boolean isSubArray = true;
        for (int k : subarr) {
            boolean isPresent = false;
            for (int i : arr) {
                if (i == k) {
                    isPresent = true;
                    break;
                }
            }
            if (!isPresent) {
                isSubArray = false;
                break;
            }
        }

        if (isSubArray) {
            System.out.println("The "+ Arrays.toString(subarr)+ " is sub-array of " + Arrays.toString(arr));
        } else {
            System.out.println("subarr is not a subarray of arr");
        }
    }
}

