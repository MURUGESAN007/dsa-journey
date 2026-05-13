class Solution {
    public int numberOfSubstrings(String s) {
        int sfreq[] = new int[3];
        int count = 0,left = 0;
        for(int right=0;right<s.length();right++){
            sfreq[s.charAt(right) - 'a']++;
            while(sfreq[0]>0 && sfreq[1]>0 && sfreq[2]>0){
                count += s.length()-right;
                sfreq[s.charAt(left) - 'a']--;
                left++;
            }
        }
        return count;
    }
}