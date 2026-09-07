class Solution {
    public int helper(int n,int rev){
        if(n==0){
            return rev;
        }
        rev=(rev*10)+(n%10);
        n=n/10;
        return helper(n,rev);
    }
    public int reverseDigits(int n) {
        // Code here
        return helper(n,0);
    }
}