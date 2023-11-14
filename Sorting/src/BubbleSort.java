import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
                //{10, 4, 3, 7, 9, 11, 14, 20, 1};
        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));
    }

    static void bubbleSort(int[] nums) {
        boolean swapFlag = false;
        for (int i = 0; i < nums.length; i++) {
            // for each iteration, max item will come at the last respective index
            for (int j = 1; j < nums.length - i; j++) {
                // swap
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                    swapFlag = true;
                }
            }
            if (!swapFlag) break;
        }
    }
}
