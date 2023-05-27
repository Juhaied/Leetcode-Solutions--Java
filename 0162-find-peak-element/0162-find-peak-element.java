class Solution {
   public static int findPeakElement(int[] a) {
        int left = 0,right = a.length-1;
        int ind  = 0;
        while (left<right){
            int mid = left+(right-left)/2;

            if(a[mid]>a[mid+1]){
                right= mid;
            }
            else{
                left=mid+1;
            }
        }

        return left;

    }
}