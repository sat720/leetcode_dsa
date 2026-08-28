class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        for(String log:logs){
            if(log.equals("../")){
                count--;
                if(count< 0){
                    count = 0;
                }
            }
            else if(log.equals("./")){
                count+=0;
            }
            else{
                count++;
            }
        }
        return count;
    }
}