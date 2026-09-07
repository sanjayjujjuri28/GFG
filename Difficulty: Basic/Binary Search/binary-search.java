class Solution {
    public boolean bs(int arr[],int k,int l,int h){
        if(l>h){
            return false;
        }
        int mid=l+(h-l)/2;
        if(arr[mid]==k){
            return true;
        }
        if(arr[mid]>k){
            return bs(arr,k,l,mid-1);
        }
        else{
            return bs(arr,k,mid+1,h);
        }
    }
    public boolean binarySearch(int[] arr, int k) {
        // code here
        return bs(arr,k,0,arr.length-1);
    }
}