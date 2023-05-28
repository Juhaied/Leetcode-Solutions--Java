class Solution {
   public static int[] kthSmallestPrimeFraction(int[] arr, int k) {
       int n = arr.length;
       ArrayList<Double> list = new ArrayList<>();
       for(int i = 0;i<n;i++){
           for (int j = i+1;j<n;j++){
               list.add((double) ((arr[i]*100)/(arr[j]*100.0)));
           }
       }

       //debug(list);

       Collections.sort(list);
       //debug(list);

        double val = list.get(k-1);

       // debug(val);
       int a[] = new int[2];

        for(int i = 0;i<n;i++){
            for (int j = i+1;j<n;j++){
                double div = (arr[i]*100)/(arr[j]*100.0);

                if(div==val){
                    a[0] = arr[i];
                    a[1] = arr[j];
                    //debug(div);
                    break;
                }
            }
        }
       return a;
    }
}