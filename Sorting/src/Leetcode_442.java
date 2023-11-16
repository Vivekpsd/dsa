import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode_442 {
    // https://leetcode.com/problems/find-all-duplicates-in-an-array/
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> duplicates = findDuplicateNums(nums);
        for (int num: duplicates) {
            System.out.print(num + " ");
        }
    }

    static List<Integer> findDuplicateNums(int[] nums) {
        int i = 0;
        List<Integer> ans = new ArrayList<>();
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;
            if (nums[correctIdx] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                ans.add(nums[j]);
            }
        }

        return ans;
    }

}
