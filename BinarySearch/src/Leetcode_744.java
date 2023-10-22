import java.util.Scanner;

public class Leetcode_744 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char[] arr = {'c', 'd', 'f', 'j'};
        System.out.println("Enter target char: ");
        char target = scn.next().charAt(0);

        char ans = findSmallestGreaterThanTarget(arr, target);
        System.out.println("Output: " + ans);
    }

    static char findSmallestGreaterThanTarget(char[] arr, char target) {
        int st = 0;
        int en = arr.length - 1;

        while (st <= en) {
            if (st == arr.length) return 0;
            int mid = st + (en-st) / 2;
            if (target < arr[mid]) {
                en = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return arr[st % arr.length];
    }
}


