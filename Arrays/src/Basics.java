import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // store 5 roll no.
        // syntax -> datatype[] variable = new datatype[size]

//        int[] rollNo = new int[5];
//        for (int i = 0; i < rollNo.length; i++) {
//            System.out.println(rollNo[i]);
//        }

        // array of primitives
        int[] pop = {10, 20, 30, 40, 50};
//        for (int i = 0; i < pop.length; i++) {
//            System.out.println(pop[i]);
//        }

        int[] nos; // declaration of array. nos is getting defined in stack (compile time)
        nos = new int[5]; // object is being created in the memory (heap) (run-time)


        // for each - access elements
        for(int num: pop) {
            System.out.println(num);
        }

        // Arrays class toString method
        System.out.println(Arrays.toString(pop));

        // array of objects -------------------------
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = scn.next();
        }
        System.out.println(Arrays.toString(str));


        // 2D array - notice second size not required
        // It's an array of array and each array is an object stored in heap, so size can vary.
        int[][] arr = new int[4][];

        int[][] arr2D = {
                {1, 2, 5},
                {5, 6, 2, 5},
                {2, 2}
        };

        for (int row = 0; row <= 2; row++) {
            System.out.println(Arrays.toString(arr2D[row]));
        }

        // enchanced for loop - 2d
        for (int[] row: arr2D) {
            System.out.println(Arrays.toString(row));
        }

    }
}
