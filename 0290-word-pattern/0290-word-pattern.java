class Solution {
   public boolean wordPattern(String pattern, String s) {
        String words[] = s.split(" ");

        if(words.length != pattern.length()) return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Boolean> map2 = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            char ch = pattern.charAt(i);

            if(!map1.containsKey(ch)){ // if the pattern character has not been mapped
                if(map2.containsKey(words[i]) == true){ 
                    return false; 
                }
                else{
                    map2.put(words[i], true); 
                    map1.put(ch, words[i]);
                }
            }
            else{
                
                String mwith = map1.get(ch);
               
                if(mwith.equals(words[i]) == false) return false;
            }
        }
        return true;
    }
}