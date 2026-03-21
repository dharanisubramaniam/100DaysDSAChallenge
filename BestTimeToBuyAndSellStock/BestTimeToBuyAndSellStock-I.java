class BuyAndSellStock {
    public int maxProfit(int[] prices) {
       	int profit=0;
		int buyPoint=prices[0];
		int tempProfit=0;
		int sellPoint=prices[0];  
		for(int i=0;i<prices.length;i++){
		   if(prices[i]<=buyPoint){
		       buyPoint=prices[i];
		       sellPoint=prices[i];
		   }
		   if(prices[i]>sellPoint){
		       sellPoint=prices[i];
		   }
		   tempProfit=sellPoint-buyPoint;
		   	if(tempProfit>profit){
		    profit=tempProfit;
		}
		}
        return profit;
    }
}