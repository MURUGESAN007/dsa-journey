class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> tMap = new HashMap<>();
        for(char c : t.toCharArray()){
            tMap.put(c,tMap.getOrDefault(c,0) + 1);
        }
        Map<Character,Integer> sMap = new HashMap<>();
        int count = t.length(),left = 0;
        int minlen = Integer.MAX_VALUE;
        String ans = "";
        for(int right=0;right<s.length();right++){
            char rc = s.charAt(right);
            sMap.put(rc,sMap.getOrDefault(rc,0) + 1);
            if(tMap.containsKey(rc) && sMap.get(rc) <= tMap.get(rc)){
                count--;
            }
            while(count == 0){
                if(right-left+1 < minlen){
                    minlen = right-left+1;
                    ans = s.substring(left,right+1); 
                }
                char lc = s.charAt(left);
                sMap.put(lc,sMap.get(lc) - 1);
                if(tMap.containsKey(lc) && sMap.get(lc) < tMap.get(lc)){
                    count++;
                }
                left++;
            }
        }
        return ans;
    }
}