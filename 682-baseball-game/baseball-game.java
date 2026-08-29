class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i].equals("C")){
                st.pop();
            }else if(arr[i].equals("D")){
                st.push(2*st.peek());
            }else if(arr[i].equals("+")){
                int top=st.pop();
                int secondtop=st.peek();
                int ans=top+secondtop;
                st.push(top);
                st.push(ans);
            }else{
                st.push(Integer.parseInt(arr[i]));
            }
        }
        while(st.size()>0){
            sum+=st.pop();
        }
        return sum;
    }
}