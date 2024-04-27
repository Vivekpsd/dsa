public class ReverseNumber {
    static int sum = 0;
    static void reverseNum1(int num) {
        if (num == 0) return;
        int rem = num % 10;
        sum = (sum * 10) + rem;
        reverseNum1(num / 10);
    }

    static int reverseNum2(int num, int base) {
        if (num == 0) {
            return base;
        }

        int rem = num % 10;
        base = rem + base * 10;

        // Recursive call with updated num (without the last digit) and base
        return reverseNum2(num / 10, base);
    }

    public static void main(String[] args) {
        int num1 = 2067893;
        int num2 = 7569239;
        reverseNum1(num1);
        int rev = reverseNum2(num2, 0);
        System.out.println("Reversed_1: " + sum);
        System.out.println("Reversed_2: " + rev);
    }

}
