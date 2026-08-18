class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> arr=new ArrayList<>();
        int n=rowIndex+1;
        for(int i=0;i<n;i++){
            List<Integer> list=new ArrayList<>();
            for(int j=0;j<=i;j++){
                list.add(1);
            }
            arr.add(list);
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    arr.get(i).set(j,1);
                }else{
                    int val=arr.get(i-1).get(j)+arr.get(i-1).get(j-1);
                    arr.get(i).set(j,val);
                }
            }
        }

        return arr.get(rowIndex);
    }
}