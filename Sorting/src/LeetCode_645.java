import java.util.ArrayList;
import java.util.List;

public class LeetCode_645 {
    // https://leetcode.com/problems/set-mismatch/description/
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        List<Integer> answer = findMismatch(nums);
        for (int num: answer) {
            System.out.print(num + " ");
        }
    }

    static List findMismatch(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int sumOfNums = n*(n+1) / 2;

        int i = 0;
        while (i < nums.length) {
            int correctPos = nums[i] - 1;
            if (nums[i] != nums[correctPos]) {
                int temp = nums[i];
                nums[i] = nums[correctPos];
                nums[correctPos] = temp;
            } else {
                i++;
            }
        }
        int sum = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j+1) {
                ans.add(nums[j]);
            } else {
                sum += nums[j];
            }
        }

        ans.add(sumOfNums - sum);

        return ans;
    }
}
