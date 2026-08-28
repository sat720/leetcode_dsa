class Solution {
    public void sortColors(int[] nums) {
        int zeroes = 0;
        int ones = 0;
        int twos = nums.length - 1;
        if(nums.length == 1){
            return;
        }
        while(ones <= twos){
            if(nums[ones] == 0){
                int ot = nums[ones];
                nums[ones] = nums[zeroes];
                nums[zeroes] = ot;
                zeroes++;
                ones++;
            }
            else if(nums[ones] == 1){
                ones++;
            }
            else if(nums[ones] == 2){
                int tt = nums[ones];
                nums[ones] = nums[twos];
                nums[twos] = tt;
                twos--;
            }
        }
        return ;
    }
}