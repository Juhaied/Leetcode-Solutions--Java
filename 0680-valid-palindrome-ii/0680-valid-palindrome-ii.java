class Solution {
 public static boolean validPalindrome(String s) {
        int j = s.length()-1;
        String s1 ="";
        String s2 ="";
        for(int i = 0;i<=j;i++){
            if(s.charAt(i)!=s.charAt(j)){
                s1=s.substring(0,i)+""+s.substring(i+1);
                s2=s.substring(0,j)+""+s.substring(j+1);

                break;
            }
            else {
                j--;
            }
        }

        if(isPalindrom(s1)||isPalindrom(s2)){
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