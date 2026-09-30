class Solution {
    private int convert(int num){
        int res = num ^ (num >> 1);
        return res;
    }
    public List<Integer> grayCode(int n) {
        List<Integer> l = new ArrayList<>();
        for(int i = 0 ; i < Math.pow(2,n) ; i++){
            l.add(convert(i));
        }
        return l;
    }
}