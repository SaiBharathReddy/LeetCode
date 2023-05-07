class Solution {
    public int maxProfit(int[] prices) {
        int base=prices[0], res=0;
        for(int i=1;i<prices.length; i++){
            if(prices[i]<base){
                base=prices[i];
            }
            else{
                if(res<(prices[i]-base)){
                    res=(prices[i]-base);
                }
            }
        }
        return res;
    }
}