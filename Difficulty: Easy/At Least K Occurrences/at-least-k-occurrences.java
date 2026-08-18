
class Solution { 
    public int firstElementKTime(int[] arr, int k) { 
      
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < arr.length; i++) {
           
            int count = map.getOrDefault(arr[i], 0) + 1;
            map.put(arr[i], count);

            if (count == k) {
                return arr[i];
            }
        }

        return -1; 
    } 
}
