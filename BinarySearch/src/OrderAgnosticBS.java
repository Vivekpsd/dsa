import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int size = scn.nextInt();

        int[] eles = new int[size];

        System.out.println("Enter " + size + " elements in order [aesc/desc] - ");
        for (int i = 0; i < size; i++) {
            eles[i] = scn.nextInt();
        }

        System.out.println("Enter target element: ");
        int target = scn.nextInt();

        int index = BSearch(eles, size, target);
        System.out.println("Present at position: " + index);

    }

    static int BSearch(int[] eles,  int size, int target) {
        int start = 0;
        int end = size - 1;

        if (size == 1) {
            if (eles[0] == target) return 0;
            return -1;
        }

        if (eles[start] < eles[end]) {
            // asec order
            return aescSearch(eles, size, target);
        } else {
            // desc order
            return descSearch(eles,size, target);
        }
    }

    static int aescSearch(int[] eles, int size, int target) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (eles[mid] == target) {
                return mid;
            }

            if (target < eles[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int descSearch(int[] eles, int size, int target) {
        int start = 0;
        int end = size - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(eles[mid] == target) {
                return mid;
            }

            if (target > eles[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
