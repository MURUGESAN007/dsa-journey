class Solution {
    public int maxScore(String s) {
        int zeroCount = 0;
        int totalOnes = 0;
        int onesCount = 0;
        int bestScore = Integer.MIN_VALUE;

        for(int n : s.toCharArray()){
            if(n == '1'){
                totalOnes++;
            }
        }

        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '0') zeroCount++;
            else onesCount++;

            int curScore  = zeroCount + (totalOnes - onesCount);
            bestScore = Math.max(curScore,bestScore);
        }
        return bestScore;
    }
}