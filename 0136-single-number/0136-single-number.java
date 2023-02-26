class Solution {
     public int singleNumber(int[] nums) {
       int sum = 0;
       HashSet<Integer> set = new HashSet<>();
       for(int i = 0;i<nums.length;i++){
           sum+=nums[i];
           set.add(nums[i]);
       }
       
       ArrayList<Integer> list = new ArrayList<>(set);
       int total = 0;
       for (int i = 0;i< list.size();i++){
           total += (list.get(i)*2);
       }
       
       return total-sum;
    }

}