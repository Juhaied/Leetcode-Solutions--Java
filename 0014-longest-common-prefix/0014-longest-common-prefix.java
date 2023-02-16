class Solution {
     public String longestCommonPrefix(String[] strs) {

        ArrayList<String> lst = new ArrayList();
        for (String s : strs) lst.add(s);
        Collections.sort(lst);
        String a = lst.get(0);
        String b = lst.get(lst.size() - 1);
        String res = "";

        for (int i = 0; i < Math.min(a.length(), b.length()); ++i) {
            if (a.charAt(i) == b.charAt(i)) res += a.charAt(i);
            else break;
        }
        return res;

    }
}