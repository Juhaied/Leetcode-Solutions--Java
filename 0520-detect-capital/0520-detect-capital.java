class Solution {
     public boolean detectCapitalUse(String word) {
        String s1 = word.toLowerCase();
        String s2 = word.toUpperCase();
        String s3 = word.substring(0,1).toUpperCase()+""+word.substring(1).toLowerCase();
        
        if(s1.equals(word)|| s2.equals(word)||s3.equals(word)){
            return true;
        }
        else {
            return false;
        }
    }

}