class Solution {
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        int index=-1;
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char ch:s.toCharArray()){
            if(freq[ch-'a']==1){
                index=s.indexOf(ch);
                break;
            }
        }
        return index;
    }
}