import java.util.ArrayList;

public class OperatorsWithString {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // will add ASCII value
        System.out.println("a" + "b"); // will concatenate
        System.out.println('a' + 3);   // a=97 + 3 => 100.
        System.out.println((char)('a' + 3));   // 100 in char => d

        System.out.println("a" + 1); // will print a1
        // after a few steps same as "a" + "1"
        // NOTE: when an string is concatenated with integer, it will convert
        // integer to Integer that will call toSting();

        System.out.println("vivek" + new ArrayList<>());
        System.out.println("vivek" + new Integer(56));
        // if it's an object, will call toString on this

        // System.out.println(new Integer(56) + new ArrayList<>());
        // above println will give error because,
        // + in JAVA is only defined for primitives or any one of the value is String.
        // - in JAVA cannot be applied to String
        System.out.println(new Integer(56) + "gotcha" + new ArrayList<>());
    }

}
