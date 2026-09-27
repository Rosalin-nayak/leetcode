class Solution {
    static int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int ans=Math.min(minCost(0,cost),minCost(1,cost));
        return ans;
    }
    public int minCost(int i,int[] cost){
        if(i>=cost.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int answer=cost[i]+Math.min(minCost(i+1,cost),minCost(i+2,cost));
        dp[i]=answer;
        return answer;
    }
    
}