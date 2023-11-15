import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_448_CyclicSort {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List missingNums = findMissing(nums);

        for (int i = 0; i < missingNums.size(); i++) {
            System.out.print(missingNums.get(i) + " - ");
        }
    }

    public static List findMissing(int[] nums) {
        int[] helper = new int[nums.length];
        List ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            helper[i] = -1;
        }

        for (int i = 0; i < nums.length; i++) {
            int idx = nums[i] - 1;
            helper[idx] = 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (helper[i] == -1)
                ans.add(i+1);
        }
        return ans;
    }
}
