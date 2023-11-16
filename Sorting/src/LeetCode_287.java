import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_287 {
    //https://leetcode.com/problems/find-the-duplicate-number/description/

    public static void main(String[] args) {
        int[] nums = {8,7,1,10,17,15,18,11,16,9,19,12,5,14,3,4,2,13,18,18};

        int duplicateNum = findDuplicate(nums);
        System.out.println("Dulicate num is: " + duplicateNum);
    }



    // solving without using constant extra space . . .
    public static int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i+1) {
                int correctIdx = nums[i] - 1;
                if (nums[i] != nums[correctIdx]) {
                    int temp = nums[i];
                    nums[i] = nums[correctIdx];
                    nums[correctIdx] = temp;
                } else {
                    return nums[i];
                }
            } else  {
                i++;
            }
        }
        return -1;
    }

//    public static int findDuplicate(int[] nums) {
//        int[] helper = new int[nums.length];
//        Arrays.fill(helper, -1);
//
//        for (int i = 0; i < nums.length; i++) {
//            int originalIdx = nums[i] - 1;
//            if (helper[originalIdx] == -1)
//                helper[originalIdx] = 0;
//            else
//                return nums[i];
//        }
//        return -1;
//    }
}
