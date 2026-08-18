class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        ArrayList<Integer>ls=new ArrayList<>();
        HashSet<Integer>hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        for(int i=low;i<=high;i++){
            if(!hs.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}