public class Leetcode_410 {
    // https://leetcode.com/problems/split-array-largest-sum/description/
    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;
        int largestSum = splitArray(nums, k);
        System.out.println("Split array largest sum is : " + largestSum);
    }

    static int splitArray(int[] nums, int k) {
        int st = 0;
        int en = 0;
        for (int i = 0; i < nums.length; i++) {
            st = Math.max(st, nums[i]); // in end of loop, this will contain max item
            en += nums[i];
        }

        // binary search
        while (st < en) {
            // try mid as potential
            int mid = st + (en - st) / 2;

            // calculate how many piecies you can divide this in with max sum
            int sum = 0;
            int pieces = 1;
            for (int num: nums) {
                if (sum + num > mid) {
                    // you cannot add this in this subarray, make new one
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > k) {
                st = mid + 1;
            } else {
                en = mid;
            }
        }

        return en;
    }
}
