class Solution {
    public List<List<Integer>> generate(int n){
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if(j==0||j==i){
                    ans.get(i).add(j,1);
                }else{
                    ans.get(i).add(j,ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
                
            }
        }
        return ans;
    }
}