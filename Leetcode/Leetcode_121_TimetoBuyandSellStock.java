public class Leetcode_121_TimetoBuyandSellStock {
    public static int maxProfit(int[] prices) {
        int mini = prices[0];
        int maxProfite = 0;
        int n = prices.length;

        for (int i=0; i < n; i++) {
            int cost = prices[i] - mini;
            maxProfite = Math.max(maxProfite, cost);
            mini = Math.min(mini, prices[i]);
        }
        return maxProfite;
    }

    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };

        int profit = maxProfit(prices);

        System.out.println("Maximum Profit: " + profit);
    }
}
