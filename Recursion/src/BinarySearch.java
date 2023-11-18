public class BinarySearch {
    public static void main(String[] args) {
        int nums[] = {2, 5, 7, 9, 10, 12, 14, 20, 22, 25, 30};
        int target = 26;
        int foundAt = binarySearch(nums, target, 0, nums.length - 1);
        System.out.println("Target element found at index " + foundAt);
    }

    static int binarySearch(int[] nums, int target, int st, int en) {
        if (st > en) {
            return -1;
        }
        int mid = st + (en - st) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (target < nums[mid]) {
            return binarySearch(nums, target, st, mid - 1);
        } else {
            return binarySearch(nums, target, mid + 1, en);
        }
    }
}
