class Solution {
    public String truncateSentence(String s, int k) {
        ArrayList<String> words=new ArrayList();
        StringBuilder word=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(ch !=' '){
                word.append(ch);
            }else{
                words.add(word.toString());
                word.setLength(0);
            }
        }
        words.add(word.toString());
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(words.get(i));
            if (i != k - 1) {
                ans.append(" ");
            }
        }
        return ans.toString();
    }
}