class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int max=0;
        int sum=0;
        for(int i=0;i<k;i++){
           sum+=arr[i];
        }
        max=Math.max(sum,max);
        int i=0,j=k;
        while(j<arr.length){
            sum+=arr[j];
            sum-=arr[i];
            max=Math.max(sum,max);
            j++;
            i++;
        }
        return max;
    }
}