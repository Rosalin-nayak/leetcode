class Solution {
    public int findNumbers(int[] nums) {
        int countEven=0;
        for(int num:nums){
            int n=num;
            int count=0;
            while(n!=0){
                int ld=n%10;
                n=n/10;
                count++;
            }
            if(count%2==0){
                countEven++;
            }
        }
        return countEven;
    }
}