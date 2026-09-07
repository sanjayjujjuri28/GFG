class Solution {
    int pow(int n,int p,int ans){
        if(p==0){
            return ans;
        }
        ans=ans*n;
        p--;
        return pow(n,p,ans);
    }
    public int recursivePower(int n, int p) {
        // code here
        return pow(n,p,1);
    }
}
