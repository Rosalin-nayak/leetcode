class Solution {
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            int sum=0,temp=nums[i];
            while(temp!=0){
                int ld=temp%10;
                temp=temp/10;
                sum+=ld;
            }
            if(sum==i){
                return i;
            }
        }
        return -1;
    }
}