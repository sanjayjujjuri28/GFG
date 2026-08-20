class Solution {
    static List<Integer> firstNegInt(int nums[], int k) {
        // code here
        List<Integer>ans=new ArrayList<>();
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=0;i<k;i++){
            if(nums[i]<0){
                ls.add(i);
            }
        }
        if(!ls.isEmpty()){
            ans.add(nums[ls.get(0)]);
        }
        else{
            ans.add(0);
        }
        int i=0;
        for(int j=k;j<nums.length;j++){
            if(nums[j]<0){
                ls.add(j);
            }
            if(nums[i]<0){
                ls.remove(0);
            }
            if(!ls.isEmpty()){
              ans.add(nums[ls.get(0)]);
               }
            else{
              ans.add(0);
             }
            i++;
        }
        return ans;
    }
}