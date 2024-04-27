public class BinarySearch {
    public static void main(String[] args) {
        // binary search using recursion
        int[] arr = {1, 3, 5, 9, 11, 15, 20, 21, 25};
        int index = binarySearch(arr, 0, arr.length, 21);
        System.out.println("Found at index: " + index);
    }

    static int binarySearch(int[] arr, int st, int en, int target) {
        if (st > en) {
            return -1;
        }
        int mid = st + (en - st) / 2;

        if (arr[mid] == target) {
            return mid;
        } else {
            if (target < arr[mid]) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
            return binarySearch(arr, st, en, target);
        }
    }
}
