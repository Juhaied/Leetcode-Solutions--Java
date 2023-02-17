class Solution {
    public static int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i<cost.length;i++){
            stk.add(cost[i]);
        }
        

        int sum  = 0,cnt = 0;

        while (!stk.isEmpty()){
            cnt++;
            int v = stk.pop();
            if(cnt==3){
                cnt =0;
            }
            else {
                sum+=v;
            }
        }

        return sum;
    }
}