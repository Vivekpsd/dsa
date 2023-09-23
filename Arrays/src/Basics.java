import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
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


    }
}
