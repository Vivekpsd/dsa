import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 1, 6, 7, 4, 3, 8, 9};
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void cyclicSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[i] != nums[correctIdx]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }
    }
}
