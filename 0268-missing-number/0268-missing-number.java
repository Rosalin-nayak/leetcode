class Solution {
    public int missingNumber(int[] arr) {
        int n=arr.length;
        int i=0;
        while(i<n){
            if(arr[i]==i||arr[i]==n){
                i++;
            }else{
                int idx=arr[i];
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return n;
    }
}