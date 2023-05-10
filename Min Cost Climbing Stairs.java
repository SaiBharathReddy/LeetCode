import java.lang.Math;
class Solution {
    public int minCost(int[] cost,int i){
        if(i>=cost.length){
            return 0;
        }
        int f=0,s=0;
    f=cost[i]+minCost(cost,i+1);
    if(i<cost.length-1){
    s=cost[i+1]+minCost(cost,i+2);}
    else{
        s=0;
    }
    return Math.min(f,s);}
    public int minCostClimbingStairs(int[] cost) {
        //return new Solution().minCost(cost,0);
        for(int i=cost.length-3;i>=0;i--){
            cost[i]+=Math.min(cost[i+1],cost[i+2]);
        }
        return Math.min(cost[0],cost[1]);
    }
}