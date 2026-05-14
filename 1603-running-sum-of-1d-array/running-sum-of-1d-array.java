class Solution {
    public int[] runningSum(int[] nums) {
        int res[] = new int[nums.length];
        int prefixsum = 0;
        for(int i=0;i<nums.length;i++){
            prefixsum += nums[i];
            res[i] = prefixsum;
        }
        return res;
    }
}