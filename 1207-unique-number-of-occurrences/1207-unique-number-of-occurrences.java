class Solution {
   public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int v = arr[i];
            
            if(!map.containsKey(v)){
                map.put(v,1);
            }
            else {
                map.put(v,map.get(v)+1);
            }
        }
        
        HashSet<Integer>s1 = new HashSet<>();
        HashSet<Integer> s2 = new HashSet<>();
        
        for(Integer i :map.keySet()){
            s1.add(i);
            s2.add(map.get(i));
        }
        
        return s1.size()==s2.size();
    }
}