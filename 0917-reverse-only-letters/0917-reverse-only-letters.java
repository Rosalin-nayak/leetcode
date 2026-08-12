class Solution {
    public String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            
            if(Character.isLetter(s.charAt(st)) && Character.isLetter(s.charAt(end))){
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
            st++;
            end--;
            }
            else{
                if(! Character.isLetter(s.charAt(st))){
                    st++;
                }else{
                    end--;
                }
            }
        }
        return new String(arr);
    }
}