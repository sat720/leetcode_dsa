class Solution {
    public String removeStars(String s) {
        char[] str = s.toCharArray();
        int ch = 0;
        int skip = 0;
        while(skip != s.length()){
            if(s.charAt(skip) == '*'){
                ch--;
                skip++;
            }
            else{
                str[ch] = str[skip];
                skip++;
                ch++;
            }
        }   
        if(ch == 0){
            return "";
        }
        return new String(str,0,ch);
    }
}