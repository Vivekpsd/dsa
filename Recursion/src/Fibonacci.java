import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // print fibonacci using recursion
        int result = getFibonacci(6);
        System.out.println(result);
    }

    static int getFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        return getFibonacci(n - 2) + getFibonacci(n - 1);
    }
}
