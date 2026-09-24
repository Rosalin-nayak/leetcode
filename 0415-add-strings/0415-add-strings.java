class Solution {
    public String addStrings(String num1, String num2) {
        // int n1=Integer.parseInt(num1);
        // int n2=Integer.parseInt(num2);
        // int ans=n1+n2;
        // return String.valueOf(ans);

        StringBuilder ans=new StringBuilder();
        int i=num1.length()-1;
        int j=num2.length()-1;
        int carry=0;
        while(carry!=0||i>=0||j>=0){
            int sum=carry;
            if(i>=0){
                sum+=num1.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=num2.charAt(j)-'0';
                j--;
            }
            ans.append(sum%10);
            carry=sum/10;
        }
        return ans.reverse().toString();
    }
}