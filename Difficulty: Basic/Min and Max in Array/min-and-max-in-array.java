class Solution {
    public int min(int arr[],int i,int min){
        if(i==arr.length){
            return min;
        }
        min=Math.min(min,arr[i]);
        i++;
        return min(arr,i,min);
    }
    public int max(int arr[],int i,int max){
         if(i==arr.length){
             return max;
         }
         max=Math.max(arr[i],max);
         i++;
         return max(arr,i,max);
         
    }
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        ArrayList<Integer>ls=new ArrayList<>();
        ls.add(min(arr,0,Integer.MAX_VALUE));
        ls.add(max(arr,0,Integer.MIN_VALUE));
        return ls;
    }
}
