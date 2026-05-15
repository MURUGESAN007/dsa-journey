class Solution {
    public int largestAltitude(int[] gain) {
        int ans = 0,prefixsum = 0;
        for(int n : gain){
            prefixsum += n;
            if(prefixsum > ans){
                ans = prefixsum;
            }
        }
        return ans;
    }
}