public class WrapperClass {
    public static void main(String[] args) {
        // Create two objects of a non-primitive type (e.g., Integer, String, etc.)
        Integer a = 5;
        Integer b = 10;

        // Print the initial values of a and b
        System.out.println("Before swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        // Call the swap method to swap the values of a and b
        swap(a, b);

        // Print the values of a and b after swapping
        System.out.println("\nAfter swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    // Method to swap the values of two non-primitive type objects
    public static void swap(Integer x, Integer y) {
        Integer temp = x;
        x = y;
        y = temp;
    }

}
