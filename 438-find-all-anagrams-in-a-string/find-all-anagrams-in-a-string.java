class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new LinkedList<>();
        int[] pFreq = new int[26];
        int[]  sFreq= new int[26];

        for(char c : p.toCharArray()){
            pFreq[c - 'a']++;
        }
        int left = 0;
        for(int right=0;right<s.length();right++){
            sFreq[s.charAt(right) - 'a']++;
            if(right-left+1 > p.length()){
                sFreq[s.charAt(left) - 'a']--;
                left++;
            }
            boolean isMatch = true;
            for(int i=0;i<26;i++){
                if(pFreq[i] != sFreq[i]){
                    isMatch=false;
                    break;
                }
            }
            if(isMatch){
                li.add(left);
            }
        }
        return li;
    }
}