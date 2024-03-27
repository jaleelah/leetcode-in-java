class MaxProfit {
	public int maxProfit(int[] prices) {
        int max = 0;
        int floor = prices[0];
        for(int i = 1; i < prices.length; i++) {
            if(prices[i] - floor > max) max = prices[i] - floor;
            if(prices[i] < floor) floor = prices[i];
        }
        return max;
    }
}