class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxwcount=0;int prevcount=0;int wordcount=0;
        for(String sentence:sentences){
            int count=0;
            for(char ch:sentence.toCharArray()){
                if(ch==' '){
                    count++;
                }
            }
            prevcount=wordcount;
            wordcount=count+1;
            maxwcount=Math.max(maxwcount,wordcount);
        }
        return maxwcount;
    }
}