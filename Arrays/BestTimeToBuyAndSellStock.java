package Arrays;
//Leetcode-121  Best Time To Buy And Sell Stock

//Approach:
//Traverse the array while keeping track of the minimum price seen so far.
//calculate the profit for each day and update the maxProfit
//return maxProfit

//Time coplexity -O(n)
//Space Complexity -O(1)

public class BestTimeToBuyAndSellStock {
    static int maxProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 7, 1, 5, 3, 6, 4 };
        int result = maxProfit(arr);
        System.out.println(result);
    }
}
