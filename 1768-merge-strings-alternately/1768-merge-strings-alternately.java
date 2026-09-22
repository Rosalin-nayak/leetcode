class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int w1=word1.length(),w2=word2.length();
        int i=0;
        while(i<w1||i<w2){
            if(i<w1){
                ans.append(word1.charAt(i));
            }
            if(i<w2){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
}