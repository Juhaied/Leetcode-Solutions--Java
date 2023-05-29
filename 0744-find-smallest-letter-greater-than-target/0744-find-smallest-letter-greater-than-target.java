class Solution {
 public static char nextGreatestLetter(char[] letters, char target) {
       int left  = 0,right =  letters.length-1,pos = -1;

       while (left<=right){
           int mid = left+(right-left)/2;

           if(letters[mid]>target){
               pos = mid;
               right = mid-1;
           }
           else {
               left = mid+1;
           }
       }

        if(pos != -1) {
            return letters[pos];
        }
        return letters[0];
    }

}