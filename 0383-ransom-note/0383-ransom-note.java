class Solution {
      public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> m1 = new HashMap<>();
        HashMap<Character,Integer> m2 = new HashMap<>();

        char ch[] = ransomNote.toCharArray();

        for(int i = 0;i<ransomNote.length();i++){
            if(!m1.containsKey(ch[i])){
                m1.put(ch[i],1);
            }
            else {
                m1.put(ch[i],m1.get(ch[i])+1);
            }
        }

        char ch1[] = magazine.toCharArray();

        for(int i = 0;i<magazine.length();i++){
            if(!m2.containsKey(ch1[i])){
                m2.put(ch1[i],1);
            }
            else {
                m2.put(ch1[i],m2.get(ch1[i])+1);
            }
        }
        
        boolean flag = true;
        for(Character cc : m1.keySet()){
            if(m2.containsKey(cc)) {
                if (m2.get(cc) >= m1.get(cc)) {
                    continue;
                } else {
                    flag = false;
                    break;
                }
            }
            else {
                flag = false;
                break;
            }
        }

        return flag;
    }
}