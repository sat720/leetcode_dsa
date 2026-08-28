class Solution {
    public boolean backspaceCompare(String s, String t) {
        int skip1 = 0;
        int skip2 = 0;
        int front1 = s.length()-1;
        int front2 = t.length()-1;
        while(front1>=0||front2>=0){
            while(front1 >= 0){
                if(s.charAt(front1) == '#'){
                    skip1++;
                    front1--;
                }
                else if(skip1 > 0){
                    skip1--;
                    front1--;
                }
                else{
                    break;
                }
            }
            while(front2>=0){
                if(t.charAt(front2) == '#'){
                    skip2++;
                    front2--;
                }
                else if(skip2 > 0){
                    skip2--;
                    front2--;
                }
                else{
                    break;
                }
            }
            if(front1 >=0 && front2>=0 && s.charAt(front1) != t.charAt(front2)){
                return false;
            }
            if((front1 >= 0)!=(front2 >= 0)){
                return false;
            }
            front1--;
            front2--;
        }
        return true;
    }
}