class Solution {
    public int longestSubarray(int[] nums) {
        int zeros = 0,left = 0,ans = 0;
        for(int right=0;right<nums.length;right++){
            if(nums[right] == 0){
                zeros++;
            }
            while(zeros > 1){
                if(nums[left] == 0){
                    zeros--;
                }
                left++;
            }
            ans = Math.max(ans,right-left+1-zeros);
        }
        return ans==nums.length ? nums.length-1 : ans;
    }
}