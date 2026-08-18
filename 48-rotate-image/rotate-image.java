class Solution {
    public void rotate(int[][] a) {

        for(int i=0;i<a.length;i++){
            for(int j=0;j<=i;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }

        for(int i=0;i<a.length;i++){
            int start=0;
            int end=a[0].length-1;
            while(start<=end){
                int temp=a[i][start];
                a[i][start]=a[i][end];
                a[i][end]=temp;
                start++;
                end--;
            }
        }
    }
}