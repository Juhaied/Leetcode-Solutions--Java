class Solution {
    public static int pivotIndex(int[] a) {
        int ind = -1;

        int sum = 0;

        for(int i = 0;i<a.length;i++){
            sum+=a[i];
        }
        int left = 0;
        for(int i = 0;i<a.length;i++){
            sum-=a[i];

            if(left==sum){
                ind = i;
                break;
            }
            left+=a[i];
        }

        return ind;
    }
}