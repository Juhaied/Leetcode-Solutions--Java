class Solution {
    public String firstPalindrome(String[] words) {
        String ans= "";
        
        for(int i = 0;i< words.length;i++){
            if (isPalindrom(words[i])){
                ans = words[i];
                break;
            }
        }
        
        return ans;
    }
    

    private static boolean isPalindrom(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}