public class OddEven {
    public static void main(String[] args) {
        int num1 = 222333;
        int num2 = 3390;
        System.out.println(isOdd(num1));
        System.out.println(isOdd(num2));
        System.out.println(isEven(num1));
        System.out.println(isEven(num2));
    }

    static boolean isOdd(int num) {
        return (num & 1) == 1;
    }

    static boolean isEven(int num) {
        return (num & 1) == 0;
    }

}
