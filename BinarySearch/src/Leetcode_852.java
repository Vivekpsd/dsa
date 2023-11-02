public class Leetcode_852 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 7, 9, 10, 5, 3, 1, 0};
        int ans = peakIndexInMountainArray(arr);
        System.out.println("Peak found at index: " + ans);
    }

    static int peakIndexInMountainArray(int[] nums) {
        int st = 0;
        int en = nums.length - 1;
        int ans = -1;

        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1]) {
                ans = mid;
                return ans;
            }
            else if (nums[mid] > nums[mid + 1]) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
}


