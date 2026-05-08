class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new LinkedList<>();
        Map<Character,Integer> s2Map = new HashMap<>();
        Map<Character,Integer> windowMap = new HashMap<>();
        for(Character c : p.toCharArray()){
            s2Map.put(c,s2Map.getOrDefault(c,0) + 1);
        }
        int left = 0;
        for(int right=0;right<s.length();right++){
            char rc = s.charAt(right);
            windowMap.put(rc,windowMap.getOrDefault(rc,0) + 1);
            if(right-left+1 > p.length()){
                char lc = s.charAt(left);
                windowMap.put(lc,windowMap.get(lc) - 1);
                if(windowMap.get(lc) == 0){
                    windowMap.remove(lc);
                }
                left++;
            }
            if(windowMap.equals(s2Map)){
                li.add(left);
            }
        }
        return li;
    }
}