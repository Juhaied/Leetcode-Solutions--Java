class Solution {
    public String capitalizeTitle(String title) {
       String[] splitedTitle = title.split(" ");
        String result = "";

        for (int i = 0; i < splitedTitle.length; i++) {
            splitedTitle[i] = splitedTitle[i].toLowerCase();
            
            if (splitedTitle[i].length() <= 2) {
                result += splitedTitle[i] + " ";
                continue;
            }
             else {
                splitedTitle[i] = splitedTitle[i].substring(0, 1).toUpperCase() + splitedTitle[i].substring(1);

                result += splitedTitle[i] + " ";
            }
        }
        return result.trim();
    }
}