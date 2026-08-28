class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
        int fast = 0;
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow!=fast);       
        int temp = 0;
        while(temp!=fast){
            temp = nums[temp];
            fast=nums[fast];
        }
        return temp;
    }
}