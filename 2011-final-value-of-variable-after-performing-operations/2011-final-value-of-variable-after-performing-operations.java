class Solution {
    int X=0;
    public int finalValueAfterOperations(String[] operations) {
        for(String str: operations){
            if(str.equals("++X")||str.equals("X++")){
                X=X+1;
            }else{
                X=X-1;
            }
        }
        return X;
    }
}