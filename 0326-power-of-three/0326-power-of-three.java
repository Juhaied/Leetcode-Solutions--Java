class Solution {
     public static boolean isPowerOfThree(int n) {
        if(n<=0) return false;
        while (n !=1){
            if(n%3!=0){
                break;
            }
            else {
                n/=3;
            }
        }

        return n==1;
    }
}