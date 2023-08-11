class Solution {
   public int maximumCount(int[] nums) {
        int nc = 0,pc = 0;
        
        for (int i :nums){
            if(i>0){
                pc++;
            }
            else if(i<0){
                nc++;
            }
        }
        
        return Math.max(nc,pc);
    }
}