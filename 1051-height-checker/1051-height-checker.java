class Solution {
     public int heightChecker(int[] a) {
        int exp[] = new int[a.length];
        for (int i = 0;i<a.length;i++){
            exp[i] = a[i];
        }
        
        Arrays.sort(exp);
        
        int cnt = 0;
        
        for(int i = 0;i<exp.length;i++){
            if(a[i] != exp[i]){
                cnt++;
            }
        }
        
        return cnt;
    }

}