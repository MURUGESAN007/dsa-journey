class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        int ans = Integer.MAX_VALUE;
        for(int n : nums1){
            set.add(n);
        }
        for(int n : nums2){
            if(set.contains(n)){
                ans = Math.min(ans,n);
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}