import java.util.Scanner;

public class BSAlgorithm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] eles = {1, 2, 5, 6, 8, 11, 14, 19, 22, 25, 27};
        int size = eles.length;
        int min = 0;
        int max = size - 1;
        int target;
        System.out.println("Enter Target Element: ");
        target = scn.nextInt();

        while (min <= max) {
            // int mid = (min + max) / 2; (might be possible that min+max will exceed the range of integer)
            int mid = min + (max - min) / 2;
            if (eles[mid] == target) {
                System.out.println("Present at index: " + mid);
                return;
            }

            if (target < eles[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        System.out.println("Element not present in array..");
    }
}
