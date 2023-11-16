import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_287 {
    //https://leetcode.com/problems/find-the-duplicate-number/description/

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};

        int duplicateNum = findDuplicate(nums);
        System.out.println("Dulicate num is: " + duplicateNum);
    }
    public static int findDuplicate(int[] nums) {
        int[] helper = new int[nums.length];
        Arrays.fill(helper, -1);

        for (int i = 0; i < nums.length; i++) {
            int originalIdx = nums[i] - 1;
            if (helper[originalIdx] == -1)
                helper[originalIdx] = 0;
            else
                return nums[i];
        }
        return -1;
    }
}
