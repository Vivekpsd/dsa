import java.util.Scanner;

public class findElementInInfiniteSortedArray {
    // for mimicking sorted array, we'll simply assume we don't know length of array so won't be using
    // arr.length method...
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nums[] = {1, 5, 7, 9, 10, 20, 30, 35, 40, 44, 56, 66, 72, 75, 77, 80, 85, 90, 99, 102, 112, 120, 140, 150, 155};
        int flag = 0;

        System.out.println("Enter target to search: ");
        int target = scn.nextInt();
        int st = 0;
        int en = 1;
        while(flag == 0) {
            flag = search(nums, target, st, en);
            st = en + 1;
            en = st*2;
            if (en > nums.length) {
                System.out.println("Not found in array :(");
                break;
            }
        }
        System.out.println("Element found at index " + flag);
    }

    static int search(int[] nums, int target, int st, int en) {
        while (st <= en) {
            int mid = st + (en-st) / 2;
            if (target == nums[mid]) return mid;
            else if (target < nums[mid]) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return 0;
    }
}
