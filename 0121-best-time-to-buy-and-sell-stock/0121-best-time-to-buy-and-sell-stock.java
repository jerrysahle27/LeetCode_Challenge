class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;
        for (int i = 0; i < prices.length; i++) {
            if ((min > prices[i] && i != prices.length - 1) || i == 0) {
                min = prices[i];
                System.out.println(min);
                for (int j = i; j < prices.length; j++) {
                    if (result < prices[j] - min) {
                        result = prices[j] - min;
                    }
                }

            }
        }
        return result;
    }
}