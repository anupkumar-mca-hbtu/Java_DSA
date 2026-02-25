package DSA_90Days;

/*You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.


Constraints:

        1 <= prices.length <= 10^5
        0 <= prices[i] <= 10^4 */

public class Best_Time_to_BuyAndSell_Stock {

    // Brute- Approach - T.C= O(n*n), S.C= O(1), will throw tle on large array size
   /* public int maxProfit(int[] prices) {
        int max_profit= 0;
        for(int i=0;i<prices.length-1;i++) {
            for(int j=i+1;j<prices.length;j++) {
                max_profit= Math.max(max_profit,prices[j]-prices[i]);
            }
        }
        return max_profit;
    } */
    // Optimal -Approach - T.C= O(n), S.C= O(1)
    public int maxProfit(int[] prices) {
        int minIndex = 0;
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[minIndex]) {
                minIndex = i;
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - prices[minIndex]);
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices= {7,1,5,3,6,4};
        Best_Time_to_BuyAndSell_Stock bs= new Best_Time_to_BuyAndSell_Stock();
        int profit=  bs.maxProfit(prices);
        System.out.println(profit);
    }
}
