class Solution {
    public static int[] twoSum(int[] a, int target) {
        int l = 0,r = a.length-1;

        int sum = 0;
        int i1 = 0,i2 = 0;
        while (l<r){
            sum=a[l]+a[r];

            if(sum==target){
                i1= l+1;
                i2 = r+1;
                break;
            }
            else if(sum<target){
                sum-=a[l];
                l++;
            }
            else {
                sum-=a[r];
                r--;
            }
        }

        int ret[] = {i1,i2};
        return ret;
    }
}