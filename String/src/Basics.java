import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {

        // comparision
        // using == comparator (values in same pool are equal)
        String a = "vivek";
        String b = "vivek";
        System.out.println(a == b);
        System.out.println(a.equals(b)); // compares the actual values only

        // when string created with new, values are not in the same pool anymore
        String a1 = new String("vivek");
        String b1 = new String("vivek");
        System.out.println(a1 == b1);

        System.out.println(56);
        System.out.println("Vivek");
        System.out.println(new int[]{1, 2, 3, 4}); // will give wrong value -> as internally it invokes toString
        // this toString method will invoke null.toString hence some random hex value.
        // then how to print array value?
        System.out.println(Arrays.toString(new int[]{1, 2, 3, 4}));

    }
}
