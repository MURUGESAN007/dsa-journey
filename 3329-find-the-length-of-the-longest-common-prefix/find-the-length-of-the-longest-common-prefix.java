class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<Integer> prefix = new HashSet<>();
        for(int n : arr1){
            int x = n;
            while(x > 0){
                prefix.add(x);
                x /= 10;
            }
        }

        int ans = 0;
        for(int n : arr2){
            int x = n;
            int len = digits(n);

            //Check from larger to smaller
            while(x > 0){
                if(prefix.contains(x)){
                    ans = Math.max(ans,len);
                    break;
                }
                x /= 10;
                len--;
            }
        }
        return ans;
    }
    public int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num /= 10;
        }
        return count;
    }
}
