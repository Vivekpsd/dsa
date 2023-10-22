import java.util.Scanner;

public class FindCeilingOfNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {2, 4, 7, 9, 11, 15, 19, 21};
        System.out.println("Enter target element: ");
        int target = scn.nextInt();

        int ans = findCeilingNum(arr, target);
        System.out.println("Ceiling of target element is present at index: " + ans + " i.e. => "  + arr[ans]);
    }

    static int findCeilingNum(int[] arr, int target) {
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
        return en + 1;
    }
}
