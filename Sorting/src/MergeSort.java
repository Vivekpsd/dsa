import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 8, 9, 3, 1, 4};
        System.out.println("Before Sorting: ");
        System.out.println(Arrays.toString(arr));

        arr = mergeSort(arr);

        System.out.println("After Sorting: ");
        System.out.println(Arrays.toString(arr));

    }

    static int[] mergeSort(int[] arr) {

        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int[] ans = new int[left.length + right.length];

        int l = 0;
        int r = 0;
        int i = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                ans[i] = left[l];
                l++;
            } else {
                ans[i] = right[r];
                r++;
            }
            i++;
        }

        while (l < left.length) {
            ans[i] = left[l];
            i++;
            l++;
        }

        while (r < right.length) {
            ans[i] = right[r];
            i++;
            r++;
        }

        return ans;
    }
}
