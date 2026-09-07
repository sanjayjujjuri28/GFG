class Solution {
    static int nthEvenFibonacci(int n) {
        int f=0;
        int s=1;
        int i=0;
        while(true){
            int ans=f+s;
            if(ans%2==0){
                i++;
            }
            f=s;
            s=ans;
            if(i==n){
                return ans;
            }
        }
        
    }
}