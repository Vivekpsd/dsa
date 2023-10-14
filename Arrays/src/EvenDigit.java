public class EvenDigit {
    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println("No. of even digits: " + findNums(nums));
    }
    // find Numbers
    static int findNums (int[] nums) {
        int count = 0;
        for (int ele: nums) {
            if(digitsAreEven(ele)) count++;
        }
        return count;
    }

    // function to check num contains even
    static boolean digitsAreEven(int num) {
        int numOfDigits = digits(num);
        if (numOfDigits % 2 == 0) return true;
        return false;
    }

    // function to count no. of digits
    static int digits(int num) {
        if (num < 0) num = num*-1;
        if (num == 0) return 1;

        int count = 0;
        while(num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }

    // another function to count no. of digits

    static int digits2(int num) {
        if (num < 0) num = num*-1;
        if (num == 0) return 1;

        return (int)(Math.log10(num)) + 1;
    }
}
