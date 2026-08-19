class Solution {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer>ls=new ArrayList<>();
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<k;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ls.add(map.size());
        int i=0,j=k;
        while(j<arr.length){
           map.put(arr[j],map.getOrDefault(arr[j],0)+1);
           if(map.get(arr[i])==1){
               map.remove(arr[i]);
           }
           else{
               map.put(arr[i],map.get(arr[i])-1);
           }
           ls.add(map.size());
           i++;
           j++;
        }
        return ls;
    }
}