class Solution {
    public String restoreString(String s, int[] indices) {
        char[] st=new char[s.length()];
        String str="";
        for(int i=0;i<indices.length;i++){
            st[indices[i]]=s.charAt(i);
        }
        for(char ch:st){
            str+=ch;
        }
        return str;
    }
}