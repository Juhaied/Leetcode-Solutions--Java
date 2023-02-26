class Solution {
      public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.remove(nums[i]);
            }
        }
        
        int ans = 0;
        
        for(Integer i : map.keySet()){
            ans = i;
        }
        
        return ans;
    }

}