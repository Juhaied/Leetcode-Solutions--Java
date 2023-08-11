class Solution {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> map = new HashMap<>();
        boolean flag = false;
        for (int i = 0;i< nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else {
                int val = i - map.get(nums[i]);

                if(val<=k){
                    flag = true;
                    break;
                }

                map.put(nums[i],i);
            }
        }

        return flag;
    }
}