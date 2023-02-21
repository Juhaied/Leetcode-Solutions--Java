class Solution {
   public static boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();
     
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i)=='['){
                stk.push(s.charAt(i));
            }
            else {
                if(!stk.isEmpty()) {
                    char pop = stk.pop();

                    if (pop == '(' && s.charAt(i) == ')') {
                        continue;
                    } else if (pop == '{' && s.charAt(i) == '}') {
                        continue;
                    } else if (pop == '[' && s.charAt(i) == ']') {
                        continue;
                    } else {
                        stk.push(s.charAt(i));
                        break;
                    }
                }
                else {
                    return false;
                }
            }
        }


        if(stk.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }

}