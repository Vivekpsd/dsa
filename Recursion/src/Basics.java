public class Basics {
    public static void main(String[] args) {
        System.out.println("Printing 1 to N");
        printOneToN(5);
        System.out.println("\nPrinting N to 1");
        printNtoOne(5);
        System.out.println("\nPrinting Factorial");
        int factorial = getFactorial(5);
        System.out.println("Factorial: " + factorial);
    }

    static void printOneToN(int n) {
        if (n == 0) {
            return;
        }
        printOneToN(n - 1);
        System.out.print(n + " ");
    }

    static void printNtoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        printNtoOne(n - 1);
    }

    static int getFactorial(int n) {
        if (n == 1) return 1;

        int fact = n * getFactorial(n - 1);
        return fact;
    }
}
