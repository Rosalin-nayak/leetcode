class Solution {
    public int[] canSeePersonsCount(int[] arr) {
        int[] ans=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr[arr.length-1]);
        ans[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            int count=0;
            if(st.peek()>arr[i]){
                count=1;
                st.push(arr[i]);
                ans[i]=count;
            }else{
                while(st.size()>0 && st.peek()<=arr[i]){
                    st.pop();
                    count++;
                }
                if(st.size()>0) count++;
                ans[i]=count;
                st.push(arr[i]);
            } 
        }
        return ans;
    }
}