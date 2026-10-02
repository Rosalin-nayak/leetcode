class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()>t.length()) return false;
        int sp=0,tp=0;
        while(sp<s.length() && tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;
                tp++;
            }else{
                tp++;
            }
        }
        if(sp<s.length()){
            return false;
        }
        return true;
    }
}