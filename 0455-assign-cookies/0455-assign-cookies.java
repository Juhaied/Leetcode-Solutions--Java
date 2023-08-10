class Solution {
     public static int findContentChildren(int[] g, int[] s) {
       Arrays.sort(g);
       Arrays.sort(s);

       int i = 0, j = 0;
       int cnt  = 0;
       
       while (i< g.length && j<s.length){
           if(g[i]<=s[j]){
               cnt++;
               i++;
           }
           j++;
       }
       
       return cnt;
    }
}