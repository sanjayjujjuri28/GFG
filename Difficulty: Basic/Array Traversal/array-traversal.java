class Solution {
    public static int  print(int arr[],int i){
        if(i==arr.length){
            return 0;
        }
        System.out.print(arr[i]+" ");
        i++;
        return print(arr,i);
    }
    public static void arrayTraversal(int[] arr) {
        // Code here
        print(arr,0);
    }
}
