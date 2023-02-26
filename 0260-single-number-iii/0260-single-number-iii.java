class Solution {
    public static int[] singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        
        ArrayList<Integer> l = new ArrayList<>();
        for(Integer i : map.keySet()){
            int v = map.get(i);

            if(v==1){
                l.add(i);
            }
        }
        
        int ans[] = new int[l.size()];
        
        for(int i = 0;i<l.size();i++){
            ans[i] = l.get(i);
        }

        return ans;
    }

}