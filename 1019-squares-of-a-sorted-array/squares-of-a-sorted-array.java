class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int k=nums.length-1;
        int res[] = new int[k+1];
        while(i<=j){
            int isqr = nums[i] * nums[i];
            int jsqr = nums[j] * nums[j];
            if(isqr>jsqr){
                res[k] = isqr;
                i++;
            }else{
                res[k] = jsqr;
                j--;
            }
            k--;
        }
        return res;
    }
}