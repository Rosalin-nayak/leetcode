class Solution {
    public int minimumSwaps(int[] nums) {
        int zeroes=0;
        int swap=0;
        for(int num:nums){
            if(num==0){
                zeroes++;
            }
        }
        for(int i=0;i<nums.length-zeroes;i++){
            if(nums[i]==0){
                swap++;
            }
        }
        return swap;
    }
}