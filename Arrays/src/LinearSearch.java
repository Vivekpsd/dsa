public class LinearSearch {
    public static void main(String[] args) {

        // search index for target array element
        int[] arr = {10, 20, 30, 50, 40, 2};
        int target = 4;
        int answer = linearSearchNum(arr, target);
        System.out.println("target found at index -> " + answer);


        // search index for char from string
        String str = "A random string to be searched.";
        char target2 = 'm';
        int answer2 = linearSearchStr(str, target2);
        System.out.println("target2 found at index -> " + answer2);

        // find minimum
        int eles[] = {5, 6, 3, 7, 1};
        System.out.println("Minimum element is -> " + min(eles));

        //can do max min in 2D array
    }

    // search in array: return index if item found
    // otherwise return -1
    static int linearSearchNum(int[] arr, int target) {
        if (arr.length == 0) return -1;

        for (int index = 0; index < arr.length; index++) {
            int ele = arr[index];
            if (ele == target) return index;
        }
        return -1;
    }


    // search in string: return index if char found
    // otherwise return -1
    static int linearSearchStr(String str, char target) {
        if (str.length() == 0) return -1;

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) return i;
        }

        return -1;
    }

    // method to find minimum
    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int ele: arr) {
            if (ele < min) min = ele;
        }
        return min;
    }
}
