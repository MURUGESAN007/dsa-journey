class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        if(nums.length == 0) return 0;
        for(int i=1;i<nums.length;i++){
            if(nums[j-1] != nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}