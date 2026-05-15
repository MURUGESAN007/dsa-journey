class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int prefixsum = 0;
        int count = 0;
        for(int i=0;i<nums.length;i++){
            prefixsum += nums[i];
            int target = prefixsum - goal;
            if(map.containsKey(target)){
                count += map.get(target);
            }
            map.put(prefixsum,map.getOrDefault(prefixsum,0) + 1);
        }
        return count;
    }
}