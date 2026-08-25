class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int x=k;
        for(int num:nums){
            if(num==x){
                x+=k;
            }
        }
        return x;
    }
}