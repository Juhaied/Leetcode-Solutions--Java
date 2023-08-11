class Solution {
    public static int[] answerQueries(int[] a, int[] queries) {
        Arrays.sort(a);

        long pref[] = new long[a.length];

        pref[0] = a[0];

        for (int i = 1;i<a.length;i++){
            pref[i] = pref[i-1]+a[i];
        }

        for (int i = 0;i< queries.length;i++){
            int val = findLower(pref,queries[i]);
            if(val ==-1){
                queries[i] = 0;
            }
            else {
                queries[i] = val+1;
            }
        }

        return queries;

    }
    static int findLower(long a[] ,int x) { // immdeiate smaller value will be print
        int left  = 0,right = a.length-1, pos = -1;;

        while(left<=right) {
            int mid  = left+ (right-left)/2;

            if(a[mid]<=x) {
                pos  = mid;
                left = mid+1;
            }
            else {
                right  = mid  -1;
            }

        }
        return pos;
    }
}