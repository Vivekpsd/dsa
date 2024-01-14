import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {8, 4, 2, 1, 3, 9, 5, 6, 7};
        int[] sorted = mergeSort(nums);
        System.out.println(Arrays.toString(sorted));
    }

    static int[] mergeSort(int[] nums) {
        if (nums.length == 1) return nums;

        int mid = nums.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(nums, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(nums, mid, nums.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int idx1 = 0;
        int idx2 = 0;
        int index = 0;

        int[] ans = new int[left.length + right.length];

        while (idx1 < left.length && idx2 < right.length) {
            if (left[idx1] <= right[idx2]) {
                ans[index] = left[idx1];
                idx1++;
            } else {
                ans[index] = right[idx2];
                idx2++;
            }
            index++;
        }

        while (idx1 < left.length) {
            ans[index] = left[idx1];
            index++;
            idx1++;
        }

        while (idx2 < right.length) {
            ans[index] = right[idx2];
            index++;
            idx2++;
        }

        return ans;
    }
}
