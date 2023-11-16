import java.util.ArrayList;
import java.util.List;

public class LeetCode_41 {
    // https://leetcode.com/problems/first-missing-positive/description/
    public static void main(String[] args) {
        int nums[] = {3, 4, -1, 1};
        int missingPositiveNum = findMissingPositiveNum(nums);
        System.out.println("Smallest missing positive number is: " + missingPositiveNum);
    }

    public static int findMissingPositiveNum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i] - 1;
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctPos]) {
                int temp = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                return j + 1 ;
            }
        }

        return nums.length + 1;
    }
}
