import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 8, 9, 1, 22};
        selectionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    
    static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int maxIndex = getMaxIndex(nums, 0, last);
            int temp = nums[last];
            nums[last] = nums[maxIndex];
            nums[maxIndex] = temp;
        }
    }

    static int getMaxIndex(int[] nums, int st, int en) {
        int max = st;
        for (int i = st; i <= en; i++) {
            if (nums[i] > nums[max]) {
                max = i;
            }
        }
        return max;
    }
}
