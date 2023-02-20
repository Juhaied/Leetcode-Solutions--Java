class Solution {
      public static boolean isPalindrome(String s) {
        s = s.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>='0' && s.charAt(i)<='9'){
                sb.append(s.charAt(i));
            }
        }

        String rev = sb.toString();

        if(isPalindrom(rev)){
            return true;
        }
        else {
            return false;
        }
    }
    private static boolean isPalindrom(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }
}