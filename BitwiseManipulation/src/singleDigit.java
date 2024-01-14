public class singleDigit {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 3, 6, 4, 1, 2};
        int res = 0;
        for (int num: arr) {
            res ^= num;
        }
        System.out.println("Single digit is " + res);
    }
}
