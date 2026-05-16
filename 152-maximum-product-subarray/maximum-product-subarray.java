class Solution {
    public int maxProduct(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int sum = 1;
            for(int j=i;j<nums.length;j++){
                sum *= nums[j];
                maxSum = Math.max(maxSum,sum);
            }
        }
        return maxSum;
    }
}