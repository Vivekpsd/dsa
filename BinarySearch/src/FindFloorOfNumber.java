import java.util.Scanner;

public class FindFloorOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {2, 4, 7, 9, 11, 15, 19, 21};
        System.out.println("Enter target element: ");
        int target = scn.nextInt();

        int ans = findFloorNumber(arr, target);
        System.out.println("Floor of target element is present at index: " + ans + " i.e. => "  + arr[ans]);
    }

    static int findFloorNumber(int[] arr, int target) {
        int st = 0;
        int en = arr.length - 1;
        while (st <= en) {
            int mid = st + (en - st) / 2;

            if (arr[mid] == target) return arr[mid];
            else if (arr[mid] > target) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return  en;
    }
}
