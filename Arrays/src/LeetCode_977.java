import java.util.Arrays;

public class LeetCode_977 {
    public static void main(String[] args) {
        int[] nums = {-5,-3,-2,-1};
        int[] sorted = sortArray(nums);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] sortArray(int[] nums) {
        int smallestAt = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            int curNumSq = nums[i]*nums[i];
            int nextNumSq = nums[i+1]*nums[i+1];
            if (nextNumSq > curNumSq) {
                smallestAt = i;
                break;
            }
            smallestAt = nums.length - 1;
        }

        int rt = smallestAt;
        int lf = smallestAt - 1;
        int idx = 0;
        int[] ans = new int[nums.length];

        while (rt <= nums.length - 1 && lf >= 0) {
            if (nums[lf]*nums[lf] < nums[rt]*nums[rt]) {
                ans[idx] = nums[lf]*nums[lf];
                idx++;
                lf--;
            } else {
                ans[idx] = nums[rt]*nums[rt];
                idx++;
                rt++;
            }
        }
        while (rt <= nums.length - 1) {
            ans[idx] = nums[rt]*nums[rt];
            idx++;
            rt++;
        }

        while (lf >= 0) {
            ans[idx] = nums[lf]*nums[lf];
            idx++;
            lf--;
        }

        return ans;
    }
}
