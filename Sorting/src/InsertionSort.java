import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 8, 65, 9, 1, 22, 189};
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            int hole = i;

            while (hole > 0 && nums[hole - 1] > val) {
                nums[hole] = nums[hole - 1];
                hole = hole - 1;
            }
            nums[hole] = val;
        }
    }
}
