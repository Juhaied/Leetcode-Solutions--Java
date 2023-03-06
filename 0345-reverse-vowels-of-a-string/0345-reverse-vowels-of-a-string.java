class Solution {
   public static String reverseVowels(String s) {
    Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
    char[] chars = s.toCharArray();
    int i = 0, j = s.length() - 1;
    while (i < j) {
        if (vowels.contains(chars[i]) && vowels.contains(chars[j])) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        } else if (vowels.contains(chars[i])) {
            j--;
        } else if (vowels.contains(chars[j])) {
            i++;
        } else {
            i++;
            j--;
        }
    }
    return new String(chars);
}

}