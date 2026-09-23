class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder a=new StringBuilder();
        StringBuilder b=new StringBuilder();
        int i=0;
        for(char ch:s.toCharArray()){
            if(i<s.length()/2){
                a.append(ch);
            }else{
                b.append(ch);
            }
            i++;
        }
        String aStr=a.toString(); String bStr=b.toString();
        int counta=0; int countb=0;
        for(char ch:aStr.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                counta++;
            }
        }
        for(char ch:bStr.toCharArray()){
            if("aeiouAEIOU".indexOf(ch)!=-1){
                countb++;
            }
        }
        return counta==countb;
    }
}