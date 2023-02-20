class Solution {
     public String generateTheString(int n) {
        String str="";
        if(n % 2==0){
            for(int i =1;i<n;i++){
                str+="a";
            }
            str+="b";
        }
        else {
            for(int i = 1;i<=n;i++){
                str+="a";
            }
        }
        
        return str;
    }
}