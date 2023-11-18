public class Basics {
    public static void main(String[] args) {
        // printing number from 1 to 5
        print1_5(1);
        // print number from 5 to 1
        print5_1(5);
    }
    static void print1_5(int num) {
        if (num > 5) {
            return;
        }
        System.out.println("Number: " + num);
        print1_5(num + 1);
    }

    static void print5_1(int num) {
        if (num == 0)
            return;
        System.out.println("Number: " + num);
        print5_1(num - 1);
    }
}
