class Solution {
    static int sum(int n,int k){
        if(n==0){
            return k;
        }
        k+=n%10;
        return sum(n/10,k);
    }
    static int sumOfDigits(int n) {
        // code here
        return sum(n,0);
    }
}
