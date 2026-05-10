class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0,Maximum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            Maximum=Math.max(sum,Maximum);
            if(sum < 0){
                sum = 0;
            }
        }
        return Maximum;
    }
}