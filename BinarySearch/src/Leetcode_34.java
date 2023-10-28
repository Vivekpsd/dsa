import java.util.Arrays;
import java.util.Scanner;

public class Leetcode_34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] nums = {2, 3, 5, 5, 6, 8, 9};
        int target = scn.nextInt();

        int[] ans = findFirstLastPosOfEle(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] findFirstLastPosOfEle(int[] nums, int target) {
        int[] ans = {-1, -1};
        int stIdx = search(nums, target, true);
        int enIdx = search(nums, target, false);

        ans[0] = stIdx;
        ans[1] = enIdx;
        return ans;
    }

    // will return index value of the target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int st = 0;
        int en = nums.length - 1;
        int ans = -1;

        while(st <= en) {
            int mid = st + (en - st) / 2;

            if (target < nums[mid]) {
                en = mid - 1;
            } else if (target > nums[mid]) {
                st = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    en = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return ans;
    }
}
