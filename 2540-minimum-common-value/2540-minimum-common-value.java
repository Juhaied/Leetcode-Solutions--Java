class Solution {
     public int getCommon(int[] nums1, int[] nums2) {
       
            int ans = -1;
            Map<Integer,Integer> map = new HashMap<>();

            for (int i:nums2){
                map.put(i,1);
            }

            for (int i : nums1){
                if(map.containsKey(i)){
                    ans = i;
                    break;
                }
            }

            return ans;
        
    }
    
}