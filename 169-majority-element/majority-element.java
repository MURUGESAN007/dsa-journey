class Solution {
    public int majorityElement(int[] nums) {
        int max=0,ans = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int n : nums){
            map.put(n,map.getOrDefault(n,0) + 1);
            if(map.get(n) > max){
                ans = n;
                max = Math.max(max,map.get(n));
            }
        }
        return ans;
    }
}