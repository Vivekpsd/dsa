import java.util.Scanner;

public class findElementInInfiniteSortedArray {
    // for mimicking sorted array, we'll simply assume we don't know length of array so won't be using
    // arr.length method...
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {1, 5, 7, 9, 10, 20, 30, 35, 40, 44, 56, 66, 72, 75, 77, 80, 85, 90, 99, 102, 112, 120, 140, 150, 155};
        int st = 0;
        int en = 1;
        System.out.println("Enter target to search for: ");
        int target = scn.nextInt();

        while (target > nums[en]) {
            int temp = en + 1;
            en = en + (en - st + 1) * 2;
            st = temp;
        }
        int ans = search(nums, target, st, en);
        System.out.println("At index: " + ans);

    }

    static int search(int[] nums, int target, int st, int en) {

        while(st <= en) {
            int mid = st + (en - st) / 2;

            if (target < nums[mid]) {
                en = mid - 1;
            } else if (target > nums[mid]) {
                st = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
