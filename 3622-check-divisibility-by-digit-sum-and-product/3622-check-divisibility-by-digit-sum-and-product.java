class Solution {
    public boolean checkDivisibility(int n) {
        int digitsum=0;
        int digitproduct=1;
        int m=n;
        while(m!=0){
            int ld=m%10;
            m=m/10;
            digitsum+=ld;
            digitproduct*=ld;
        }
        int num=digitsum+digitproduct;
        if(n%num==0){
            return true;
        }
        return false;
    }
}