import java.util.Arrays;

public class LeetCode_1089 {
    public static void main(String[] args) {
        int[] nums = {1,0,2,3,0,4,5,0};
        duplicateZeros(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void duplicateZeros(int[] nums) {
        int z = 0;
        for (int num: nums) {
            if (num == 0) z++;
        }
        int i = nums.length - 1, j = nums.length + z - 1;
        while (i != j) {
            insert(nums, i, j);
            j--;
            if (nums[i] == 0) {
                insert(nums, i, j);
                j--;
            }
            i--;
        }
    }

    static void insert(int[] nums, int i, int j) {
        if (j < nums.length) {
            nums[j] = nums[i];
        }
    }
}
