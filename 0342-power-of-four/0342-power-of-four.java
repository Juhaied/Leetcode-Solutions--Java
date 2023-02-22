class Solution {
    public static boolean isPowerOfFour(int n) {

        if(n<=0) return false;
        while (n !=1){
            if(n%4!=0){
                break;
            }
            else {
                n/=4;
            }
        }

        return n==1;
    }

}