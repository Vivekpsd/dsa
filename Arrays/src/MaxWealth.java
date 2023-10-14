public class MaxWealth {
    // https://leetcode.com/problems/richest-customer-wealth/
    public static void main(String[] args) {
        int[][] accounts = {{1, 2, 3},{3, 2, 1}};
        int maxWealth = getMaxWealth(accounts);
        System.out.println("Max Wealth: " + maxWealth);
    }

    static int getMaxWealth(int accounts[][]) {
        int maxAmount = 0;
        for (int i = 0; i < accounts.length; i++) {
            int currentAccountSum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                currentAccountSum += accounts[i][j];
            }
            maxAmount = Math.max(maxAmount, currentAccountSum);
        }
        return maxAmount;
    }
}
