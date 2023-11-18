import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter nth fibonacci num to find: ");
        int num = scn.nextInt();
        int fab = printNthFibo(num);
        System.out.println(fab);
    }

    static int printNthFibo(int num) {
        if (num < 2) return num;
        return printNthFibo(num - 1) + printNthFibo(num - 2);
    }
}
