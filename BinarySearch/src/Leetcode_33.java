public class Leetcode_33 {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 7;
        int indexToSearch = searchInRotatedSortedArray(nums, target);
        System.out.println("Target element present at index: " + indexToSearch);
    }

    static int searchInRotatedSortedArray(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if pivot is not found in the array
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }
        // if pivot is found (3 cases)
        // 1. pivot is itself the target
        // 2. target is smaller than pivot
        // 3. target is larger than pivot
        if (nums[pivot] == target) return pivot;
        if (target > nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int findPivot(int[] nums) {
        int st = 0;
        int en = nums.length - 1;
        while (st <= en) {
            int mid = st + (en - st) / 2;
            // 4 cases
            if (nums[mid] > nums[mid + 1] && mid < en) {
                return mid;
            }
            if (nums[mid] < nums[mid - 1] && mid > st) {
                return mid - 1;
            }
            if (nums[mid] <= nums[st]) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return -1;
    }

    static int binarySearch(int[] nums, int target, int st, int en) {
        while (st <= en) {
            int mid = st + (en - st) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;
    }
}
