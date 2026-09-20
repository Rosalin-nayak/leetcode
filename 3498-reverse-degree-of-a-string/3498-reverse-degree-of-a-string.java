class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        int revIndex=26;
        HashMap<Character,Integer> map=new HashMap();
        for(char ch='a';ch<='z';ch++){
            map.put(ch,revIndex);
            revIndex--;
        }
        int i=1;
        for(char ch:s.toCharArray()){
            ans+=(map.get(ch) * i);
            i++;
        }
        return ans;
    }
}