class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int prod=1;
        int temp=n;
        while(temp!=0){
            int ld=temp%10;
            sum=sum+ld;
            prod=prod*ld;
            temp=temp/10;
        }
        int ans=prod-sum;
        return ans;
    }
}