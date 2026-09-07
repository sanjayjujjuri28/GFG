class Solution {
    static int hcf(int a,int b){
        if(b%a==0){
            return a;
        }
        int temp=b%a;
        return hcf(temp,a);
    }
    public static int gcd(int a, int b) {
        // code here
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        return hcf(min,max);
    }
}
