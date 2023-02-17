class Solution {
 public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list= new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for(int i = 0;i< arr.length-1;i++){
            min = Math.min(min,arr[i+1]-arr[i]);
        }

        for(int i = 0;i< arr.length-1;i++){
            int v = arr[i+1]-arr[i];
            if(v==min){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }

        return list;

    } 
}