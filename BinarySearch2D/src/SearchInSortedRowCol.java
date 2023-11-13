public class SearchInSortedRowCol {
    public static void main(String[] args) {
        int[][] nums = {{10, 20, 30, 40}, {15, 25, 35, 45}, {19, 29, 39, 49}, {28, 32, 45, 55}};
        int target = 32;

        int[] answer = searchInSortedRowCol(nums, target);
        System.out.println("Element found at index: [" + answer[0] + ", " + answer[1] + "]");
    }

    static int[] searchInSortedRowCol(int[][] nums, int target) {
        int r = 0;
        int c = nums.length - 1;

        while (r < nums.length && c >= 0) {
            if (nums[r][c] == target) {
                return new int[]{r, c};
            }
            if (nums[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[] {-1, -1};
    }
}
