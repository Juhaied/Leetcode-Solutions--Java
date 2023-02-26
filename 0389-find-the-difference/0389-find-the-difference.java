class Solution {
   public static char findTheDifference(String s, String t) {
        char c1[] =s.toCharArray();
        char c2[] = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        char ans = c2[c2.length-1];

        for(int i = 0;i<s.length();i++){
            if(c1[i] !=c2[i]){
                ans = c2[i];
                break;
            }
        }

        return ans;
    }
}