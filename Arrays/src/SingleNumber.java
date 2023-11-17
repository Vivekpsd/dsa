public class SingleNumber {
    // https://leetcode.com/problems/single-number/description/
    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        int singleNumer = findSingleNumber(nums);
        System.out.println("Single Number is: " + singleNumer);
    }

    static int findSingleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }
}
