class Solution {
    public String sortString(String s) {
        StringBuilder ans=new StringBuilder();
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        while(ans.length()<s.length()){
            for(int i=0;i<26;i++){
                if (freq[i] > 0) {
                    ans.append((char) ('a' + i));
                    freq[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (freq[i] > 0) {
                    ans.append((char) ('a' + i));
                    freq[i]--;
                }
            }
        }
        return ans.toString();
    }
}