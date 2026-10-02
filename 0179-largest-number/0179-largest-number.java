class Solution {
    public String largestNumber(int[] nums) {
        String[] st=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            st[i]=""+nums[i];
        }
        // Arrays.sort(st,(b,a)->(a+b).compareTo(b+a));
        for (int i = 0; i < st.length; i++) {
            for (int j = i + 1; j < st.length; j++) {
                if ((st[i] + st[j]).compareTo(st[j] + st[i]) < 0){
                    String temp = st[i];
                    st[i] = st[j];
                    st[j] = temp;
                }
            }
        }
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