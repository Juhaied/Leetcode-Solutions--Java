class Solution {
    public static  int[] twoSum(int[] nums, int target) {
       int ans[] = new int[2];

       int a[] = Arrays.copyOf(nums,nums.length);

       Arrays.sort(a);

       int i = 0,j= nums.length-1;
       int val1 = 0,val2 = 0;
       while (i<j){
           int sum = a[i]+a[j];

           if(sum<target){
               i++;
           } else if (sum>target) {
               j--;
           }
           else {
               val1 = a[i];
               val2 = a[j];
               break;
           }
       }
       for(int i1 = 0;i1< nums.length;i1++){
           if(nums[i1] == val1){
               ans[0] = i1;
               break;
           }
       }
       
       for (int i1 = nums.length-1;i1>=0;i1--){
           if(nums[i1] == val2){
               ans[1] = i1;
               break;
           }
       }
       return ans;
    }



}