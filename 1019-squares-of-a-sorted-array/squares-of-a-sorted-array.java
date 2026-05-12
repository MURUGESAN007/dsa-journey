class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums [i] = square(nums[i]);
        }
        Arrays.sort(nums);
        return nums;
    }
    private int square(int n){
        return Math.abs(n) * Math.abs(n);
    }
}