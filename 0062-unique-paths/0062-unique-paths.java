class Solution {
    static int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m+1][n+1];
        return paths(m,n);
    }
    public int paths(int m, int n) {
        if(m==1||n==1) return 1;
        if(dp[m][n]!=0) return dp[m][n];
        dp[m][n]=paths(m-1,n)+paths(m,n-1);
        return dp[m][n];
    }
}