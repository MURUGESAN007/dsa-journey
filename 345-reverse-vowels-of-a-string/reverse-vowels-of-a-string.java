class Solution {
    public String reverseVowels(String s) {
        char arr[] = s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<r){
            if(isVowel(arr[l]) && isVowel(arr[r])){
                char t = arr[l];
                arr[l] = arr[r];
                arr[r] = t;
                l++;
                r--;
            }
            else if(!isVowel(arr[l])){
                l++;
            }
            else if(!isVowel(arr[r])){
                r--;
            }
        }
        return new String(arr);
    }
    public boolean isVowel(char c){
        return "aeiouAEIOU".contains(String.valueOf(c))? true:false;
    }

}