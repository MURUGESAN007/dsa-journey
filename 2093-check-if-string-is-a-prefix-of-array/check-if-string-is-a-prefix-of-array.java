class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String s1 = "";
        for(String st : words){
            s1 += st;
            if(s1.equals(s)){
                return true;
            }
        }
        return false;
    }
}