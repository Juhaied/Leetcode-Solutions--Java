class Solution {
     public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();

        int copy[] = new int[nums.length];
        for (int i  = 0;i< nums.length;i++){
            copy[i] = nums[i];
        }
        Arrays.sort(copy);
       for (int i = 0;i<nums.length;i++) {
           if(!map.containsKey(copy[i])){
               map.put(copy[i], i);
           }
        }

       int a[] = new int[nums.length];

       for (int i = 0;i< nums.length;i++){
           a[i] = map.get(nums[i]);
       }

       return a;
    }
}