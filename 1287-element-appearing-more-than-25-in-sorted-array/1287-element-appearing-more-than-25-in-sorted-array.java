class Solution {
   public static int findSpecialInteger(int[] a) {
        Map<Integer,Integer> map = new HashMap<>();
        int l = a.length;

        for(int i = 0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i],1);
            }
            else {
                map.put(a[i],map.get(a[i])+1);
            }
        }

       int max = -1;
        
        for(Integer i:map.keySet()){
            max = Math.max(max,map.get(i));
        }
        int ind = 0;
        for(Integer i : map.keySet()){
            if(max == map.get(i)){
                ind = i;
            }
        }
        
        return ind;
    }


}