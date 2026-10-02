class Solution {
    public String largestNumber(int[] nums) {
        String[] st=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            st[i]=""+nums[i];
        }
        Arrays.sort(st,(b,a)->(a+b).compareTo(b+a));
        if(st[0].equals("0")){
            return "0";
        }
        String s="";
        for(String str:st){
            s+=str;
        }
        return s;
    }
}