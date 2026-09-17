class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length()) return false;
        HashMap<Character,Integer> map=new HashMap();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                int freq=map.get(ch);
                map.put(ch,freq+1);
            }else map.put(ch,1);
        }
        for(char ch:t.toCharArray()){
            if(!map.containsKey(ch)) return false;
            int freq=map.get(ch);
            if(freq==0) return false;
            map.put(ch,freq-1);
        }
        return true;
    }
}