class Solution {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character,Character> map = new HashMap<>();
        boolean flag = true;
        if(s.length()!=t.length()){
            return false;
        }
        else{
            for(int i = 0;i<s.length();i++){
                char a = s.charAt(i),b = t.charAt(i);

                if(map.containsKey(a)){
                    if(map.get(a).equals(b)){
                        continue;
                    }
                    else {
                        return false;
                    }
                }
                else {
                    if(!map.containsValue(b)){
                        map.put(a,b);
                    }
                    else {
                        return false;
                    }
                }
              
            }
            return true;
        }
    }

}