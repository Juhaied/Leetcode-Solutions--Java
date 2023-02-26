class Solution {
    
   public static List<String> removeAnagrams(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        Stack<String> stk = new Stack<>();

        for(int i = 0;i< words.length;i++){
            String s = words[i];

            char ch[] =s.toCharArray();

            Arrays.sort(ch);

            String new_string = new String(ch);

            if(!stk.isEmpty()) {
                if (!(stk.peek().equals(new_string))) {
                    stk.add(new_string);
                    list.add(s);
                }
            }
            else {
                stk.add(new_string);
                list.add(s);
            }
        }

    
        return list;
    }


}