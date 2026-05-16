class Solution {
    public int maxProduct(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int prefix = 1,sufix = 1;
        for(int i=0;i<nums.length;i++){
            
            if(prefix == 0) prefix =1;
            if(sufix == 0) sufix =1;

            prefix *= nums[i];
            sufix *= nums[nums.length - i - 1];

            maxSum = Math.max(maxSum,(Math.max(prefix,sufix)));
        }
        return maxSum;
    }
}