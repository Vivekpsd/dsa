import java.util.Scanner;

public class recall_1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] nums = {2, 5, 7, 9, 11, 15, 22, 45, 67, 90, 95, 100};

        System.out.println("Enter the target element: ");
        int target = scn.nextInt();

        // question 1
        int floor = findFloorOfNum(nums, target);
        System.out.println("Ceiling of target number is: " + floor);

        // question 2
        int ceil = findCeilOfNum(nums, target);
        System.out.println("Floor of target number is: " + ceil);

        // question 3 - find smallest letter greater than, equal to target
        // Submitted here - https://leetcode.com/problems/find-smallest-letter-greater-than-target/

        // question 4 - find first and last pos of element in sorted array
        // Submitted here - https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
    }

    static int findFloorOfNum(int[] nums, int target) {
        int st = 0;
        int en = nums.length - 1;

        while (st <= en) {
            int mid = st + (en-st) / 2;
            if (target == nums[mid]) {
                return nums[mid];
            }
            else if (target < nums[mid]) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return nums[st];
    }

    static int findCeilOfNum(int[] nums, int target) {
        int st = 0;
        int en = nums.length - 1;

        while (st <= en) {
            int mid = st + (en-st) / 2;
            if (target == nums[mid]) {
                return nums[mid];
            }
            else if (target < nums[mid]) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return nums[en];
    }
}
//
// 2, 5, 7, 9, 10, 11, 15, 17, 19, 20
// 0, 1, 2, 3,  4,  5,  6,  7,  8, 9