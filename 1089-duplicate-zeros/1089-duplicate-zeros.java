class Solution {
      public static void duplicateZeros(int[] arr) {
        int length  = arr.length;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0;i<length;i++){
            if(list.size()!=length){
                int val = arr[i];

                if(val==0){
                    if(list.size()!=length){
                        list.add(0);
                        if(list.size()!=length){
                            list.add(0);
                        }
                    }
                }
                else{
                    if (list.size()!=length){
                        list.add(val);
                    }
                }
            }
            else {
                break;
            }
            
            
        }
       
        for(int i = 0;i< list.size();i++){
            arr[i] = list.get(i);
        }


    }
}