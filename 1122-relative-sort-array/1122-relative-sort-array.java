class Solution {
   public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer> m1 = new HashMap<>();

        int a[] = new int[arr1.length];
        for(int i = 0;i< arr1.length;i++){
            if(!m1.containsKey(arr1[i])){
                m1.put(arr1[i], 1);
            }
            else {
                m1.put(arr1[i],m1.get(arr1[i])+1);
            }
        }
        ArrayList<Integer> l = new ArrayList<>();

        for(int i = 0;i< arr2.length;i++){
            int v = m1.get(arr2[i]);

            while (v-->0){
                l.add(arr2[i]);
            }
        }
        ArrayList<Integer> not  = new ArrayList<>();

        HashMap<Integer,Integer> m2 = new HashMap<>();

        for(int i = 0;i< arr2.length;i++){
            m2.put(arr2[i],1 );
        }
        for(int i = 0;i< arr1.length;i++){
            if(!m2.containsKey(arr1[i])){
                not.add(arr1[i]);
            }
        }

        Collections.sort(not);

        a = new int[l.size()+not.size()];
        ArrayList<Integer> answer  = new ArrayList<>();

        for(int i = 0;i<l.size();i++){
            answer.add(l.get(i));
        }
        for(int i = 0;i<not.size();i++){
            answer.add(not.get(i));
        }

        for(int i = 0;i< answer.size();i++){
            a[i] = answer.get(i);
        }

       
        return a;
    }
}